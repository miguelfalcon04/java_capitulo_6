/* Ejercicio 2
Realiza un programa que muestre al azar el nombre de una carta de la baraja
francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
1). Para convertir un número en una cadena de caracteres podemos usar
String.valueOf(n).
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        
        int palo = (int)(Math.random()*4+1);

        int carta = (int)(Math.random()*13+1);

        switch(carta){
            case 1:
            System.out.print("Su carta es el A de ");
            break;

            case 2:
            System.out.print("Su carta es el 2 de ");
            break;

            case 3:
            System.out.print("Su carta es el 3 de ");
            break;

            case 4:
            System.out.print("Su carta es el 4 de ");
            break;

            case 5:
            System.out.print("Su carta es el 5 de ");
            break;

            case 6:
            System.out.print("Su carta es el 6 de ");
            break;

            case 7:
            System.out.print("Su carta es el 7 de ");
            break;

            case 8:
            System.out.print("Su carta es el 8 de ");
            break;

            case 9:
            System.out.print("Su carta es el 9 de ");
            break;

            case 10:
            System.out.print("Su carta es el 10 de ");
            break;

            case 11:
            System.out.print("Su carta es el J de ");
            break;

            case 12:
            System.out.print("Su carta es el Q de ");
            break;

            case 13:
            System.out.print("Su carta es el K de ");
            break;
        }

        switch(palo){
            case 1:
            System.out.print("picas");
            break;

            case 2:
            System.out.print("corazones");
            break;

            case 3:
            System.out.print("diamantes");
            break;

            case 4:
            System.out.print("tréboles");
            break;
        }

    }
}
