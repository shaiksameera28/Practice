package streams;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class NameLength {
	

		public static void main(String[] args) {
			ArrayList<String> nameList = new ArrayList<>();
			nameList.add("shaik sameera");
			nameList.add("aisha");
			nameList.add("ajay kumar");
			nameList.add("vishal");
			List<String> outputList = nameList.stream().filter(a -> a.length()>7).map(a -> a.toUpperCase()).collect(Collectors.toList());
			System.out.println(outputList);
		}

	}

