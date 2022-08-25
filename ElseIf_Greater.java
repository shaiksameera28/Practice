package conditionalstatement;

public class ElseIf_Greater {

	public static void main(String[] args) {
		int a =10,b =20, c =30;
		if(a>b && a>c) {
 			System.out.println("a is greatest number");
		}
		else if (b>a && b>c) {
			System.out.println("b is greatest number");
		}
		else if(c>a && c>b) {
			System.out.println("c is greatest number");
		}
		else {
			System.out.println("may be they are same");
			
		}
		

	}

}
