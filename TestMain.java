public class TestMain extends TestCase {
  private Main main 
  
  public void escenario() {
    main = new Main();
  }

  public void saldo() {
  double s = 0;
  for (int i = 0; i < contador; i++) {
     s = s + transac[i];                  
  }
   return s;
  } //sumar

  public void sumadebitos() {
  double s = 0;
  for (int i = 0; i < contador; i++) {
    if(transac[i]>0){
       s = s + transac[i];  
    }                 
  }
   //return s;
  } //sumar debitos

  public void sumacreditos() {
  double s = 0;
  for (int i = 0; i < contador; i++) {
    if(transac[i]<0){
       s = s + transac[i];  
    }                 
  }
   // return s*-1;
  } //sumar creditos

  public void mostrar() {
  //double s = 0;
  for (int i = 0; i < contador; i++) {
     System.out.print(i+1);
     System.out.print("    ");
     System.out.println(transac[i]);               
  }
  } //mostrar

public void ingresardebito(double debito) {
  transac[contador]= debito;
  contador = contador + 1;
  //return debito;
  } //ingreso debitos

  public void ingresarcredito(double credito) {
  transac[contador]= credito * -1;
  contador = contador + 1;
  //return credito;
  } //ingreso creditos


 public void promediodebitos() {
  double s = 0;
  int t =0;
  for (int i = 0; i < contador; i++) {
    if(transac[i]>0){
       s = s + transac[i];  
       t = t +1;
    }                 
  }
   //return s/t;
  } //promedio debitos

   public void grande() {
   double[] transacordenado =  transac;
   Arrays.sort(transacordenado);
   //return transacordenado[99];

  } //debito mas grande 

 public void conteodedebitos() {
  double s = 0;
  int t =0;
  for (int i = 0; i < contador; i++) {
    if(transac[i]>0){
       //s = s + transac[i];  
       t = t +1;
    }                 
  }
   //return t;
  } //conteo de debitos
  
  public  void eliminar() {
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
     transac[posicion-1]=0;
  } //eliminar



}