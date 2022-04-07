package entidades;

import entidades.Empleado;

public class Vendedor extends Empleado{
	private float porcenComision;
	private float totalVentas;
	
	
	public float getPorcenComision() {
		return porcenComision;
	}
	public void setPorcenComision(float porcenComision) {
		this.porcenComision = porcenComision;
	}
	public float getTotalVentas() {
		return totalVentas;
	}
	public void setTotalVentas(float totalVentas) {
		this.totalVentas = totalVentas;
	}
	
	public Vendedor() {}
	
	public Vendedor(String dni, String nombre, String apellido, float sueldoBase, float porcenComision, float totalVentas) {
		super(dni,nombre,apellido,sueldoBase);
		this.setPorcenComision(porcenComision);
		this.setTotalVentas(totalVentas);

	}
	
	public double getSueldo() {
		return this.getSueldoBase() + (this.getPorcenComision()*this.getTotalVentas()/100);
	}
	
	public String mostrarDatos() {
		return "Vendedor "+ super.mostrarDatos();
	}
	
	
	
}
