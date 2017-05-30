package cl.bci.poc;

import cl.bci.poc.to.ClienteTO;

public class Inicio {

	public static void main(String[] args) {

		System.out.println("HolaMundo");
		System.out.println("ESGFDEGFD");
		System.out.println("Este es mi segundo cambio");
		System.out.println("Este es un cambio en la rama de eclipse");

		ClienteTO cliente = new ClienteTO();
		cliente.setDireccion("Direccion 1");
		cliente.setEdad(30);
		cliente.setNombre("Ricardo");
	}

}
