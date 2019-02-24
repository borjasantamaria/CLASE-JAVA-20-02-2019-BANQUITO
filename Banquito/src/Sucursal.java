import java.util.ArrayList;
import java.util.List;

public class Sucursal {
	
	private int id;
	private String direccion;
	private List<Usuario> usuarios;
	
	public Sucursal(int id, String direccion) {
		super();
		this.id = id;
		this.direccion = direccion;
		this.usuarios = new ArrayList<>();
	}
	
	public Usuario obtenerUsuarioPorID(int id) {
		
		for (Usuario usuario : this.usuarios) { 
			
			if(usuario.getId() == id) {
				
				System.out.println("Usuario encontrado:");
				return usuario;
				
			} 
			
		}
		System.out.println("El usuario no existe en esta sucursal");
		
		return null;
	}
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public String toString() {
		return "Sucursal [id=" + id + ", direccion=" + direccion + ", usuarios=" + usuarios + "]";
	}
	 
	
	
	/*
	private List<Usuario> ListaUsuario = new ArrayList<>();

	public Sucursal(Long id, String direccion, List<Usuario> listaUsuario) {
		super();
		this.id = id;
		this.direccion = direccion;
		ListaUsuario = listaUsuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Usuario> getListaUsuario() {
		return ListaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		ListaUsuario = listaUsuario;
	}
	
	
	
	public void devolver(Long idconsulta, List<Usuario> lista){
		
		
			for (Usuario usuario : lista) {
				if (idconsulta == id)System.out.println("este es el usuario: "+usuario.toString());
				
			}
		

		
	}
	*/
	

}
