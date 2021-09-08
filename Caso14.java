package com.senati.eti;
import java.util.Scanner;
public class Caso14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cs = new Scanner(System.in);
		
		System.out.print("Ingrese un número: ");
		int num1 = cs.nextInt();
		
		int resultado = num1 * (num1 + 1) / 2;
		
		System.out.println("-----------------");
		System.out.println("     RESULTADO!");
		System.out.println("-----------------");
		
		System.out.println("La suma es:  " + resultado);
				

	}

}
