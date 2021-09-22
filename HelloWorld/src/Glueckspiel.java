import java.util.Scanner;

public class Glueckspiel {

	static byte alter = 19;
	static byte geschlechtz = 0;
	static String name = "Null";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Wie alt bist du?");
		alter = eingabe.nextByte();
		if (alter > 120) {
			System.out.println("Error");
		}
		System.out.println("Welches Geschlecht bist du?");
		System.out.println("0=maennlich, 1=weiblich, 2=divers");
		geschlechtz = eingabe.nextByte();
		
		
		if (alter < 18 || geschlechtz == 2) {
			System.out.println("Hallo " + name + " Mindestalter oder Geschlecht nicht erfüllt");

		} else {
			if (geschlechtz == 1) {
				System.out.println("Guten Tag Frau " + name + "!");
			} else {
				if (geschlechtz == 0) {
					System.out.println("Guten Tag Herr " + name + "!");
				}

				
			}
		}
	}
}
