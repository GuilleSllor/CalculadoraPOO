package ExamenCalculadora;

import java.util.Scanner;


public class  Menu extends Numeros {

	public static void menu() {
		int menu = 0;
		double num1=0,num2 = 0;
		boolean salir = false;
		while (salir==false) {
			String sino="";
			if(sino.equals("si")) {salir = true;}
			System.out.println("Bienvenido a la calculadora CICE/n/n");
			System.out.println("\n\n ¿Que operacion quieres realizar?");
			System.out.println("________________________________");
			System.out.println("|                               |");
			System.out.println("|  OPERACIONES                  |");
			System.out.println("|                               |");
			System.out.println("|   1.Suma                      |");
			System.out.println("|   2.Resta                     |");
			System.out.println("|   3.Multiplicar               |");
			System.out.println("|   4.Dividir                   |");
			System.out.println("|   5.Resto                     |");
			System.out.println("|   6.Exponencial               |");
			System.out.println("|   7.Salir                     |");
			System.out.println("|                               |");
			System.out.println("|                               |");
			System.out.println("|                               |");
			System.out.println("|                               |");
			System.out.println("|_______________________________|\n\n\n");
			
			menu=new Scanner(System.in).nextInt();
			
			switch (menu) {
			case 1 -> Numeros.suma(num1,num2);
			case 2 -> Numeros.resta(num1,num2);
			case 3 -> Numeros.multiplicacion(num1, num2);
			case 4 -> Numeros.division(num1,num2);
			case 5 -> Numeros.resto(num1,num2);
			case 6 -> Numeros.exponente(num1,num2);
			case 7 -> salir=true;
			
			
			
			default -> System.out.println("numero introducido incorrecto");
			
			}
			System.out.println("deseas realizar otro calculo");
			if(sino.equals("si")) {salir = true;}
			
		}
		
	}
}
