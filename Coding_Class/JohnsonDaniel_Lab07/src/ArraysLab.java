import java.util.Random;


public class ArraysLab {

    public static void main(String[] args){

        Random randomNum = new Random();


        int survey1[];
        survey1 = new int[20];


        int survey2[];
        survey2 = new int[50];


        System.out.println();
        System.out.println("These are the values for the first survey.");
        for (int i = 0; i < survey1.length; i++){
            survey1[i] = randomNum.nextInt(400) + 250;
            System.out.println(survey1[i]);
        }



        System.out.println();
        System.out.println("These are the values for the second survey.");
        for (int i = 0; i < survey2.length; i++){
            survey2[i] = randomNum.nextInt(400) + 250;
            System.out.println(survey2[i]);
        }



    }
}
