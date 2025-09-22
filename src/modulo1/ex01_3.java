package modulo1;
import static java.lang.System.out;
import java.util.Scanner;

public class ex01_3 {
	
	private static boolean isValid(String word, String[] tokens) {
		for (String token : tokens)
			if (word.equals(token)) 
				return false;
		return true;
	}
	
	private static void printLine(String line, String[] forbidden) {
		String word;
		boolean first_word = true;

		out.print("filtrada: ");
		
		Scanner sc = new Scanner(line);
		while (sc.hasNext()) {
			word = sc.next();
			if (isValid(word, forbidden)) {
				if(first_word)
					first_word = false;
				else
					out.print(" ");
				out.print(word);
			}
		}
		out.println();
		sc.close();
	}

	public static void main(String[] args) {
		String line = "-";
		Scanner sc = new Scanner(System.in);

		while (!line.isEmpty()) {
			out.print("frase: ");
			line = sc.nextLine();
			if(!line.isEmpty())
				printLine(line, args);
		}
		sc.close();
	}		
}

