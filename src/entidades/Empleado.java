package entidades;

import java.util.Scanner;

public abstract class Empleado {
	private String dni;
	private String nombre;
	private String apellido;
	private String email;
	private float sueldoBase;
	
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(float sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	public Empleado() {}

//	 Método constructor:
//	public Empleado(String dni, String nombre, String apellido, float sueldoBase) {
//		this.setDni(dni);
//		this.setNombre(nombre);
//		this.setApellido(apellido);
//		this.setSueldoBase(sueldoBase);
//	}
	
	public static void cargaDatos(Empleado e) {
		
		Scanner lector = new Scanner(System.in);
		
		System.out.print("Ingrese DNI: ");
		e.setDni(lector.nextLine());
		
		System.out.print("Ingrese nombre: ");
		e.setNombre(lector.nextLine());
		
		System.out.print("Ingrese apellido: ");
		e.setApellido(lector.nextLine());
		
		System.out.print("ingrese email: ");
		e.setEmail(lector.nextLine());
		
		System.out.print("ingrese sueldoBase: ");
		e.setSueldoBase(Integer.parseInt(lector.nextLine()));
		
		lector.close();
	}
	
	
	public abstract double getSueldo();
	
	
	public String mostrarDatos() {
		return this.getDni() +" - "+this.getNombre() +" "+ this.getApellido()+" - "+ "$"+ this.getSueldo();
	}
	
	
	
	
	
	
	
	
}
