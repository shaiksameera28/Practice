package methodcalling;

public interface DefaultAndStaticMethodDemo {
  default void display() {
	System.out.println("default method");
}
   static void show() {
	   System.out.println("static method");
	   
   }
}

