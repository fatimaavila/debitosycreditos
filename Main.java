import java.util.Scanner;

class Main {

 static double[] transac = new double[100];
 static int contador;

  public static double saldo() {
  double s = 0;
  for (int i = 0; i < contador; i++) {
     s = s + transac[i];                  
  }
   return s;
  } //sumar

  public static void mostrar() {
  //double s = 0;
  for (int i = 0; i < contador; i++) {
     System.out.println(transac[i]);               
  }
  } //mostrar

public static double ingresardebito(double debito) {
  transac[contador]= debito;
  contador = contador + 1;
  return debito;
  } //ingreso debitos

  public static double ingresarcredito(double credito) {
  transac[contador]= credito * -1;
  contador = contador + 1;
  return credito;
  } //ingreso debitos



  // ----- Main -----------------
  public static void main(String[] args) {
    contador = 0; //cantidad transac
    System.out.println("Inicio de débitos y créditos");
    String opcion = ""; // definir variables
    double valor = 0;

    while (opcion.equals("X")== false) {
      System.out.println("a. Ingresar débitos");
      System.out.println("b. Ingresar créditos");
      System.out.println("c. Total de débitos");
      System.out.println("d. Total de créditos");
      System.out.println("e. Saldo");
      System.out.println("f. Promedio de débitos");
      System.out.println("g. Débito más grande");
      System.out.println("h. Conteo de débitos");
      System.out.println("i. Mostrar las transacciones");
      System.out.println("j. Eliminar créditos");
      System.out.println("x. Salir");
      System.out.println("Seleccione una opción: ");
      Scanner scan = new Scanner(System.in); // Create a Scanner object
      opcion = scan.next();
      opcion = opcion.toUpperCase();
      //System.out.println(opcion.length());

      if (opcion.equals("A")) {
           System.out.println("Ingrese el débito:");
           Scanner scan2 = new Scanner(System.in);
            valor = scan2.nextDouble();
            System.out.printf("Se ingreso el débito: %f%n", ingresardebito(valor));

  
      } // fin opcion a


      if (opcion.equals("B")) {
           System.out.println("Ingrese el crédito:");
           Scanner scan2 = new Scanner(System.in);
            valor = scan2.nextDouble();
            System.out.printf("Se ingreso el crédito: %f%n", ingresarcredito(valor));

  
      } // fin opcion b


      if (opcion.equals("E")) {
           System.out.println("Saldo total:");
           System.out.println(saldo());
  
      } // fin opcion b

      if (opcion.equals("I")) {
           System.out.println("Transacciones ingresadas");
            mostrar();
            System.out.println("\n");


  
      } // fin opcion a

      if (opcion.equals("X")) {
        System.out.println("0 Salir");
       // Scanner scan = new Scanner(System.in);
        //valor = scan.next();


  
      } // fin opcion a

    } //while
  } //main method

} // main 