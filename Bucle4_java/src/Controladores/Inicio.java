package Controladores;

import java.util.Scanner;

public class Inicio 
{

	public static void main(String[] args) 
	{
		
	    Scanner sc = new Scanner(System.in);  
		int numero1 = 0;
		int numero2 = 1;
		int suma = 1;
		 
        System.out.println("Escriba un numero para la secuencia: ");
        
        int secuencia = sc.nextInt();
        for (int i = 0; i < secuencia; i++) 
        {
             
            System.out.println(suma);
             
           
            suma = numero1 + numero2;
            numero1 = numero2;
            numero2 = suma;
             
            

	    }
   }
}
