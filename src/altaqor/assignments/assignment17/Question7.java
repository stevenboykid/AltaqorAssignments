package altaqor.assignments.assignment17;

public class Question7 {
	public static void main(String[] args) {

	       

		String sentence = "hello world, how are you?";


		        String[] words = sentence.split("\\s+");


		        StringBuilder capitalizedSentence = new StringBuilder();

		        for (String word : words) {

		            if (!word.isEmpty()) {

		                char firstLetter = Character.toUpperCase(word.charAt(0));

		                String restOfWord = word.substring(1);

		                String capitalizedWord = firstLetter + restOfWord;

		                capitalizedSentence.append(capitalizedWord).append(" ");

		            }

		        }


		        System.out.println("Capitalized sentence: " + capitalizedSentence.toString().trim());

		    }
	
	}
	
