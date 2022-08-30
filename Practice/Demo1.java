package Practice;

public class Demo1 {
	public static void main(String[] args) {
		String str = "That was great - lol.";
		String new_str = str.replaceAll("lol", "laugh out loud");
		System.out.println("Original string: " + str);
		System.out.println("New string: " + new_str);
		
}
}