package raten;
import java.util.Scanner;
import java.util.Random; 
public class Rat {

	public static void main(String[] args) {
	Scanner pollo = new Scanner(System.in); 
	Random pollito = new Random(); 
	System.out.println("Sie müssen die Nummer zwischen 100 und 1000 raten.\n Sie haben 11 Versuche.");
	
	int Zahl=pollito.nextInt(1000)+100;	
		System.out.println(Zahl);
	int Ant; 
	int Versuche=0, counter=0; 
	for (int i=0; i<=11; i++) {
		System.out.println("Geben Sie ihre Zahl ein");
		Ant=pollo.nextInt();
		if (Ant<Zahl) {
			System.out.println("Ihr Zahl ist kleiner als meinen Zahl"); 
		}
		if (Ant>Zahl) {
			System.out.println("Ihr Zahl ist großer als meinen Zahl"); 
		}
		if (Ant==Zahl) {
			System.out.println("Sie haben es geschafft!"); 
			System.out.println("Nach dem " + Versuche+ "  haben Sie den Spiel gewonnen."); 
			break;
			
		}
		counter++; 
		Versuche++;
		System.out.println("Versuch:"+counter);
		if (Versuche>=11) {
			System.out.println("Sie haben der Spiel verloren."); 
			break;
			
		}
	}
		
	}

}
