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

		//Prepara para a execução.
		String alturaStr = request.getParameter("altura");
		String pesoStr = request.getParameter("peso");

		if( pesoStr == null || alturaStr == null || pesoStr == "" || alturaStr == ""){
			pesoStr = "0";
			alturaStr = "0";
		}
				
		alturaStr = alturaStr == "0" ? "1" : alturaStr;
				
		float peso = Float.valueOf(pesoStr);
		float altura = Float.valueOf(alturaStr);
						
		//Executa "regras de negócio".
		ImcModel ImcModel = new ImcModel(altura,peso);
		String resultado = ImcModel.resultado();
		
		//Passa a váriável para a página JSP.
		request.setAttribute("resultado", resultado);
		//Chama página JSP.
		request.getRequestDispatcher("index.jsp").
			forward(request, response);

	}
}
