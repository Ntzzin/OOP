package modulo1;
import java.util.Stack;
import static java.lang.System.out;

public class ex01_5 {
	
	private static boolean isNum(char c) {
		return (c >= '0' && c <= '9');
	}
	private static boolean isOp(char c) {
		return (c == '+' || c == '-' || c == 'x' || c == '/');
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
	
	private static void doOp(Stack<Integer> s, char op) {
		switch (op) {
			case '+':
				s.push(s.pop() + s.pop());
				break;
			case '-':
				s.push(s.pop() - s.pop());
				break;
			case 'x':
				s.push(s.pop() * s.pop());
				break;
			case '/':
				s.push(s.pop() / s.pop());
				break;
		}
	}

	public static void main(String[] args) {
		char c;
		Stack<Integer> int_stack = new Stack<>();
		Stack<Character> op_stack = new Stack<>();
		
		for (String str : args) {
			c = str.charAt(0);
			if (isNum(c))
				int_stack.push(javaAtoi(str)); 
			else if (isOp(c))
				op_stack.push(c);
			else if (c == ')')
				doOp(int_stack, op_stack.pop());
		}
		out.println(int_stack.pop());
	}
}
