package streams;
import java.util.Optional;

public class optional {

		public static void main(String[] args) {

				String[] words = new String[5];

				Optional<String> checkNull = Optional.ofNullable(words[3]);

				if(checkNull.isPresent()) {
					String word = words[3].toLowerCase();
					System.out.println(word);
				}
				else {
					System.out.println("word is null");
				}

			}
		}
	

