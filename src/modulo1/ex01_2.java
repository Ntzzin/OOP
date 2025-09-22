package modulo1;
import static java.lang.System.out;

public class ex01_2 {
	
	private static boolean isNum(char c) {
		return (c >= '0' && c <= '9');
	}
	
	private static int isStrNum(String str) {
		for (int i = 0; i < str.length(); i++)
			if (!(isNum(str.charAt(i))))
				return 0;
		return 1;
	}
	
	private static int javaAtoi(String str) {
		int res = 0;
		for (int i = 0; i < str.length(); i++)
			if (isNum(str.charAt(i)))
				res = (res * 10) + (str.charAt(i) - '0');
			else
				return 0;
		return res;
	}
	
	public static void main(String[] args) {
		int n = 0;
		int sum = 0;
	
		for (String arg : args) {
			n += isStrNum(arg);
			sum += javaAtoi(arg);
		}
		out.println("Encontrei " + n + " inteiros");
		out.println("Encontrei " + (args.length - n) + " não inteiros");
		out.println("Somatorio dos inteiros: " + sum);

	}

}
