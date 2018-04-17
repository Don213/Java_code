/*****************************************
 * CSCE A201 Lab
 * Test of the Translator interface
 *
 *******************************************/
public class Main
{
	public static void main(String[] args)
	{
		String sentence;
		sentence = "hello sir what is your name ? where is the classroom ?";

		PigLatin pig = new PigLatin();
		Pirate pir = new Pirate();
		Loud rawr = new Loud();
		// Create a Pig Latin object
		translate(sentence, pir);

		System.out.println();

		translate(sentence, rawr);

		// Uncomment the following four lines
		// after you complete the Pirate and Loud classes to
		// test them out
		/*
		Pirate pirate = new Pirate();
		translate(sentence, pirate);

		Loud yelling = new Loud();
		translate(sentence, yelling);
		*/
	}

	public static void translate(String s, Translator translator)
	{
		// Get each word in the sentence
		String[] words = s.split(" ");	// This puts each word from s into an array, delimited by a space
		for (String word : words)		// This is a for-each loop that iterates through each word in the array
		{
			System.out.print(translator.translateWord(word));		// Translate each word and print it
			System.out.print(" ");
		}
		System.out.println();
	}
}