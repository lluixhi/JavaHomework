/* Project 7-8
 *
 * Uses a scanner to report word count, 
 * average word length, and sentence length
 * 
 */
import java.util.Scanner;
public class wordStats78 {
	public static void main(String [] args) {
		Scanner reader = new Scanner(System.in);

		// Keep taking inputs.
		while (true) {
			System.out.print("Enter a sentence: ");
			String input = reader.nextLine();

			// Quit when the user presses just Enter
			if (input.equals(""))
				break;

			// Initialize the counters and indexes
			int wordCount = 0;
			int sentenceLength = 0;
			int beginPosition = 0;
			int endPosition = input.indexOf(' ');

			// Continue until there are no more spaces
			while (endPosition != -1) {

				// If at least one word was seen
				if (endPosition > beginPosition) {
					wordCount++;
					String word = input.substring(beginPosition, endPosition);
					sentenceLength += word.length();
				}
				
				// Update the indexes to go to the next word
				beginPosition = ++endPosition;
				endPosition = input.indexOf(' ', beginPosition);
			}

			// If there is a non-space character at the end of a sentence, call it a
			// word
			if (beginPosition < input.length()) {
				wordCount++;
				String word = input.substring(beginPosition, input.length());
				sentenceLength += word.length();
			}

			if (wordCount > 0) {
				System.out.println("Word count: " + wordCount);
				System.out.println("Sentence length: " + sentenceLength);
				System.out.println("Average word length: " + sentenceLength / wordCount);
			}
		}
	}
}
