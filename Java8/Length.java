package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Length {
	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<String>();
	    cityList.add("chennai");
	    cityList.add("mumbai");
	    cityList.add("bangalore ");
	    cityList.add("delhi");
	    cityList.add("chicago");
	    
	    List<String> outputList = cityList.stream().filter(city-> city.length() > 6 )
	    		.collect(Collectors.toList());
	    System.out.println(outputList);
	    
}
}