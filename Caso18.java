package com.senati.eti;
import java.util.*;
public class Caso18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("La Base: \n");
		int base = sc.nextInt();
		System.out.println("La altura: \n");
		int altura = sc.nextInt();
		
		float resultado = base * altura/2;
		
		System.out.println("--------------------");
		System.out.println("   RESULTADO ");
		System.out.println("--------------------");
		
		System.out.println("El area del triangulo es: " + resultado );
	}

}
