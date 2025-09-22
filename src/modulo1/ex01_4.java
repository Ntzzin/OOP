package modulo1;
import static java.lang.System.out;

public class ex01_4 {
	
	private static void printCCount(int[] chars, double total) {
		int n;
		for (int i = 0; i < 256; i++) {
			n = chars[i];
			if (n != 0)
				out.println((char) i + ": " + n + " (" + ((100 * n)/total) + "%)");
		}
	}

	public static void main(String[] args) {
		int[] ASCII = new int[256];
		double counter = 0;

		for (String word : args) {
			for (int i = 0; i < word.length(); i++) {
				ASCII[word.charAt(i)]++;
				counter++;
			}
		}
		printCCount(ASCII, counter);
	}

}
