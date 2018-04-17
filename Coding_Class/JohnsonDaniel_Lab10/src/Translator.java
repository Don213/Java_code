/*
* Translator.java
*
* This is the Translator interface. Any class that implements it
* must have a translateWord method with the signature shown below.
* The method should take a string that represents a word in English and
* return the word translated to the target "language".  In this lab, the
* languages are Pig Latin, Pirate-speak, and LOUD speak.
*/
public interface Translator
{
	public String translateWord(String word);
}