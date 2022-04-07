package entidades;

import entidades.Empleado;

public class Administrativo extends Empleado {
	private int hsExtra;
	private int hsMes;
	
	public float getHsExtra() {
		return hsExtra;
	}
	public void setHsExtra(int hsExtra) {
		this.hsExtra = hsExtra;
	}
	public float getHsMes() {
		return hsMes;
	}
	public void setHsMes(int hsMes) {
		this.hsMes = hsMes;
	}
	
	public Administrativo() {}
	
	public Administrativo(String dni, String nombre, String apellido,float sueldoBase,int hsExtra, int hsMes) {
		super(dni,nombre,apellido,sueldoBase);
		this.setHsExtra(hsExtra);
		this.setHsMes(hsMes);
	}
	
	public String mostrarDatos() {
		return "Administrativo "+ super.mostrarDatos();
	}
	
	public double getSueldo() {
		return this.getSueldoBase() * ((this.getHsExtra() * 1.5) + this.getHsMes()) / this.getHsMes();
	}
	
	

}
