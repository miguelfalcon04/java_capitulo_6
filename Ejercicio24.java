/* Ejercicio 24
Escribe un programa que, dado un número introducido por teclado, elija al azar
uno de sus dígitos. */


import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        int n = sc.nextInt();

        int nvolteado=0;
        int longitud=1;
        int caracter;

        while(n>0){
            nvolteado=(nvolteado*10)+n%10;
            longitud=longitud+1;
            n/=10;
            
        }

        int posicion=(int)(Math.random()*longitud);

        longitud=0;
        do{
            caracter=nvolteado%10;
            nvolteado/=10;
            longitud++;
        }while(posicion!=longitud);
        System.out.print("En la posicion "+posicion+" esta el caracter "+caracter);

        sc.close();
    }
}