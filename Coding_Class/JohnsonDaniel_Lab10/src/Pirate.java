public class Pirate implements Translator{


        public String translateWord(String word)
        {


            // Ignore period or question mark
            if (word.equals(".") || word.equals("?"))
                word =  "Arr!";
            else if(word.equals("hello")){
                word =  "ahoy";
            }
            else if (word.equals("sir")){
                word =  "matey";
            }
            else if (word.equals("where")){
                word =  "whar";
            }
            else if (word.equals("is")){
                word =  "be";
            }
            else if (word.equals("the")){
                word =  "th\'";
            }
            else if (word.equals("my")){
                word =  "me";
            }
            else if (word.equals("your")){
                word =  "yer";
            }


            return word;
        }










}
