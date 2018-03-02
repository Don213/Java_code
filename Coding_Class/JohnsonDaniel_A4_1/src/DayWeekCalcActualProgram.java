import java.util.Scanner;



public class DayWeekCalcActualProgram {


    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("This program will print the day of the week for the date that you enter");

        System.out.println("Please enter the year (Number Only!): ");

        int year = keyboard.nextInt();


        System.out.println("Please enter the month (Number Only!): ");

        int month = keyboard.nextInt();


        System.out.println("Please enter the day (Number Only!): ");

        int day = keyboard.nextInt();


        System.out.println(DayWeekCalc.getDay(year, month, day));

    }




}
