import java.util.*;

public class MathOps {

	
	ArrayList<Integer> fibonacci(int terms) {
		int t1 = 1;
		int t2 = 1;
		int t3 = 0;
		ArrayList<Integer> fibArray = new ArrayList<Integer>();
		fibArray.add(t1);
		fibArray.add(t2);
		for (int counter = 1; counter + 2 <= terms; counter ++) {
			t3 = t1 + t2;
			t1 = t2;
			t2 = t3;
			fibArray.add(t3);
		}
		for (int i = 0; i < fibArray.size(); i++) {
			//System.out.println(fibArray.get(i));
		}
		return (fibArray);
	}
	
	Integer factorial(int num) {
		int fac = 1;
		int i;
		for (i = 1; i <= num; i++) { 
			fac = fac*i;
		}
		
		return fac;
	}
	
	ArrayList<Integer> separate(Integer term) {
		Integer length = term.toString().length();
		int i;
		ArrayList<Character> charArray = new ArrayList<Character>();
		for (i = 0; i <= length-1; i++ ) {
			char s = term.toString().charAt(i);
			charArray.add(s);
		}
		int j;
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		for (j = 0; j <= charArray.size()-1; j++) {
			intArray.add((charArray.get(j).hashCode())-48);
		}
		
		
		return intArray;
	}
		
	
	
	
	
	
	
}

