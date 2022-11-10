/* Ejercicio 3
Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as. */

public class Ejercicio3 {
    public static void main(String[] args) {

        int palo = (int)(Math.random()*4+1);

        int carta = (int)(Math.random()*13+1);

        switch(carta){
            case 1:
            System.out.print("Su carta es el as de ");
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
            System.out.print("Su carta es la sota de ");
            break;

            case 9:
            System.out.print("Su carta es el caballo de ");
            break;

            case 10:
            System.out.print("Su carta es el rey de ");
            break;
        }

        switch(palo){
            case 1:
            System.out.print("oro");
            break;

            case 2:
            System.out.print("copas");
            break;

            case 3:
            System.out.print("espadas");
            break;

            case 4:
            System.out.print("basto");
            break;
        }

    }
}
