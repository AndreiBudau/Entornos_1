/**
*Define la clase EsPositivo que pide un entero por teclado e indica si es positivo.
*@author Andrei Budau y José Antonio Aguilar Granados
*@version 1.0
*/
public class EsPositivo{
	public static void main(String[] args){
	java.util.Scanner scanner = new java.util.Scanner(System.in);//sirve para poder introducir uno o varios datos
       int valor;//declaracion de la variable
       System.out.print("\nIntroduce el numero: ");//muestra el mensaje por pantalla
       valor = scanner.nextInt();//sirve para que lea el numero que hemos introducido
      if(valor>0)
      System.out.println("El numero "+ valor +" es positivo");//muestra el mensaje por pantalla
          else
          System.out.println("El numero "+ valor +" es negativo");//muestra el mensaje por pantalla
          
  }
}