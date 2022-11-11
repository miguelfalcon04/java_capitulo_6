/* Ejercicio 13
Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor.
 */

public class Ejercicio13 {
    public static void main(String[] args) {

        int tiradas=1;
        int dado1;
        int dado2;

        do{
            dado1=(int)(Math.random()*6+1);
            dado2=(int)(Math.random()*6+1);

            if(dado1!=dado2){
                System.out.println("Tirada número "+tiradas);
                System.out.println("Dado 1: "+dado1);
                System.out.println("Dado 2: "+dado2);
                tiradas=tiradas+1;
            }
        }while(dado1!=dado2);

        if(dado1==dado2){
            System.out.println("En la tirada número: "+tiradas+" se ha conseguido que");
            System.out.println("Dado 1: "+dado1+" = Dado 2: "+dado2);
        }
        
    }
}
