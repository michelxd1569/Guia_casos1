package com.senati.eti;
import java.util.*;
public class Caso19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Lado 1: ");
		int lado1 = sc.nextInt();
		System.out.print("Lado 2: ");
		int lado2 = sc.nextInt();
		System.out.print("Lado 3: ");
		int lado3 = sc.nextInt();
		int perimetro = lado1 + lado2 + lado3;
		System.out.println("--------------------");
		System.out.println(" RESULTADO");
		System.out.println("--------------------");
		System.out.println("El perimetro del triangulo es: " + perimetro);
		
	}

}
