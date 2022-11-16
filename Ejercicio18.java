/* Ejercicio 18
Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
sustituir el color blanco por colores más alegres. Realiza un programa que
genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
naranja.
 */

public class Ejercicio18 {
    public static void main(String[] args) {

        int excepcion=0;
        boolean fin= false;

        do{
        int color=(int)(Math.random()*6+1);


        System.out.print("Para la habitación numero  utilice el color ");
        if(color!=excepcion){
            switch(color){
            case 1:
            System.out.print("rojo");
            break;

            case 2:
            System.out.print("azul");
            break;

            case 3:
            System.out.print("verde");
            break;

            case 4:
            System.out.print("amarillo");
            break;

            case 5:
            System.out.print("violeta");
            break;

            case 6:
            System.out.print("naranja");
            break;
            }
            System.out.println("");
            excepcion=color;
            }

        }while(fin=false);
    }
}

