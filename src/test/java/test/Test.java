package test;



import metier.Adresse;
import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Jeu;


public class Test {

	public static void main(String[] args) {
		
		
Console c1= new Console("PS4");
Console c2= new Console("DS");
Console c3= new Console("XBOX");
Console c4= new Console("PSP");
Console c5= new Console("GAMECUBE");
Jeu j1= new Jeu("Fifa",c1);
Jeu j2= new Jeu("Callof",c3);
Jeu j3= new Jeu("Zelda",c2);
Jeu j4= new Jeu("Sonic",c5);
Jeu j5= new Jeu("MonsterHunter",c4);

Adresse a = new Adresse (26518, "Zurgn","GNEH");
Boutique b = new Boutique (a,"Fnac");


// int numero, String rue, String ville, String nom, Adresse address

Client client1= new Client("Isma","Patron");
Client client2= new Client("Papa","Brute");
	

	}

}
