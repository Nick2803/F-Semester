package prim;
import java.util.Scanner; 
public class Benutzer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Geben Sie ein Zahl ein: ");
		int Zahl=sc.nextInt();
		int counter=0; 
		for (int i=1; i<=Zahl; i++) {
			
		if (Zahl%i==0) 
			counter++;
		}
		 if (counter==2) 
			System.out.println("Ist Primzahl= "+ Zahl);

		 else 
			 System.out.println("Kein Primzahl");
	
		

		}

}
