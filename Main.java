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
     System.out.print(i+1);
     System.out.print("    ");
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

 public static double conteodedebitos() {
  double s = 0;
  int t =0;
  for (int i = 0; i < contador; i++) {
    if(transac[i]>0){
       //s = s + transac[i];  
       t = t +1;
    }                 
  }
   return t;
  } //conteo de debitos
  
  public static void eliminar() {
  //double s = 0;
  for (int i = 0; i < contador; i++) {
     System.out.print(i+1);
     System.out.print("    ");
     System.out.println(transac[i]); 

  } // termina for
  System.out.println("Ingrese el número de transacción que quiere eliminar"); 
  Scanner scan3 = new Scanner(System.in);
     int posicion = 0;
     posicion = scan3.nextInt();
     if (posicion >=1 && posicion <=99){
     transac[posicion-1]=0;
     System.out.println("Posición eliminada... valor 0..."); 
     } else { 
       System.out.println("Posición fuera de rango.."); 
     }
  } //eliminar


private static double inputAmount() {
  //https://stackoverflow.com/questions/24414299/java-scanner-exception-handling
    Scanner input = new Scanner(System.in);
    while (true) {
        System.out.println("Ingrese un valor numérico");
        try {
            return input.nextDouble();
        }
        catch (java.util.InputMismatchException e) {
            input.nextLine();
        }
    }
} // input amount

private static double inputInt() {
  //https://stackoverflow.com/questions/24414299/java-scanner-exception-handling
  int entero=0;
    Scanner input = new Scanner(System.in);
    while (true) {
        System.out.println("Ingrese un valor entero");
        try {
          entero = input.nextInt();
            return entero;
        }
        catch (java.util.InputMismatchException e) {
            input.nextLine();
        }
    }
} // input int

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
      System.out.println("\u001B[31m"+"Créditos en signo negativo - \u001B[0m");
      System.out.println("Seleccione una opción: ");
      Scanner scan = new Scanner(System.in); // Create a Scanner object
      opcion = scan.next();
      opcion = opcion.toUpperCase();
      //System.out.println(opcion.length());

      if (opcion.equals("A")) {
           
        System.out.println("Ingrese el débito:");
        valor = inputAmount();
            System.out.printf("Se ingreso el débito: %.2f%n", ingresardebito(valor));
            System.out.println("\n");

  
      } // fin opcion a


      if (opcion.equals("B")) {
           System.out.println("Ingrese el crédito:");
            valor = inputAmount();
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
           System.out.println(conteodedebitos());
           System.out.println("\n");
  
      } // fin opcion h


      if (opcion.equals("I")) {
           System.out.println("\n");
           System.out.println("Transacciones ingresadas");
           System.out.println("\u001B[31m"+"Créditos en signo negativo - \u001B[0m");
            mostrar();
            System.out.println("\n");

      } // fin opcion i

        if (opcion.equals("J")) {
           System.out.println("Eliminar transacciones");
            System.out.println("\u001B[31m"+"Créditos en signo negativo - \u001B[0m");
            eliminar();
            
            
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