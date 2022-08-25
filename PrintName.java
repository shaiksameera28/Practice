package name;
import java.util.Scanner;

public class PrintName {
	
public static void main(String[] args) {
	String name ="Shaik Sameera";
	int count = 0;
	for(int i=0; i<=name.length(); i++) {
		for(int j=0; j<=name.length(); j++) {
			if(name.charAt(i)==name.charAt(j)) {
				count++;
			}
			System.out.println(name.charAt(i)+" : "+count);
		}
	}
}
}