
public class Glueckspiel {

	static byte alter = 19;
	static byte geschlecht = 0;
	static String name = "Null";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (alter < 18 || geschlecht == 2) {
			System.out.println("Hallo " + name + " Mindestalter oder Geschlecht nicht erfüllt");

		} else {
			if (geschlecht == 1) {
				System.out.println("Guten Tag Frau " + name + "!");
			} else {
				if (geschlecht == 0) {
					System.out.println("Guten Tag Herr " + name + "!");
				}
			
			
			
			}
		}
	}
}
