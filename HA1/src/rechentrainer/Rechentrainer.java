package rechentrainer;
import java.util.Scanner;
import java.util.Random; 
public class Rechentrainer {

	public static void main(String[] args) {
		Scanner pollito = new Scanner(System.in); 
		Random pollo = new Random(); 
	System.out.println("Wie viele Aufgaben soll es sein?");
	int Aufgaben = pollito.nextInt(); 
	double Multiplikation;
	double Richtig=0, Falsch=0; 
	double prozent; 
	for(int i= 1; i<=Aufgaben; i++) {
		int Zahl1=pollo.nextInt(101)+1;
		int Zahl2=pollo.nextInt(101)+1;
		System.out.println("Wie viel ist "+ Zahl1+ "*"+ Zahl2+"?");
		int Produkt= Zahl1*Zahl2; 
		System.out.println("Ihre Antwort: ");
		int Ant=pollito.nextInt(); 
		if (Ant==Produkt) {
			System.out.println("Richtig bro!");
			Richtig++; 
		
		}
	  else {
			System.out.println("Falsch bro, geh schlafen!");
			Falsch++; 
		}
		}
	prozent= (Richtig / Aufgaben)*100; 
	System.out.printf("Sie haben %.0f Aufgaben von %d richtig gelöst!\n", Richtig, Aufgaben);
	System.out.printf("Sie haben %.2f%%",prozent); 
	}

}
