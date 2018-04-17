



import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.PrintWriter;


public class Popularity {
    public static void main(String[] args) {



        /***** Example 1: read delimited text file ********/
        // for relative paths, place the file the current directory
        //      or the project directory for NetBeans
        //String fname = "L18_words.txt";
        //String fname = "GirlNames2015.txt";
        String dname = "BoyNames2015.txt";

        String line;
        String[] split1, split2;


        Scanner inputStream = null;
        int tempValue = 0;
        String[] tempArray1 = {};
        String[] tempArray2 = {};
        String[] tempArray3 = {};






        try {
            inputStream = new Scanner(new FileInputStream(dname));
            while (inputStream.hasNextLine()) {




                //System.out.println(inputStream.nextLine());
                line = inputStream.nextLine();




                split1 = line.split(" ");


                if(split1[1].equals("Dal")) {
                    System.out.println("Daniel is rank " + split1[0] + " an occurs " + split1[2] + " times.");

                    tempValue = 24;
                }
                //else{System.out.println("Name not in top 1000");}



            }
        }
        catch (Exception e) { // better to catch FileNotFoundException
            System.out.println(e.getMessage());
        }



        if(tempValue != 24){
            System.out.println("Name not in top 1000");
        }


    }


}
