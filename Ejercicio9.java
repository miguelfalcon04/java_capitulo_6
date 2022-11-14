/* Ejercicio 9
Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado. */

public class Ejercicio9 {
    public static void main(String[] args) {

        int n;
        int cont=0;

        do{
            n = (int)(Math.random()*100);
            
            if(n%2==0){
                System.out.print(n+" ");
                cont=cont+1;
            }

        }while(n!=24);

        System.out.println("");
        System.out.print("Se han generado "+cont+" numeros");
    }
}
