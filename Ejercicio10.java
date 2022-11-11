/* Ejercicio 10
Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
entre 1 y 40 caracteres. */

public class Ejercicio10 {
    public static void main(String[] args) {

        for(int i=1; i<=10; i++){

            int caracter=(int)(Math.random()*6+1);
            int longitud=(int)(Math.random()*40+1);
            System.out.println(" ");

            for(int j=1; j<=longitud;j++){
                switch(caracter){
                    case 1:
                    System.out.print("*");
                    break;

                    case 2:
                    System.out.print("-");
                    break;

                    case 3:
                    System.out.print("=");
                    break;

                    case 4:
                    System.out.print(".");
                    break;

                    case 5:
                    System.out.print("|");
                    break;

                    case 6:
                    System.out.print("@");
                    break;
                }
                
            }
        }
    }
}
