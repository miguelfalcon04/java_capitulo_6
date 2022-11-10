/* Ejercicio 6
Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene 
para ello 5 oportunidades. Después de cada intento fallido,el programa dirá cuántas oportunidades 
quedan y si el número introducido es menor o mayor que el número secreto.
 */

import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int azar= (int)(Math.random()*101);

        int n;
        int intentos=5;

        do{

            System.out.print("Introduzca un número: ");
            n=sc.nextInt();

            if(n>azar){
                intentos=intentos-1;
                System.out.println("El número es menor que el introducido");
                System.out.println("Intentos:" +intentos);

            }

            if(n<azar){
                intentos=intentos-1;
                System.out.println("El número es mayor que el introducido");
                System.out.println("Intentos:" +intentos);

            }

            if(n==azar){
                System.out.println("Has acertado");
                intentos=0;
            }

        }while(intentos>0);
    
    sc.close();
    }
}
