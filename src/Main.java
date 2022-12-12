import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


    Scanner entrada = new Scanner(System.in);
    geom MyGeom = new geom(10,50);


        int opcion=0;
        boolean exit=false;

        while(!exit){
            System.out.println("1.- AREA");
            System.out.println("2.- PERIMETRO");
            System.out.println("3.- Salir");
            System.out.print("Ingrese la opcion: ");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1: {
                    MyGeom.areaCuadrado(MyGeom);
                    System.out.println("\n");
                    MyGeom.areaCirculo(MyGeom);
                }
                break;
                case 2:
                {
                    MyGeom.perimetroCuadrado(MyGeom);
                    System.out.println("\n");
                    MyGeom.perimetroCirculo(MyGeom);
                }
                break;
                case 3:
                    //SALIR DEL BUCLE
                    exit = true;
                    break;
                default:
                    System.out.println("Ingrese un numero que este en el rango de 1 - 3");
            }
        }


    }//fin del método de main
}