import java.util.*;
public class Ejemplo09 {
 public static void main(String[]args){
 Scanner sc = new Scanner(System.in);
 int num;
 System.out.println("introduzca un numero:");
 num = sc.nextInt();
 System.out.println((num%2)==0 ? "PAR" : "IMPAR");
 } 
}
