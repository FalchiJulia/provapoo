package provaPOO1;

public class Circulo {
	
	double raio;
	
	
	public Circulo (double raio) {
		this.raio = raio;
	}
	
	
	
	public void setRaio(double raio) {
		this.raio = raio;	
	}
	
	public double getRaio(double raio) {
		return raio;
	}
	
	public double Area (double raio) {
		double area;
		area = Math.PI*Math.pow(raio, 2);
		return area;
	}
	
	public double Perimetro (double raio) {
		double perimetro;
		perimetro = 2*Math.PI*raio;
		return perimetro;
	}



public static void main(String[] args) {

	Circulo bola1 = new Circulo (3);
	
	double ola = bola1.Area(3);
	System.out.println(ola);
	double ola1 = bola1.Perimetro(3);
	System.out.println(ola1);

}
}





