public class Ejercicio11 {
    public static void main(String[] args) {

        int suspenso=0;
        int suficiente=0;
        int bien=0;
        int notable=0;
        int sobresaliente=0;

        for(int i=1;i<=20;i++){
        int nota=(int)(Math.random()*11);

        if(nota>=0 && nota<=2){
            System.out.println(nota+" equivale a un suspenso");
            suspenso=suspenso+1;
        }

        if(nota>=3 && nota<=4){
            System.out.println(nota+" equivale a un suficiente");
            suficiente=suficiente+1;
        }

        if(nota>=5 && nota<=6){
            System.out.println(nota+" equivale a un bien");
            bien=bien+1;
        }

        if(nota>=7 && nota<=8){
            System.out.println(nota+" equivale a un notable");
            notable=notable+1;
        }

        if(nota>=9 && nota<=10){
            System.out.println(nota+" equivale a un a sobresaliente");
            sobresaliente=sobresaliente+1;
        }
        }

        System.out.println(" ");
        System.out.println("En total hay "+ suspenso+" suspensos");
        System.out.println("En total hay "+ suficiente+" suficientes");
        System.out.println("En total hay "+ bien+" bienes");
        System.out.println("En total hay "+ notable+" notables");
        System.out.println("En total hay "+ sobresaliente+" sobresalientes");
    }
}
