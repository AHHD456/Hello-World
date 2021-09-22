import java.util.Scanner;
import java.util.Random;

public class Glueckspiel {
	static double randomValue = 2;
	static byte alter = 19;
	static byte geschlechtz = 0;
	static String name = "Null";
	static boolean entscheidung = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner eingabe = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("Wie alt bist du?");
		alter = eingabe.nextByte();
		if (alter > 120) {
			System.out.println("Error");
		}else {
		System.out.println("Welches Geschlecht bist du?");
		System.out.println("0=maennlich, 1=weiblich, 2=divers");
		geschlechtz = eingabe.nextByte();
		System.out.println("Wie ist dein Name?");
	    
	
		if (alter < 18 || geschlechtz == 2) {
			System.out.println("Hallo " + name + " Mindestalter oder Geschlecht nicht erfüllt");

		} else {
			
			
			if (geschlechtz == 1) {
				System.out.println("Guten Tag Frau " + name + "! Wollen sie spielen?");
				entscheidung = eingabe.nextBoolean();
			} else {
				if (geschlechtz == 0) {
					System.out.println("Guten Tag Herr " + name + "! Wollen sie spielen?");
					entscheidung = eingabe.nextBoolean();
				}
			}
			if (entscheidung == true) {
			
				randomValue = Math.random();
				randomValue =randomValue*100;

				if (randomValue < 43) {
					System.out.println("Sie haben gewonnen. Herzlichen Glückwunsch");
					System.out.println(randomValue);
				} else {
					if (randomValue > 42) {
						System.out.println("Sie haben verloren. Versuchen sie ihr Glück nochmal");
						System.out.println(randomValue);
					}
				}

			} else {
				System.out.println("Bis bald, see you later alligator");
			}
		}

	}
}}
