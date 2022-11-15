/* Ejercicio 15
Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual
a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente
compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
con dos barras.
d) La última nota de la melodía debe coincidir con la primera.
 */


public class Ejercicio15 {
    public static void main(String[] args) {

        int melodia=4*(int)(Math.random()*6+1);
        String nota="";
        String primeranota="";
        int cont=0;
        
        do{
            switch((int)(Math.random()*7+1)){
                case 1:
                nota="do ";
                break;
    
                case 2:
                nota="re ";
                break;
    
                case 3:
                nota="mi ";
                break;
    
                case 4:
                nota="fa ";
                break;
    
                case 5:
                nota="sol ";
                break;
    
                case 6:
                nota="la ";
                break;
    
                case 7:
                nota="si ";
                break;
            
        }

        cont++;

        if(cont==1){
            primeranota=nota;
        }else if(cont==melodia){
            nota=primeranota;
        }

        System.out.print(nota);
        if(melodia==cont){
            System.out.print("||");
        }else if(cont%4==0){
            System.out.print("| ");
        }

        }while(melodia!=cont);
    }
}
