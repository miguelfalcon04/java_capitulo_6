/* Ejercicio 29
Realiza un programa que muestre la previsión del tiempo para mañana en
Málaga. Las temperaturas máxima y mínima se deben generar de forma
aleatoria entre los intervalos máximos y mínimos absolutos medidos en las
últimas décadas para cada estación. La probabilidad de que esté soleado
o nublado en cada estación se proporciona a continuación. Obviamente, la
temperatura mínima deberá ser menor o igual que la temperatura máxima.
 */

import java.util.Scanner;
public class Ejercicio29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temperaturamin;
        int temperaturamax;
        int nubesol;
        int nube=0;
        int sol=0;

        System.out.println("1. Primavera");
        System.out.println("2. Verano");
        System.out.println("3. Otoño");
        System.out.println("4. Invierno");
        System.out.print("Seleccione la estación del año (1-4): ");
        int estacion=sc.nextInt();

        System.out.println(" ");

        System.out.println("Previsión del tiempo para mañana");
        System.out.println("________________________________");

        if(estacion==1){
            temperaturamin=(int)(Math.random()*16+15);
            System.out.println("Temperatura mínima: "+temperaturamin);
            temperaturamax=(int)(Math.random()*(30-temperaturamin)+temperaturamin);
            System.out.println("Temperatura máxima: "+temperaturamax);
            for(int i=1; i<=10; i++){
                nubesol=(int)(Math.random()*10+1);
                if(nubesol==1 || nubesol==2 || nubesol==3 || nubesol==4 || nubesol==5 || nubesol==6){
                    sol=sol+1;
                }else{
                    nube=nube+1;
                }
            }
            if(nube>sol){
                System.out.println("Nublado");
            }else if(nube==sol){
                System.out.print("Soleado");
            }else{
                System.out.print("Soleado");
            }
        }

        if(estacion==2){
            temperaturamin=(int)(Math.random()*21+25);
            System.out.println("Temperatura mínima: "+temperaturamin);
            temperaturamax=(int)(Math.random()*(45-temperaturamin)+temperaturamin);
            System.out.println("Temperatura máxima: "+temperaturamax);
            for(int i=1; i<=10; i++){
                nubesol=(int)(Math.random()*10+1);
                if(nubesol==1 || nubesol==2 || nubesol==3 || nubesol==4 || nubesol==5 || nubesol==6 || nubesol==7 || nubesol==8){
                    sol=sol+1;
                }else{
                    nube=nube+1;
                }
            }
            if(sol>nube){
                System.out.println("Soleado");
            }else if(nube==sol){
                System.out.print("Soleado");
            }else{
                System.out.print("Nublado");
            }
        }

        if(estacion==3){
            temperaturamin=(int)(Math.random()*11+20);
            System.out.println("Temperatura mínima: "+temperaturamin);
            temperaturamax=(int)(Math.random()*(30-temperaturamin)+temperaturamin);
            System.out.println("Temperatura máxima: "+temperaturamax);
            for(int i=1; i<=10; i++){
                nubesol=(int)(Math.random()*10+1);
                if(nubesol==1 || nubesol==2 || nubesol==3 || nubesol==4){
                    sol=sol+1;
                }else{
                    nube=nube+1;
                }
            }
            if(nube>sol){
                System.out.println("Nublado");
            }else if(nube==sol){
                System.out.print("Nublado");
            }else{
                System.out.print("Soleado");
            }
        }

        if(estacion==4){
            temperaturamin=(int)(Math.random()*26);
            System.out.println("Temperatura mínima: "+temperaturamin);
            temperaturamax=(int)(Math.random()*(25-temperaturamin)+temperaturamin);
            System.out.println("Temperatura máxima: "+temperaturamax);
            for(int i=1; i<=10; i++){
                nubesol=(int)(Math.random()*10+1);
                if(nubesol==1 || nubesol==2){
                    sol=sol+1;
                }else{
                    nube=nube+1;
                }
            }
            if(nube>sol){
                System.out.println("Nublado");
            }else if(nube==sol){
                System.out.print("Nublado");
            }else{
                System.out.print("Soleado");
            }
        }

        sc.close();
    }
} 