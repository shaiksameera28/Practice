package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CityDemo {
	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<String>();
	    cityList.add("chennai");
	    cityList.add("mumbai");
	    cityList.add("bangalore ");
	    cityList.add("delhi");
	    cityList.add("chicago");
	    
	    List<String> outputList = cityList.stream().filter(city-> city.startsWith("c"))
	    		.collect(Collectors.toList());
	    System.out.println(outputList);
	    List<String> contain = cityList.stream().filter(city-> city.contains("ai"))
	    		.collect(Collectors.toList());
	    System.out.println(contain);
	    List<String> append = cityList.stream().map(city-> city.concat("metro"))
	    		.collect(Collectors.toList());
	    System.out.println(append);
	    List<String> sortedList = cityList.stream().sorted()
	    		.collect(Collectors.toList());
	    System.out.println(sortedList);
	   long count = cityList.stream().filter(city-> city.startsWith("c")).count();
	    System.out.println(count);
	    Optional<String> first = cityList.stream().filter(city-> city.equals("bangalore"))
	    		.findFirst();
	    System.out.println(first);
	  
}
}