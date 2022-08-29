package methodcalling;

public class DefaultAndStaticDemo implements DefaultAndStaticMethodDemo{
	public static void main(String[] args) {
		DefaultAndStaticDemo d = new DefaultAndStaticDemo();
		d.display();
		DefaultAndStaticMethodDemo.show();
		

	}
}

