/* Ejercicio 14
Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
programa intentará adivinar el número que estás pensando - un número entre 0
y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
debe preguntar si el número que estás pensando es mayor o menor que el que
te acaba de decir.
 */

import java.util.Scanner;
public class Ejercicio14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int variable=101;
        int oportunidades=5;
        int random= (int)(Math.random()*variable);

        do{
            System.out.println("Estas pensando en el: "+random);
            System.out.print("si o no? ");
            String opcion=sc.next();
            if(opcion.equals("si")){
                System.out.printf("El programa ha acertado el número en %d intentos",(5-oportunidades)+1);
                oportunidades=0;
            }else{
                oportunidades=oportunidades-1;
                System.out.print("Es mayor o menor? ");
                String radio=sc.next();
                if(radio.equals("menor")){
                    variable=random;
                    random=(int)(Math.random()*variable);
                }
                if(radio.equals("mayor")){
                    variable=random;
                    random=(int)(Math.random()*(101-variable)+variable);
                }
            }

        }while(oportunidades>0);

        sc.close();
    }
}

