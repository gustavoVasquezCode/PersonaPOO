import java.lang.Math;

public class Persona{
  //atributos
  private String nombre;
  private int edad;
  private char sexo;
  private double peso;
  private double altura;

  //agregamos atributos
  private double IMC = 0;
  private int nivelPeso;

  //constantes
  private static final char SEXO_DEF = 'H';
  private static final int bajoPeso = -1;
  private static final int pesoNormal = 0;
  private static final int sobrePeso = 1;

  //constuctor con 3 parametros
  public Persona(String nombre, int edad, char sexo){
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    //metodos de calculo y condicional
    calcularIMC();
    comprobarSexo();
    esMayorDeEdad();
    //this(nombre, edad, sexo, 0, 0);
  }

  //constructor con todos los parametros
  public Persona(String nombre, int edad, char sexo, double peso, double altura){
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura;
    //metodos de comprobacion y calculo
    comprobarSexo();
    calcularIMC();
    esMayorDeEdad();
  }

  //metodo para calcular el IMC con base al peso y Altura
  //en un set() almacenara el tipo de peso
  public void calcularIMC(){
    setIMC(peso/Math.pow(altura, 2)); //calcula el IMC dentro del setIMC()

    //validamos el tipo de peso
    if(getIMC() < 18){
      setNivelPeso(bajoPeso); //guarda -1
    }
    else if(getIMC() >= 18 && getIMC() <= 24.99){
      setNivelPeso(pesoNormal); //guarda 0
    }
    else if(getIMC() >= 25){
      setNivelPeso(sobrePeso); //guarda 1
    }
  }

  //comprobar mayoria de edad
  private boolean esMayorDeEdad(){
    if(getEdad() >= 18)
      return true; //mayor de edad
    else
      return false; //menor de edad
  }

  //hata ua condicional que si el retorno del metodos
  //esMayorDeEdad() y si se cumple una condicion entonces
  //imprimira una cadena de texto String
  public String imprimirMayor(){
    if(esMayorDeEdad() == true)
      return "Es mayor de edad";
    else
      return "Es menor de edad";
  }

  //comprobara si el sexo introducido es correcto
  //si se cumple la condicional, en que sea un dijito erroneo
  //entonces se asigna el valor de la constante
  private void comprobarSexo(){
    if(getSexo() != 'H' && getSexo() != 'M')
      setSexo(SEXO_DEF); //guarda la constante en el setSexo()
  }

  //metodo toString para devolver toda la informacion del Objeto
  //haciendo un retorno de tipo String
  @Override
  public String toString(){
    return "Nombre: " + getNombre() +
    "\nEdad: " + getEdad() +
    "\nSexo: " + getSexo() +
    "\nPeso: " + getPeso() +
    "\nAltura: " + getAltura() +
    "\nIMC: " + getIMC() +
    "\nEstado de peso [-1:Bajo peso, 0:Peso normal, 1:Sobrepeso]: " + getNivelPeso() +
    "\n" + imprimirMayor();
  }

  // metodos set()
  public void setNombre(String nombre){ this.nombre = nombre; }

  public void setEdad(int edad){ this.edad = edad; }

  public void setSexo(char sexo){ this.sexo = sexo; }

  public void setPeso(double peso){ this.peso = peso; }

  public void setAltura(double altura){ this.altura = altura; }

  public void setIMC(double IMC){ this.IMC = IMC; }

  public void setNivelPeso(int nivelPeso){ this.nivelPeso = nivelPeso; }

  //metodos get()
  public String getNombre(){ return nombre; }

  public int getEdad(){ return edad; }

  public char getSexo(){ return sexo; }

  public double getPeso(){ return peso; }

  public double getAltura(){ return altura; }

  public double getIMC(){ return IMC; }

  public int getNivelPeso(){ return nivelPeso; }

}
