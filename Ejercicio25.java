/* Ejercicio 25
Escribe un programa que muestre por pantalla 100 números enteros separados
por un espacio. Los números deben estar generados de forma aleatoria en
un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
 */

public class Ejercicio25 {
    public static void main(String[] args) {


        
        for(int i=1; i<=100; i++){
            
            int numero=(int)((Math.random()*191)+10);
            boolean esprimo=true;
            for(int j=2; j<numero;j++){
                if(numero%j==0){ // Comprobar si es primo
                    esprimo=false;
                }
            }
            if(numero%5==0){
                System.out.print("["+numero+"] ");
            } else if(esprimo){
                System.out.print("#"+numero+"# ");
            }else{
                System.out.print(numero+" ");
            }
        }
        
    }
}
