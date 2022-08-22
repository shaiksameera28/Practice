import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList toyList = new ArrayList();
		toyList.add("pikachu");
		toyList.add("barbie");
		toyList.add("doll");
		toyList.add("toy car");
		toyList.add("28");
		toyList.add("28.0282828");
		toyList.add("true");
		toyList.add("null");
		toyList.remove("doll");
		System.out.println(toyList.size());
		System.out.println(toyList.contains("doreamon"));
		System.out.println(toyList);
		toyList.add(3,"doreamon");		
		System.out.println(toyList);
		toyList.set(0, "spider man");
		System.out.println(toyList);
	}

}
