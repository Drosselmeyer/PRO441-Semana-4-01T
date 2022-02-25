package sv.edu.udb.ejemplo1;

import javax.swing.*;

public class Ejemplo1 {
	public static void main(String[] args) {
		// Declaramos las variables
		double num1, num2, resultado=0;
		String opcion;
		int continuar = 0;

		JOptionPane.showMessageDialog(null,
				"Bienvenid@ al programa calculadora");

		do {
			num1 = Double.parseDouble(
						JOptionPane.showInputDialog(null,
						"Ingrese el primer número")
					);
	
			num2 = Double.parseDouble(
						JOptionPane.showInputDialog(null,
						"Ingrese el segundo número")
					);
	
			opcion = JOptionPane.showInputDialog(null,
					 "Ingrese la opcion que desea realizar (+,-,*,/)");
			
			switch(opcion) {			
				case "+":
					resultado = suma(num1,num2);
					break;
				case "-":
					resultado = resta(num1,num2);
					break;
				case "*":
					resultado = multiplicacion(num1,num2);
					break;
				case "/":
					resultado = division(num1,num2);
					break;
				default:
					error();
					break;
			}
	
			JOptionPane.showMessageDialog(null,
					"El resultado es: "+String.format("%.2f", resultado));
			
			continuar = JOptionPane.showConfirmDialog(null,
						"¿Desea continuar?","Continuar",
						JOptionPane.YES_NO_OPTION);
			
			System.out.println(continuar);
			
		}while(continuar==0);
	}
	
	public static double suma(double a, double b) {
		JOptionPane.showMessageDialog(null,
				"Función que sumara los numeros: "+a+" y "+b);
		
		return (a+b);
	}
	
	public static double resta(double a, double b) {
		JOptionPane.showMessageDialog(null,
				"Función que restara los numeros: "+a+" y "+b);
		
		return (a-b);
	}
	
	public static double multiplicacion(double a, double b) {
		JOptionPane.showMessageDialog(null,
				"Función que multiplicara los numeros: "+a+" y "+b);
		
		return (a*b);
	}
	
	public static double division(double a, double b) {
		JOptionPane.showMessageDialog(null,
				"Función que dividira los numeros: "+a+" y "+b);
		
		while(b==0) {
			b =  Double.parseDouble(
					JOptionPane.showInputDialog(null,
							"Ingrese nuevamente el segundo numero"));
		}
		
		return (a/b);
	}
	
	public static void error(){
		JOptionPane.showConfirmDialog(null,
				"La opcion seleccionada no es valida");
	}
}
