/* Ejercicio 4
Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios. */

public class Ejercicio4 {
    public static void main(String[] args) {
        
        for(int i=1; i<=20; i++){
            int n = (int)(Math.random()*11);
            System.out.print(n+ " ");
        }
    }
}
