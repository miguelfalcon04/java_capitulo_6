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

        for(int j=1; j<=100;j++){


        int rojo=0;
        int azul=0;
        int verde=0;
        int amarillo=0;
        int violeta=0;
        int naranja=0;

        for(int i=1; i<=3;i++){
            int colorhab=(int)(Math.random()*6+1);
            System.out.print("Para la habitación numero "+i+" utilice el color ");


            switch(colorhab){
                case 1:
                if(rojo==0){
                    System.out.println("rojo");
                    rojo=1;
                    break;
                }
                case 2:
                if(azul==0){
                    System.out.println("azul");
                    azul=1;
                    break;
                }
                case 3:
                if(verde==0){
                    System.out.println("verde");
                    verde=1;
                    break;
                }
                case 4:
                if(amarillo==0){
                    System.out.println("amarillo");
                    amarillo=1;
                    break;
                }
                case 5:
                if(violeta==0){
                    System.out.println("violeta");
                    violeta=1;
                    break;
                }
                case 6:
                if(naranja==0){
                    System.out.println("naranja");
                    naranja=1;
                    break;
                }
            }
        }
    }
}
}
