package prim;
import java.util.Scanner; 
public class Prim {

	public static void main(String[] args) {
	Scanner pollo = new Scanner(System.in); 
	double Rest;
	System.out.println("Geben Sie ein Zahl ein: ");
	double Zahl=pollo.nextDouble();
	System.out.println("Geben Sie ein Zahl ein: ");
	double Zahl2=pollo.nextDouble();
	double n= Zahl, m=Zahl2;
	do {
		Rest= Zahl%Zahl2; 
		Zahl= Zahl2;
		Zahl2=Rest; 
	} while(Rest!=0); 
	System.out.printf("GGT von (%.0f, %.0f )= %.0f ", n, m, Zahl); 
	pollo.close();
	}

}
