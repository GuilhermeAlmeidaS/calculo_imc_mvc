package exercicio;

public class ImcModel {
	private float altura;
	private float peso;
	
	public ImcModel(float altura, float peso) {
		this.altura = altura;
		this.peso = peso;
	}
	
	public float calculo() {
		 return (peso/(altura*altura));
		 
		
	}
	
	public String resultado() {
		if(calculo()<18.5 && calculo()>0){
			return "Voc� est� magro com esse indice: " +calculo();
		}
		else if(calculo()>=18.5 && calculo()<24.9){
			return "Voc� est� normal com esse indice: " +calculo();
		}
		else if(calculo()>=24.9 && calculo()<29.9) {
			return "Voc� est� com sobre peso com esse indice: " +calculo();
		}
		else if(calculo()>=29.9 && calculo()<39.9) {
			return "Voc� est� com obesidade com esse indice: " +calculo();
		}
		else if (calculo()>39.9) {
			return "Voc� est� com obesidade grave com esse indice: " +calculo();
		}
		else if (calculo()==0.0) {
			return "Digite sua altura e seu peso e veja aqui o resultado!";
		}
		return null;
	}
}
