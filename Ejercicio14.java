/* Ejercicio 14
Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
programa intentará adivinar el número que estás pensando - un número entre 0
y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
debe preguntar si el número que estás pensando es mayor o menor que el que
te acaba de decir.
 */

import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int oportunidades=5;

        do{
            for(int i=1; i<=5; i++){
                int numero= (int)(Math.random()*101);
                System.out.println("El numero en el que piensa es el: "+numero);
                System.out.println("¿Si o No?");
                String opcion = sc.next();
                oportunidades=oportunidades-1;

                if(opcion.equals("Si")){
                    System.out.print("El ordenador ha acertado el número en "+(5-oportunidades)+" intentos");
                    oportunidades=0;
                    i=0;
                }else{
                    System.out.println("¿El número en el que piensa es mayor o menor?");
                    String valor=sc.next();
                    if(valor.equals("mayor")){

                    }
                }

            }
        }while(oportunidades>1);
        
        sc.close();
    }
}
