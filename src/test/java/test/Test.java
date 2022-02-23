package test;



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

	

	}

}
