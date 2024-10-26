package calc;

public class CalView {

	public static void main(String[] args) {
		try {
			System.out.print(Calculator.add("//;\n1;2\n4"));
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
		
	}

}
