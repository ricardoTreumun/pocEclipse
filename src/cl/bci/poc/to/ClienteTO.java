package cl.bci.poc.to;

public class ClienteTO {

	private String nombre;
	private String direccion;
	private int edad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

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
