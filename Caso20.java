package com.senati.eti;
import java.util.*;
import java.text.*;
public class Caso20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat sr = new DecimalFormat("#.00");
		System.out.print("Costo de la venta: ");
		float num1 = sc.nextFloat();
		
		float num2 = num1*1.42f;
		float num3 = num1*0.42f;
		
		System.out.println("---------------------");
		System.out.println("   Resultados");
		System.out.println("---------------------");
		System.out.println("El 42% de, " + num1 + " es "+ sr.format(num3));
		System.out.println("El valor de la venta más el 42% es " + sr.format(num2) );
		
		
		
	}

}
