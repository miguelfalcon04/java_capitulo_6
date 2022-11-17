/* Ejercicio 17
Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro de
la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo.
 */

import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int altura=sc.nextInt();

        System.out.print("Ahora introduzca la anchura (como mínimo 4):");
        int anchura=sc.nextInt();

        int contador=1;
        int pos=(int)(Math.random()*((anchura-2)*(altura-2))+1);

        for(int i=1; i<=anchura;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=2; i<=altura-1;i++){
            System.out.print("*");
            for(int j=2; j<=anchura-1;j++){
                if(contador==pos){
                    System.out.print("&");
                }else{
                    System.out.print(" ");
                }
                contador++;
            }
            System.out.print("*\n");
        }
        for(int i=1; i<=anchura;i++){
            System.out.print("*");
        }


        sc.close();
    }
}
