package UI;

import java.util.Scanner;

import entidades.*;

public class Principal {
	
	static Scanner lector;
	

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		Empleado[] empleados = new Empleado[3];
			
		System.out.println("CARGA DE EMPLEADOS");
		for (int i = 0; i < empleados.length; i++) {
			System.out.println("1) Administrativo    2) Vendedor");
			if (Integer.parseInt(lector.nextLine()) == 1) {
				
				Administrativo a = new Administrativo();
				cargaDatosComunes(a);
				
				System.out.println("Ingrese cantidad de horas extra: ");
				a.setHsExtra(Integer.parseInt(lector.nextLine()));
				
				System.out.println("Ingrese cantidad de horas del mes: ");
				a.setHsMes(Integer.parseInt(lector.nextLine()));
				
				empleados[i] = a;
	
			} else {
				
				Vendedor v = new Vendedor();
				cargaDatosComunes(v);
				
				System.out.println("Ingrese cantidad total de ventas: ");
				v.setTotalVentas(Float.parseFloat(lector.nextLine()));
				System.out.println("Ingrese porcentaje de comisión: ");
				v.setPorcenComision(Float.parseFloat(lector.nextLine()));
				
				empleados[i] = v;
	
			}
		}
		
		System.out.println("LISTA DE EMPLEADOS"
		+ "\n  Puesto     DNI      Nombre y Apellido      Sueldo");
		for (int i = 0; i < empleados.length; i++) {
			System.out.println(empleados[i].mostrarDatos());
		}
		
		lector.close();
		
	}
	
	public static void cargaDatosComunes(Empleado e) {
		@SuppressWarnings("resource")
		Scanner lector = new Scanner(System.in);
		
		System.out.println("DNI: ");
		e.setDni(lector.nextLine());
		System.out.println("Nombre: ");
		e.setNombre(lector.nextLine());
		System.out.println("Apellido: ");
		e.setApellido(lector.nextLine());
		System.out.println("Email: ");
		e.setEmail(lector.nextLine());
		System.out.println("Sueldo Base: ");
		e.setSueldoBase(Integer.parseInt(lector.nextLine()));
		
	}
	
	
	
	
	
	

}
