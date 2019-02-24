import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		//creamos un objeto nuevo de tipo cuenta
		
		Cuenta cuenta = new Cuenta("Amancio ortega");
		
		//encapsular un objeto dentro de otro
		Usuario amancio = new Usuario(1, "Amancio", "Ortega", cuenta);
		Usuario amancio2 = new Usuario(2, "Amancio2", "Ortega", cuenta);
		Usuario amancio3 = new Usuario(3, "Amancio3", "Ortega", cuenta);
		
		Sucursal sucursal = new Sucursal(1,"MI CALLE sin numero");
		
		sucursal.getUsuarios().add(amancio);
		sucursal.getUsuarios().add(amancio2);
		sucursal.getUsuarios().add(amancio3);
		
		Usuario resultado = sucursal.obtenerUsuarioPorID(3);
		
		if (resultado != null)System.out.println(resultado.toString());
	
		
		
		//llamamos al objeto amancio de la clase usuario y acomo tenemos vinculada la clase cuenta con el objeto cuenta podemos
		//devolver lo que contiene cuenta y usar sus metodos.
		/*
		amancio.getCuenta().ingresar(500.00);
		
		amancio.getCuenta().mostrarPosicionGlobal();
		
		System.out.println("Lista de Usuarios");
		
		Sucursal sucursal = new sucursal();
		
		*/
		
		/*
		//utilizar metodos de la clase cuenta con el objeto cuenta creado
		
		//ingresamos
		cuenta.ingresar(1000000.00);
		
		//mostramos total en cuenta
		cuenta.mostrarPosicionGlobal();
		
		
		//retiramos
		cuenta.retirar(500.00);
		
		//mostramos posicionglobal otra vez despues de retirar
		
		cuenta.mostrarPosicionGlobal();
		
		*/
		
		
		

	}

}
