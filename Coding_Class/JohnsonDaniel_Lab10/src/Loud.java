public class Loud implements Translator{



        public String translateWord(String word) {


            // Ignore period or question mark
            if (word.equals(".") || word.equals("?")) {
                word = word;
            }
            else {word = word.toUpperCase();}
            return word;

        }






}
