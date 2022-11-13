/* Ejercicio 27
Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
introduce una opción incorrecta, el programa deberá mostrar un mensaje de
error. */

import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aux=0;

        System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
        String jugador= sc.next();


        if(jugador.equals("piedra")){
            aux=1;
        }else if(jugador.equals("papel")){
            aux=2;
        }else if(jugador.equals("tijera")){
            aux=3;
        }else{
            System.out.println("Introduzca bien la opción");
        }

        System.out.print("Turno del ordenador: ");
        int ordenador=(int)(Math.random()*3+1);
        switch(ordenador){
            case 1:
            System.out.print("piedra");
            break;

            case 2:
            System.out.print("papel");
            break;

            case 3:
            System.out.print("tijera");
            break;
        }

        System.out.println(" ");

        if(aux==1 && ordenador==1){
            System.out.print("Empate");
        }
        if(aux==2 && ordenador==2){
            System.out.print("Empate");
        }
        if(aux==3 && ordenador==3){
            System.out.print("Empate");
        }
        if(aux==1 && ordenador==2){
            System.out.print("Gana el ordenador");
        }
        if(aux==1 && ordenador==3){
            System.out.print("Gana el jugador");
        }
        if(aux==2 && ordenador==1){
            System.out.print("Gana el jugador");
        }
        if(aux==2 && ordenador==3){
            System.out.print("Gana el ordenador");
        }
        if(aux==3 && ordenador==1){
            System.out.print("Gana el ordenador");
        }
        if(aux==3 && ordenador==2){
            System.out.print("Gana el jugador");
        }

        sc.close();
        
    }
}
