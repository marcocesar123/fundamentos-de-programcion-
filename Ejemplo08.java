import java.util.*;
import java.io.*;
public class Ejemplo08 {
 public static void main(String[] args) throws IOException{
 int A,B, Resultado = 0 ;
 char operador;
 boolean calculado = true;
 Scanner sc = new Scanner(System.in);
 System.out.print("introdusca un numero entero:");
 A = sc.nextInt();
 System.out.print("introduzca otro numero entero:");
 B = sc.nextInt();
 System.out.print("introduzca un operador (+,-,*,/):");
 operador = (char)System.in.read();
 switch (operador) { 
  case '-' : Resultado = A - B;
              break;
  case '+' : Resultado = A + B;
              break;
  case '*' : Resultado = A * B;
              break;
  case '/' : if(B!=0)
     Resultado = A / B;
   else{
     System.out.println("\nNo se puede dividir por cero");
     calculando = false;
     }  
     break;
  default : System.out.println("\nOperador no valido");
    calculando = false; 
}
if(calculando){
 System.out.println("\nEl resultado es: " + Resultado);
}
}
}
