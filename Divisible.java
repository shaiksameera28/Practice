package conditionalstatement;

public class Divisible {

	public static void main(String[] args) {
	int a = 22;
	if((a%2==0)&&(a%11==0)) {
		System.out.println("a is divisible in 2 and 11");
	}
	else {
		System.out.println("a may not be divisible in 2 and 11");
	}

	}

}
