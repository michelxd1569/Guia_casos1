package com.senati.eti;
//Importar la libreria para lectura o el (input)
import java.util.Scanner;
public class Caso2 {

	public static void main(String[] args) {
		// Instancia a la clase Scanner
		Scanner ingreso = new Scanner(System.in);
		
		int x = 0 ;
		System.out.print("Ingrese numero: ");
		
		x = ingreso.nextInt();  // es como el input()
		System.out.println("--------------------");
		System.out.println("El numero es: "+ x);
		
	}

}
