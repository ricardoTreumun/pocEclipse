package cl.bci.poc.to;

public class ClienteTO {

	private String nombre;
	private String direccion;
	private int edad;
	
	/**
	 * To String de la clase.
	 */
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClienteTO [nombre=");
		builder.append(nombre);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", edad=");
		builder.append(edad);
		builder.append("]");
		return builder.toString();
	}

	

}
