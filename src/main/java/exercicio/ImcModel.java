package exercicio;

public class ImcModel {
	private double altura;
	private double peso;
	
	public ImcModel(double altura, double peso) {
		this.altura = altura;
		this.peso = peso;
	}
	

	public double calculo() {
		return (peso/(altura*altura));
	}

	public String resultado() {
		if(calculo()<18.5){
			return "Você está magro com esse indice: " +calculo();
		}
		else if(calculo()>=18.5 && calculo()<24.9){
			return "Você está normal com esse indice: " +calculo();
		}
		else if(calculo()>=24.9 && calculo()<29.9) {
			return "Você está com sobre peso com esse indice: " +calculo();
		}
		else if(calculo()>=29.9 && calculo()<39.9) {
			return "Você está com obesidade com esse indice: " +calculo();
		}
		else if (calculo()>39.9) {
			return "Você está com obesidade grave com esse indice: " +calculo();
		}
		return null;
	}
}
