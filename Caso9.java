package com.senati.eti;
import java.util.Scanner;
public class Caso9 {

	public static void main(String[] args) {
		
		Scanner result = new Scanner(System.in);
		
		float num1 = 0, num2 =0;
		
		System.out.print("Ingrese el primer Lado: ");
		
		num1 = result.nextFloat();
		System.out.print("Ingrese el segundo Lado: ");
		num2 = result.nextFloat();
		
		float area = num1 * num2;
		float perimetro = 2*(num1 + num2);
		
		System.out.println("----------------------");
		System.out.println("   Resultado    ");
		System.out.println("----------------------");
		System.out.println("El Area es:    "   + area);
		System.out.println("El perimetro es:  " + perimetro);
		
		
		

	}

}
