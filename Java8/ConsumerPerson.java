package java8;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerPerson {
	public static void main(String args[]) {

	 Consumer<Person> c1 = (per)-> System.out.println(per);
     Consumer<Person> c2 = (per)-> System.out.println(per.getGender().toUpperCase());
     Consumer<Person> c3= (per)-> {
    System.out.print("New year bonus : ");
    System.out.println(per.getSalary()+1000);};
    
     List<Person> personList = PersonRepository.getAllPersons();
     personList.forEach(c2);
     personList.forEach(per -> {
     c3.accept(per);
     }
     );
}
}
