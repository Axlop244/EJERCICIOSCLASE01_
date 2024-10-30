import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
    }
    public static void ejercicio1(){
                System.out.println(" @@@@@@@ ");
                System.out.println("@| O O |@");
                System.out.println("(|  ^  |)");
                System.out.println(" | [_] |");
                System.out.println(" +-----+");
    }
    public static void ejercicio2(){
        //Imprimir en el terminal, consola 
        System.out.print("Alisson, bienvenido al curso de Programación en Java!!!"); 
    }
    public static void ejercicio3(){
        System.out.println("    * ");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        System.out.println("  *****");
        System.out.println("    * ");
    }
    public static void ejercicio4(){
    var palabra1 = new Scanner(System.in);
    var palabra0 = new Scanner(System.in);
    var palabra3 = new Scanner(System.in);
    System.out.print("Introduzca palabra 1: ");
    var palabra = palabra1.nextLine();

    System.out.print("Introduzca palabra 2: ");
    var letra = palabra0.nextLine();

    System.out.print("Introduzca palabra 3: ");
    var digito = palabra3.nextLine();

    System.out.println(palabra);
    System.out.println(letra);
    System.out.println(digito);

    palabra1.close();
    palabra0.close();
    palabra3.close();
    }
}


    

