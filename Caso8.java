package com.senati.eti;

import java.util.Scanner;
public class Caso8 {

	public static void main(String[] args) {
		
		Scanner resul = new Scanner(System.in);
		
		int num1 =0; 
		
		System.out.print("Ingresa el Lado: ");
		num1 = resul.nextInt();
		
		
		int Area = (int) Math.pow(num1, 2);
		
		int Perimetro = 4*num1;
		
		System.out.println("-----------------");
		System.out.println("  Resultado  ");
		System.out.println("-----------------");
		System.out.println("El Área es:    " + Area);
		System.out.println("El Perimetro es:"+ Perimetro);

	}

}
