package test;



import metier.Adresse;
import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Jeu;
import metier.Salon;


public class Test {

	public static void main(String[] args) {
		
		
Console c1= new Salon("PS4",0,null);
Console c2= new Salon("PS4",0,null);
Console c3= new Salon("PS4",0,null);
Console c4= new Salon("PS4",0,null);
Console c5= new Salon("PS4",0,null);
Jeu j1= new Jeu("Fifa",c1);
Jeu j2= new Jeu("Callof",c3);
Jeu j3= new Jeu("Zelda",c2);
Jeu j4= new Jeu("Sonic",c5);
Jeu j5= new Jeu("MonsterHunter",c4);

Adresse a = new Adresse (26518, "Zurgn","GNEH");
Boutique b = new Boutique (a,"Fnac");




Client client1= new Client("Isma","Patron");
Client client2= new Client("Papa","Brute");
	

	}

}
