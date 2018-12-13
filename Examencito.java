import java.io.*;
public class Examencito{
public static void main (String [] args) throws IOException{

BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
   int cubo, numero, contador=0;
   do{
  System.out.println(" Ingresa un valor");
 numero = Integer.parseInt(br.readLine());
 cubo = numero*numero*numero;
 if(numero>0)
System.out.println(" Su numero cubico es "+cubo);
}
while (numero>0);

}
}
