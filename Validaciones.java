public class Validaciones {
	public String nombreMayusculas(String nombre) {
		String regex = "[A-Z]+( [A-Z]+)*";
		while (true) {
			if (nombre.matches(regex))
				return nombre;
			System.out.println("Error!, ingrese un NOMBRE con mayuscula cerrada");
			nombre = Formulario.scanner.nextLine();
		}
	}

	public String nombrePrimeraMayuscula(String nombre) {
		String regex = "[A-Z][a-z]+( [A-Z][a-z]+)*";
		while (true) {
			if (nombre.matches(regex))
				return nombre;
			System.out.println("Error!, ingrese un Nombre con la primera letra en mayúscula");
			nombre = Formulario.scanner.nextLine();
		}
	}

	public String correo(String correo) {
		String regex = "^[a-zA-Z0-9_+&*-]+(\\.[a-zA-Z0-9_+&*-]+)*@([a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,3}$";
		while (true) {
			if (correo.matches(regex))
				return correo;
			System.out.println("Error!, ingrese un correo");
			correo = Formulario.scanner.nextLine();
		}
	}

	public String telefono(String telefono) {
		String regex = "^([+][0-9]{1,3} )?[0-9]{2,15}$";
		while (true) {
			if (telefono.matches(regex))
				return telefono;
			System.out.println("Error!, ingrese un teléfono +### ########");
			telefono = Formulario.scanner.nextLine();
		}
	}

	public String fecha(String fecha) {
		String regex = "[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}";
		while (true) {
			if (fecha.matches(regex))
				return fecha;
			System.out.println("Error!, ingrese su fecha de nacimiento dd/mm/aaaa");
			fecha = Formulario.scanner.nextLine();
		}
	}

	public String usuario(String usuario) {
		String regex = "[a-zA-Z0-9_]{3,16}";
		while (true) {
			if (usuario.matches(regex))
				return usuario;
			System.out.println("Error!, ingrese un usuario");
			usuario = Formulario.scanner.nextLine();
		}
	}

	public String clave(String clave) {
		String regex = "[a-zA-Z0-9_@#$%&*]{8,32}";
		while (true) {
			if (clave.matches(regex))
				return clave;
			System.out.println("Error!, ingrese una clave");
			clave = Formulario.scanner.nextLine();
		}
	}

	public String cedula(String cedula) {
		String regex = "^\\d-\\d{1,4}-\\d{1,5}$";
		while (true) {
			if (cedula.matches(regex))
				return cedula;
			System.out.println("Error!, ingrese una cédula #-####-#####");
			cedula = Formulario.scanner.nextLine();
		}
	}

	public String seguroSocial(String seguroSocial) {
		String regex = "^\\d{2}-\\d{2}-\\d{2}-\\d{4}-\\d$";
		while (true) {
			if (seguroSocial.matches(regex))
				return seguroSocial;
			System.out.println("Error!, ingrese un seguro social ##-##-##-####-#");
			seguroSocial = Formulario.scanner.nextLine();
		}
	}

	public String tarjetaCredito(String tarjetaCredito) {
		String regex = "^\\d{4}-\\d{4}-\\d{4}-\\d{4}$";
		while (true) {
			if (tarjetaCredito.matches(regex))
				return tarjetaCredito;
			System.out.println("Error!, ingrese una tarjeta de crédito ####-####-####-####");
			tarjetaCredito = Formulario.scanner.nextLine();
		}
	}
}
