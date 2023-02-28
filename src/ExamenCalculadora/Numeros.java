package ExamenCalculadora;

import java.util.Scanner;

public class Numeros {
	
static double num1;
static double num2;
static double resultado;

//metodo por defecto

public static void suma(double num1,double num2) {

	System.out.println("el resultado de la suma es :" + (Numeros.num1+Numeros.num2));
}
public static void resta(double num1,double num2) {
	System.out.println("Introduce el primer numero");
	Numeros.num1=new Scanner(System.in).nextDouble();
	System.out.println("Introduce el segundo numero");
	Numeros.num2=new Scanner(System.in).nextDouble();
	
	System.out.println("el resultado de la resta es :" + (Numeros.num1-Numeros.num2));
}
public static void multiplicacion(double num1,double num2) {
	System.out.println("Introduce el primer numero");
	Numeros.num1=new Scanner(System.in).nextDouble();
	System.out.println("Introduce el segundo numero");
	Numeros.num2=new Scanner(System.in).nextDouble();
	
	System.out.println("el resultado de la multiplicacion es :" + (Numeros.num1*Numeros.num2));
}
public static void division(double num1,double num2) {
	System.out.println("Introduce el primer numero");
	Numeros.num1=new Scanner(System.in).nextDouble();
	System.out.println("Introduce el segundo numero");
	Numeros.num2=new Scanner(System.in).nextDouble();
	
	System.out.println("el resultado de la division es :" + (Numeros.num1/Numeros.num2));
}
public static void resto(double num1,double num2) {
	System.out.println("Introduce el primer numero");
	Numeros.num1=new Scanner(System.in).nextDouble();
	System.out.println("Introduce el segundo numero");
	Numeros.num2=new Scanner(System.in).nextDouble();
	
	System.out.println("el resultado de la resto es :" + (Numeros.num1%Numeros.num2));
}
public static void exponente(double num1,double num2) {
	System.out.println("Introduce el primer numero");
	num1 =Numeros.num1=new Scanner(System.in).nextDouble();
	System.out.println("Introduce el segundo numero");
	num2 =Numeros.num2=new Scanner(System.in).nextDouble();
	double resultado =Math.pow(Numeros.num1, Numeros.num2);
	System.out.println("el resultado del exponente es " + resultado);
}
public static double getNum1() {
	return num1;
}
public static void setNum1(double num1) {
	Numeros.num1 = num1;
}
public static double getNum2() {
	return num2;
}
public static void setNum2(double num2) {
	Numeros.num2 = num2;
}
public static double getResultado() {
	return resultado;
}
public static void setResultado(double resultado) {
	Numeros.resultado = resultado;
}

}
