/* Ejercicio 19
Escribe un programa que muestre 50 números enteros aleatorios comprendidos
entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
el máximo de los pares el mínimo de los impares y la media de todos los
números generados.
 */

public class Ejercicio19 {
    public static void main(String[] args) {

        int par=0;
        int impar=0;
        int media=0;

        for(int i=1; i<=50;i++){

            int numero = (int)((Math.random()*300)-100);
            System.out.print(numero+" ");

            media=media+numero;

            if(numero%2==0 && numero>par){
                par=numero;
            }

            if(Math.abs(numero)%2!=0 && numero<impar){
                impar=numero;
            }
        }

        System.out.println("");
        System.out.println("El máximo de los pares es: "+par);
        System.out.println("El mínimo de los pares es: "+impar);
        System.out.println("La media de todos los números generados es: "+ (media/50));
    }
}
