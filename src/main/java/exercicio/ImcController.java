package exercicio;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/imc")
public class ImcController  extends HttpServlet {
	
	@Override
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		//Prepara para a execu��o.
		String alturaStr = request.getParameter("altura");
		String pesoStr = request.getParameter("peso");

		if( pesoStr == null || alturaStr == null || pesoStr == "" || alturaStr == ""){
			pesoStr = "0";
			alturaStr = "0";
		}
				
		alturaStr = alturaStr == "0" ? "1" : alturaStr;
				
		float peso = Float.valueOf(pesoStr);
		float altura = Float.valueOf(alturaStr);
						
		//Executa "regras de neg�cio".
		ImcModel ImcModel = new ImcModel(altura,peso);
		String resultado = ImcModel.resultado();
		
		//Passa a v�ri�vel para a p�gina JSP.
		request.setAttribute("resultado", resultado);
		//Chama p�gina JSP.
		request.getRequestDispatcher("index.jsp").
			forward(request, response);

	}
}
