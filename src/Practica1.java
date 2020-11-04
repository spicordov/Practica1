import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {

        System.out.println("Este es un cambio desde la carpeta miWebCasa");
        System.out.println("Este es un cambio desde la carpeta miWebCasa");
        System.out.println("Este es un cambio desde la carpeta miWebCasa");

        Scanner sc = new Scanner(System.in);
        System.out.println("Momento inicial:");
        System.out.println("================");
        System.out.println("Introduce la hora :");
        int h = sc.nextInt();
        System.out.println("Introduce los minutos:");
        int m = sc.nextInt();
        System.out.println("Introduce los segundos:");
        int s = sc.nextInt();
        System.out.println("Momento final:");
        System.out.println("==============");
        System.out.println("Introduce la hora :");
        int h1 = sc.nextInt();
        System.out.println("Introduce los minutos:");
        int m1 = sc.nextInt();
        System.out.println("Introduce los segundos:");
        int s1 = sc.nextInt();

        int mi = (h*3600)+ (m*60) + s; //momento inicial
        int mf = (h1*3600)+ (m1*60) + s1; //momento final
        int ts = mf-mi; //total segundos

        int horas = ts/3600 ;
        int minutos = ((ts-horas*3600)/60);
        int segundos= (ts-(horas*3600+minutos * 60));

        System.out.println("Datos introducidos: momento incial: "+h+":"+m+":"+s+"     "+"momento final es: "+h1+":"+m1+":"+s1);
        System.out.println("La diferencia entre ambos momentos es: "+horas+ ":" + minutos+":"+ segundos);
    }
}
