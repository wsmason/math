import java.util.Scanner;

public class Workspace extends MathOps {
	
	public static void main(String[] args) {
		String result = null;
		MathOps op1 = new MathOps();
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		int input = scanner.nextInt();
		int input2 = scanner2.nextInt();
		scanner.close();
		scanner2.close();
		switch (input) {
		case 1: result = op1.fibonacci(input2).toString();
				break;
		case 2: result = op1.factorial(input2).toString();
				break;
		case 3: result = op1.separate(input2).toString();
				break;
		}
	
	 
		System.out.println(result);
		scanner.close();
	
	}

}
