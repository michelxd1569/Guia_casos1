package com.senati.eti;
import java.util.*;
import java.text.*;

public class Caso15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat sr = new DecimalFormat("#.00");
		
		System.out.println("------------------------");
		System.out.print("Ingrese la cantidad:  ");
		float num1 = sc.nextFloat();
		System.out.print("InGrese el precio:  ");
		float num2 = sc.nextFloat();
		System.out.println("---------------------------");
		float importe = num1 * num2;
		
		float Monto_Dolares = importe / 3.24f;
		float Monto_Euro = importe / 3.75f;
		
		System.out.println("------------------");
		
		System.out.println("   RESULTADO");
		
		System.out.println("---------------------------------------------");
		System.out.println("EL importe en Soles es: " + importe);
		System.out.println("EL monto en dolares es : " + sr.format(Monto_Dolares));
		System.out.println("EL monto en Euro es : " + sr.format(Monto_Euro));
		System.out.println("------------------------------------------");
		
	}

}
