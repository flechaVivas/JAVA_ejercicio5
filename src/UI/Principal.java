package UI;

import java.util.Scanner;

import entidades.*;

public class Principal {
	
	static Scanner lector;

	public static void main(String[] args) {
		
		String[] empleados = new String[3];
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("CARGA DE EMPLEADOS");
		for (int i = 0; i < empleados.length; i++) {
			System.out.println("1) Administrativo    2) Vendedor");
			if (Integer.parseInt(lector.nextLine()) == 1) {
				
				Administrativo a = new Administrativo();
				cargaDatos(a);
				
				System.out.println("Ingrese cantidad de horas extra: ");
				a.setHsExtra(Integer.parseInt(lector.nextLine()));
				
				System.out.println("Ingrese cantidad de horas del mes: ");
				a.setHsMes(Integer.parseInt(lector.nextLine()));
	
			} else {
				
				Vendedor v = new Vendedor();
				cargaDatos(v);
				
				v.setTotalVentas(Float.parseFloat(lector.nextLine()));
				v.setPorcenComision(Float.parseFloat(lector.nextLine()));
				
				
				
				
				
			}
		}
		
		lector.close();
		
	}
	
	public static void cargaDatos(Empleado e) {
		System.out.print("Ingrese DNI: ");
		e.setDni(Integer.parseInt(lector.nextLine()));
		
		System.out.print("Ingrese nombre: ");
		e.setNombre(lector.nextLine());
		
		System.out.print("Ingrese apellido: ");
		e.setApellido(lector.nextLine())
		
		System.out.print("ingrese email: ");
		e.setEmail(lector.nextLine());
		
		System.out.print("ingrese sueldoBase: ");
		e.setSueldoBase(Integer.parseInt(lector.nextLine()));
	}
	
	
	

}
