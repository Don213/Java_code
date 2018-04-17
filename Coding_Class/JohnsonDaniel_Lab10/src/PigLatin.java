/*
* PigLatin.java
*
* This class implements the Translator interface.
* It is just a demonstration, you shouldn't need to change anything in it
* for this lab.
*
* It uses the rules of pig latin to translate an English word into pig latin.
* If the first letter is a consonant, it is moved to the end and "ay" is added.
* If the first letter is a vowel, "way" is added to the end.
*/
public class PigLatin implements Translator
{
	public String translateWord(String word)
	{
		// Ignore period or question mark
		if (word.equals(".") || word.equals("?"))
			return word;
		// If the word starts with a vowel add "way" to the end
		char c = word.charAt(0);
		if ((c=='a') || (c=='e') || (c=='i') || (c=='o') || (c=='u'))
			return word + "way";
		// Extract the string without the first character, then add
		// the first character to the end plus "ay"
		return (word.substring(1) + c + "ay");
	}
}