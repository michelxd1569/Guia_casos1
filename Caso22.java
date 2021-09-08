package com.senati.eti;
import java.util.*;

public class Caso22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nota 1: ");
		int nota1 = sc.nextInt();
		System.out.print("Nota 2: ");
		int nota2 = sc.nextInt();
		System.out.print("Nota 3: ");
		int nota3 = sc.nextInt();
		
		float promedio = nota1*0.2f + nota2*0.3f + nota3 * 0.5f;
		
		System.out.println("---------------------------");
		System.out.println("   RESULTADO");
		System.out.println("---------------------------");
		
		System.out.println("El promedio es: " + promedio);
	}

}
