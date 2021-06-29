import java.util.Scanner;

public class MainPersona{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    String nombre;
    int edad;
    char sexo;
    double peso;
    double altura;

    System.out.print("Ingrese el nombre: ");
    nombre = sc.next();

    System.out.print("Ingrese la edad: ");
    edad = sc.nextInt();

    System.out.print("Ingrese el sexo: ");
    sexo = sc.next().charAt(0);

    System.out.print("Ingrese el peso: ");
    peso = sc.nextDouble();

    System.out.print("Ingrese la altura en metros: ");
    altura = sc.nextDouble();

    //instanciar el objeto
    Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);

    System.out.println("\n\n>>>>>>>>>>>>>>>> Persona 1 <<<<<<<<<<<<<<<");
    System.out.println(persona1.toString());

    Persona persona2 = new Persona(nombre, edad, sexo);
    persona2.setPeso(85.9);
    persona2.setAltura(1.79);
    persona2.calcularIMC();
    System.out.println("\n\n>>>>>>>>>>>>>>>> Persona 2 <<<<<<<<<<<<<<<");
    System.out.println(persona2.toString());
  }
}
