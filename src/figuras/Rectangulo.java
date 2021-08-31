package figuras;

public class Rectangulo {

	private double ancho, alto;

	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}
	
	public double perimetro() {
		return this.ancho * 2 + this.alto * 2;
	}
}
