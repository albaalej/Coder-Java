
import com.realetech.objetos.Clientes;

public class Main {

	public static void main(String[] args) {
		Clientes unCliente = new Clientes();
		
		unCliente.setNombre("Alejandro");
		unCliente.setApellido("Alba");
		unCliente.setMatricula(35320257);
		unCliente.setMail("alejandro.alba@gmail.com");
		
		unCliente.nuevoUsuario();
		unCliente.modificarUsuario();
		unCliente.eliminarUsuario();
		
		
	}

}
