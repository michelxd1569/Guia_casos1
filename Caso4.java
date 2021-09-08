package com.senati.eti;

import java.util.Scanner;
public class Caso4 {

	public static void main(String[] args) {
		
		Scanner ingreso = new Scanner(System.in);
		
		float num1 = 0 , num2=0;
		
		System.out.print("Ingrese El primer numero: ");
		num1 = ingreso.nextFloat();
		System.out.print("Ingrese el segundo numero: ");
		num2 = ingreso.nextFloat();
		
		float suma = num1 + num2;
		float resta = num1 - num2 ;
		float Cociente = num1 / num2;
		float Resto = num1 % num2;
		float producto = num1 * num2;
		System.out.println("\nResultados");
		System.out.println("---------------------");
		System.out.println("La Suma es:--- " + suma);
		System.out.println("La resta es:---" + resta);
		System.out.println("El producto es:-"+ producto);
		System.out.println("El cociente es:-"+ Cociente);
		System.out.println("El Resto es:-- " + Resto);
		
		
		
	}

}
