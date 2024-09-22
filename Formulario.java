import java.util.Scanner;

/**
 * Formulario
 */
public class Formulario {

	public static Scanner scanner = new Scanner(System.in);

	private String nombre;
	private String nombrePrimeraMayuscula;
	private String correo;
	private String telefono;
	private String fecha;
	private String usuario;
	private String clave;
	private String cedula;
	private String seguroSocial;
	private String tarjetaCredito;

	public static void main(String[] args) {
		new Formulario();
	}

	Formulario() {
		bienvenida();
		while (true) {
			if (!deseaCrearCuenta()) {
				despedida();
				scanner.close();
				System.exit(0);
			}
			crearCuenta();
			System.out.println();
			mostrarCuentaCreada();
			System.out.println();
		}
	}

	private void crearCuenta() {
		Validaciones validacion = new Validaciones();
		System.out.println("Por favor, ingrese su NOMBRE con mayúsculas cerradas");
		nombre = scanner.nextLine();
		nombre = validacion.nombreMayusculas(nombre);

		System.out.println("Por favor, ingrese su Nombre con la primera letra en mayúscula");
		nombrePrimeraMayuscula = scanner.nextLine();
		nombrePrimeraMayuscula = validacion.nombrePrimeraMayuscula(nombrePrimeraMayuscula);

		System.out.println("Por favor, ingrese su correo");
		correo = scanner.nextLine();
		correo = validacion.correo(correo);

		System.out.println("Por favor, ingrese su teléfono +### ########");
		telefono = scanner.nextLine();
		telefono = validacion.telefono(telefono);

		System.out.println("Por favor, ingrese su fecha de nacimiento dd/mm/aaaa");
		fecha = scanner.nextLine();
		fecha = validacion.fecha(fecha);

		System.out.println("Por favor, ingrese su usuario");
		usuario = scanner.nextLine();
		usuario = validacion.usuario(usuario);

		System.out.println("Por favor, ingrese su clave");
		clave = scanner.nextLine();
		clave = validacion.clave(clave);

		System.out.println("Por favor, ingrese su cédula #-####-#####");
		cedula = scanner.nextLine();
		cedula = validacion.cedula(cedula);

		System.out.println("Por favor, ingrese su seguro social ##-##-##-####-#");
		seguroSocial = scanner.nextLine();
		seguroSocial = validacion.seguroSocial(seguroSocial);

		System.out.println("Por favor, ingrese su tarjeta de crédito ####-####-####-####");
		tarjetaCredito = scanner.nextLine();
		tarjetaCredito = validacion.tarjetaCredito(tarjetaCredito);
	}

	private void mostrarCuentaCreada() {
		System.out.println("Cuenta creada exitosamente");
		System.out.println("NOMBRE: " + nombre);
		System.out.println("Nombre: " + nombrePrimeraMayuscula);
		System.out.println("Correo: " + correo);
		System.out.println("Teléfono: " + telefono);
		System.out.println("Fecha: " + fecha);
		System.out.println("Usuario: " + usuario);
		System.out.println("Clave: " + clave);
		System.out.println("Cédula: " + cedula);
		System.out.println("Seguro social: " + seguroSocial);
		System.out.println("Tarjeta de crédito: " + tarjetaCredito);
	}

	private void bienvenida() {
		System.out.println("Bienvenido a la creación de una cuenta");
		System.out.println("Desarrollado por @RicardoSanjur");
	}

	private void despedida() {
		System.out.println("Gracias por usar la creación de una cuenta");
		System.out.println("Hasta pronto!!");
	}

	private boolean deseaCrearCuenta() {
		while (true) {
			System.out.println("Desea crear una cuenta? (s/n)");
			String respuesta = scanner.nextLine();
			if (respuesta.equals("s") || respuesta.equals("n"))
				return respuesta.equals("s");

			System.out.println("Por favor, responda 's' o 'n' \n");
		}
	}

}