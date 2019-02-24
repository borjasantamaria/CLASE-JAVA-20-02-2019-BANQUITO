
public class Usuario {
	
	private int id;
	private String nombre;
	private String apellidos;
	private Cuenta cuenta;
	
	
	public Usuario(int id, String nombre, String apellidos, Cuenta cuenta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cuenta = cuenta;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public Cuenta getCuenta() {
		return cuenta;
	}


	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", cuenta=" + cuenta.toString() + "]";
	}
	
	
	
	
	
	

	
	
	
	
	
	

}
