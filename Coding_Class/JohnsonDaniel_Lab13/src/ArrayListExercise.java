import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;



public class ArrayListExercise {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<String> studentList = new ArrayList<>();
        String triggered = "";

        while (!triggered.equals("quit")) {
            System.out.println("Please enter a name for the contest or enter quit to stop entering names.");
            triggered = keyboard.next();
            studentList.add(triggered);
            if(triggered.equals("quit")){
                studentList.remove("quit");
            }
        }

        for(String str : studentList){
            System.out.println(str);
        }

        for(int i = 0; i < studentList.size(); i++){
             String tempString = studentList.get(i);

             for (int counter = 0, j = 0; j < studentList.size(); j++){
                 if(tempString.equals(studentList.get(j))){
                     counter++;
                 }
                 if(tempString.equals(studentList.get(j)) && counter == 2){
                     studentList.remove(j);
                     j--;
                 }
             }
        }
        System.out.println();
        System.out.println("This is your list with duplicates removed:");
        for(String str : studentList){
            System.out.println(str);
        }
        System.out.println();

        int chosenStudent = rand.nextInt(studentList.size());

        System.out.println("The winner is: " + studentList.get(chosenStudent));

















    }
}
