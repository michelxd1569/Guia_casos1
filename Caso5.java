package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		
		float num1 =0, num2 =0;
		
		System.out.print("Ingresa el Primer Número: ");
		num1 = sr.nextFloat();
		System.out.print("Ingrese el Segundo Número: ");
		num2 = sr.nextFloat();
		
		//Aplicar un Cast: un tipo de dato a otro
		float promedio = (num1 + num2)/ 2; 
		float Resul1 = num1 + ((num1*20)/100); // num1*1.20f
		float Resul2 = num2 - ((num2*30)/100); // num2*0.7f
		// float resul2= (float) num1 *1.2
		System.out.println("Resultados:");
		System.out.println("----------------");
		System.out.println("Promedio: -----"+ promedio);
		System.out.println("Respuesta 1:----" + Resul1);
		System.out.println("Respuesta 2: ---" + Resul2);
		
		
		
				

	}

}
