package com.senati.eti;
import java.util.Scanner;
public class Caso10 {

	public static void main(String[] args) {

		Scanner resul = new Scanner(System.in);
		
		float radio = 0;
		
		System.out.print("Ingrese el Radio: ");
		radio = resul.nextFloat();
		
		double Area = (double) 3.1416f * Math.pow(radio, 2);
		
		double Perimetro =(double) 2 * 3.1416f * radio;
		
		System.out.println("-------------------------");
		System.out.println("    Resultados: ");
		System.out.println("-------------------------");
		
		System.out.println("El Area es:     " +  Area);
		System.out.println("El Perimetro es:  "+  Perimetro);
		
		
		
		
		
		
		
	}

}
