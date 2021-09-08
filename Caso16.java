package com.senati.eti;
import java.util.*;
import java.text.DecimalFormat;
public class Caso16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat sr = new DecimalFormat("#.00");
		System.out.print("Ingrese las Horas Trabajadas: ");
		int num1 = sc.nextInt();
		System.out.print("Ingrese Tarifa por hora: ");
		float tarifa = sc.nextFloat();
		
		float sueldo = num1 * tarifa;
		float bono = sueldo * 0.05f;
		float total = sueldo + bono;
		float Dolar = total / 3.24f;
		
		System.out.println("-------------------");
		System.out.println(" RESULTADO");
		System.out.println("-------------------");
		
		System.out.println("El sueldo es:--- " + sueldo);
		System.out.println("El Bono es:----- " + bono);
		System.out.println("El Total es:---- " + total);
		System.out.println("Total en Dolares es: " + sr.format(Dolar));
		

	}

}
