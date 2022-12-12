import java.security.PublicKey;
import java.util.Scanner;
public class geom {

    Scanner entrada = new Scanner(System.in);
    int nlados;
    private double lado;
    private double altura;
    private double base;
    private double radio;

    private final double nPI = 3.14159;




    //CONSTRUCTOR 1
    public geom(int nlados, double lado, double altura, double base, double radio) {
        this.nlados = nlados;
        this.lado = lado;
        this.altura = altura;
        this.base = base;
        this.radio = radio;
    }

    //CONSTRUCTOR 2
    public geom(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }


    /*MÉTODOS*/

    public void areaCuadrado(geom figura){
        System.out.print("Ingrese el lado del cuadrado: ");
        lado = entrada.nextDouble();

        System.out.println("\nEl área del cuadrado es: " + (Math.pow(lado,2.0)) );
    }


    public void perimetroCuadrado(geom figura2){
        System.out.print("Ingrese el lado del cuadrado: ");
        lado = entrada.nextDouble();

        System.out.println("\nEl perímetro del cuadrado es: " + (4.0*lado) );
    }


    public void areaCirculo(geom figura3){
        System.out.print("Ingrese el radio del círculo: ");
        radio = entrada.nextDouble();

        System.out.println("\nEl área del círculo es: " + (nPI*radio*radio) );
    }


    public void perimetroCirculo(geom figura4){
        System.out.print("Ingrese el radio del círculo: ");
        radio = entrada.nextDouble();

        System.out.println("\nLa circunferencia del círculo es: " + (2.0 * nPI * radio * radio) );
    }





}//fin de la clase geom
