import java.util.Scanner;
import java.util.Arrays; 
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

  public static double sumadebitos() {
  double s = 0;
  for (int i = 0; i < contador; i++) {
    if(transac[i]>0){
       s = s + transac[i];  
    }                 
  }
   return s;
  } //sumar debitos

  public static double sumacreditos() {
  double s = 0;
  for (int i = 0; i < contador; i++) {
    if(transac[i]<0){
       s = s + transac[i];  
    }                 
  }
   return s*-1;
  } //sumar creditos

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
  } //ingreso creditos


 public static double promediodebitos() {
  double s = 0;
  int t =0;
  for (int i = 0; i < contador; i++) {
    if(transac[i]>0){
       s = s + transac[i];  
       t = t +1;
    }                 
  }
   return s/t;
  } //promedio debitos

   public static double grande() {
   double[] transacordenado =  transac;
   Arrays.sort(transacordenado);
   return transacordenado[99];

  } //debito mas grande 


  public static void conteodedebitos() {
  //double s = 0;
  for (int i = 0; i < contador; i++) {
    if(transac[i]>0){
     System.out.println(transac[i]);               
  } }
  } //mostrar





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
            System.out.println("\n");

  
      } // fin opcion a


      if (opcion.equals("B")) {
           System.out.println("Ingrese el crédito:");
           Scanner scan2 = new Scanner(System.in);
            valor = scan2.nextDouble();
            System.out.printf("Se ingreso el crédito: %f%n", ingresarcredito(valor));
            System.out.println("\n");


  
      } // fin opcion b

       if (opcion.equals("C")) {
           System.out.println("Total débitos:");
            System.out.println(sumadebitos());
            System.out.println("\n");
  
      } // fin opcion c

       if (opcion.equals("D")) {
           System.out.println("Total créditos");
            System.out.println(sumacreditos());
            System.out.println("\n");
  
      } // fin opcion d


      if (opcion.equals("E")) {
           System.out.println("Saldo total:");
           System.out.println(saldo());
           System.out.println("\n");
  
      } // fin opcion e

      if (opcion.equals("F")) {
           System.out.println("Promedio de débitos");
           System.out.println(promediodebitos());
           System.out.println("\n");
  
      } // fin opcion f

       if (opcion.equals("G")) {
           System.out.println("Débito más grande");
           System.out.println(grande());
           System.out.println("\n");
  
      } // fin opcion g

      if (opcion.equals("H")) {
           System.out.println("Conteo de debitos");
           conteodedebitos();
           System.out.println("\n");
  
      } // fin opcion h


      if (opcion.equals("I")) {
           System.out.println("Transacciones ingresadas");
            mostrar();
            System.out.println("\n");

      } // fin opcion i

        if (opcion.equals("I")) {
           System.out.println("Transacciones ingresadas");
            mostrar();
            System.out.println("\n");
            
      } // fin opcion j

      if (opcion.equals("X")) {
        System.out.println("0 Salir");
       // Scanner scan = new Scanner(System.in);
        //valor = scan.next();


  
      } // fin opcion a

    } //while
  } //main method

} // main 