/* Ejercicio 16
Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”. */

public class Ejercicio16 {
    public static void main(String[] args) {

        int corazon=0;
        int diamante=0;
        int herradura=0;
        int campana=0;
        int limon=0;
        int i=0;


        for(i=1; i<=3;i++){

            int tirada= (int)(Math.random()*5+1);

            switch(tirada){

                case 1:
                System.out.print("corazón ");
                corazon=corazon+1;
                break;

                case 2:
                System.out.print("diamante ");
                diamante=diamante+1;
                break;

                case 3:
                System.out.print("herradura ");
                herradura=herradura+1;
                break;

                case 4:
                System.out.print("campana ");
                campana=campana+1;
                break;

                case 5:
                System.out.print("limón ");
                limon=limon+1;
                break;

            }

            while(i==3){
                System.out.println("");
                if(corazon==2 || diamante==2 || herradura==2|| campana==2|| limon==2){
                    System.out.print("Bien, ha recuperado su moneda");
                }
                else if(corazon==3 || diamante==3 || herradura==3|| campana==3|| limon==3){
                    System.out.print("Enhorabuena, ha ganada 10 monedas");
                }else{
                    System.out.print("Lo siento, ha perdido");
                }
                i++;
            }
        }
        
    }
}
