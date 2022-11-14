/* Ejercicio 31
Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la
partida, el jugador introduce la cantidad de dinero que quiere apostar. Se
muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u
11, el jugador gana la misma cantidad que apostó y termina la partida. Por ej.
si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos dados
suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. Si no se
da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego
entra en una segunda etapa. En esta etapa, el jugador buscará volver a obtener
ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7,
pierde. Si sale otro número, tiene que seguir tirando.
 */

import java.util.Scanner;
public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuanto vas a apostar?: ");
        int apuesta= sc.nextInt();

        boolean gana=false;
        boolean bucle=false;

        do{
        gana=false;

        int dado1=(int)(Math.random()*6+1);
        System.out.println("Tirada del dado 1: "+dado1);
        int dado2=(int)(Math.random()*6+1);
        System.out.println("Tirada del dado 2: "+dado2);

        System.out.println("Ambos dados suman: "+(dado1+dado2));

        if(dado1+dado2==7 || dado1+dado2==11){
            System.out.print("Ha ganado otros "+apuesta+" euros");
            gana=true;
        }
        if(dado1+dado2==2 || dado1+dado2==3 || dado1+dado2==12){
            System.out.print("Has perdido todo tu dinero");
            gana=true;
        }
        if(dado1+dado2==4 || dado1+dado2==5 || dado1+dado2==6 || dado1+dado2==8 || dado1+dado2==9 || dado1+dado2==10){
            gana=false;

            do{
                bucle=false;
            System.out.println("Vuelve a tirar los dados: ");
            int dado3=(int)(Math.random()*6+1);
            System.out.println("Tirada del dado 3: "+dado3);
            int dado4=(int)(Math.random()*6+1);
            System.out.println("Tirada del dado 4: "+dado4);

            System.out.println("Ambos dados suman: "+(dado3+dado4));

            if(dado1+dado2==dado3+dado4){
                System.out.print("Ha ganado otros "+apuesta+" euros");
                gana=true;
                bucle=true;
            }
            if(dado3+dado4==7){
                System.out.print("Has perdido todo tu dinero");
                gana=true;
                bucle=true;
            }
            }while(bucle==false);
            
        }
        
        sc.close();

        }while(gana==false);
    }
}
