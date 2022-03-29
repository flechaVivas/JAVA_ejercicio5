package entidades;

import entidades.Empleado;

public class Vendedor extends Empleado{
	float porcenComision;
	float totalVentas;
	
	
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
	
	public Vendedor(float porcenComision, float totalVentas) {
		super(dni,nombre,apellido,sueldoBase);

	}
	
}
