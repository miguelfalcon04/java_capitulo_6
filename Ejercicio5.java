/* Ejercicio 5
Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números. */

public class Ejercicio5 {
    public static void main(String[] args) {

        int max=0;
        int min=999999999;
        int aux=0;

        for(int i=1; i<=50; i++){

            int n = (int)(Math.random()*100+100);
            System.out.print(n+" ");

            aux+=n;

            if(n>max){
                max=n;
            }

            if(n<min){
                min=n;
            }

        }

        System.out.println("");

        System.out.println("El máximo de los números es: "+max);
        System.out.println("El mínimo de los números es: "+min);
        System.out.print("La media de los números es : "+(aux/50));
    }
}
