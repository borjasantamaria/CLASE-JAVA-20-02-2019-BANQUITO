
public class Cuenta {
	
	private String titular;
	private double posicionGlobal;
	
	//constructor
	
	public Cuenta(String titular) {
		super();
		this.titular = titular;
	}

	
	//metodos getter y setters para manejar las variables privadas de la clase
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getPosicionGlobal() {
		return posicionGlobal;
	}

	public void setPosicionGlobal(double posicionGlobal) {
		this.posicionGlobal = posicionGlobal;
	}
	
	
	//metodos 
	
	public void ingresar(double cantidad) {
		
		if (cantidad > 0 )this.posicionGlobal=posicionGlobal+cantidad;
		else System.out.println("No se permite el ingreso en negativos");
	}
	
	public void retirar(double cantidad) {
		
		if(cantidad > 0)this.posicionGlobal=posicionGlobal-cantidad;
		else System.out.println("No se puede retirar 0 o cantidades negativas");
	}
	
	public void mostrarPosicionGlobal() {
		
		System.out.println("La posicion de la cuenta "+this.titular+" es: "+this.posicionGlobal);

	}


	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", posicionGlobal=" + posicionGlobal + "]";
	}
	
	
	
	
	
	
	
	

}
