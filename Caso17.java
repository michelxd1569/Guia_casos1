package com.senati.eti;
import java.util.*;
import java.text.*;
public class Caso17 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat sr = new DecimalFormat("0.01");
		System.out.print("Numero de Aprobados: ");
		float aprobados = sc.nextFloat();
		System.out.print("Numero de Desaprobados: ");
		float desaprobados = sc.nextFloat();
		
		System.out.print("Numero de Retirados: ");
		float retirado = sc.nextFloat();
		float suma = aprobados + desaprobados + retirado;
		
		float num1 = aprobados*100f/suma;
		float num2 = desaprobados*100f/suma;
		float num3 = retirado *100f/suma;
		System.out.println("---------------------------");
		System.out.println("  RESULTADOS");
		System.out.println("---------------------------");
		System.out.println("Aprobados: " + sr.format(num1)+"%");
		System.out.println("Desaprobados: " + sr.format(num2)+"%");
		System.out.println("Retirados: " + sr.format(num3)+"%");
		
		
	}
}
