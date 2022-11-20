/* Ejercicio 22
Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
aleatorio. La cabeza se representará con el carácter @ y se debe colocar
exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
el cuerpo irá serpenteando de la siguiente manera: se generará de forma
aleatoria un valor entre tres posibles que hará que el siguiente carácter se
coloque una posición a la izquierda del anterior, alineado con el anterior o una
posición a la derecha del anterior. La longitud de la serpiente se pedirá por
teclado y se supone que el usuario introducirá un dato correcto. */

import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
        int longitud = sc.nextInt();
        int x=13;

        String cabeza= "@";

        System.out.printf("%13s\n",cabeza);
        for(int i=1; i<longitud-1;i++ ){
            x+=(int)(Math.random()*3)-1;
            for(int j=1; j<=x-1;j++){
                System.out.print(" ");
            }
            System.out.print("#\n");
        }
        sc.close();
    }
}
