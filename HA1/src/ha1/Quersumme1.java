package ha1;
import java.util.Random; 
public class Quersumme1 {

	public static void main(String[] args) {
		Random pollito=new Random();
 int N1 = pollito.nextInt(9000) + 1000; 
 int Quersumme = 0, Rest, counter = 0;

 while (Quersumme < 18) {
     System.out.println("Randomzahl " + N1);
     int temp = N1; 
     Quersumme = 0; 


     while (temp != 0) {
         Rest = temp % 10; 
         Quersumme += Rest; 
         temp /= 10; 
     }

     System.out.printf("Die Quersumme ist: %d\n", Quersumme);
     counter++;
     N1 = pollito.nextInt(900) + 100; 
 }

 System.out.printf("Die Summe ist großer als 18 nach %d Versuche.", counter);
}
}
