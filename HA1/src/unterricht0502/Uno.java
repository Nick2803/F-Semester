package unterricht0502;
import java.util.Random; 
public class Uno {

	public static void main(String[] args) {
		Random pollito = new Random(); 
		int quersumme=0; 
	while(quersumme<18) {
		int Zahl=pollito.nextInt(9000)+100;
		System.out.println("Zahl= "+Zahl);
		quersumme=0; 
	do {
		int Rest=Zahl%10;
		Zahl=Zahl/10;
		quersumme=quersumme+Rest; 
	}
	while(Zahl!=0); 
	System.out.println(quersumme); 
	}

	}

}


//der computer hat ein zahl zwischen 100 und 1000, sie durfen 11 mal fragen wie die Nummer ist. nach dem elte frage zeigt die Nummer 