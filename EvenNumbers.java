package variablesmethods;

public class EvenNumbers {
	static String isEven(int a) {
		if(a%2==0) {
			return "true";
		}
		else {
			return "false";
		}
	}
	public static void main(String args[]) {
		System.out.println(isEven(10));

}
}
