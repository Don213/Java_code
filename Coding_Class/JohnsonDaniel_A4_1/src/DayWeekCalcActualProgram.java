////////////////////////////////
//
// Daniel Johnson
// Assignment 4.1
// 3/1/2018
//
////////////////////////////////


////////////////////////////////
//
// DESCRIPTION: This program determines the day of the week for the date that you enter.
//
//
// INPUTS: This program takes a year, month, and day as input as integers.
//
//
// OUTPUTS: This program outputs the day of the week for the date that you input.
//
//
//
////////////////////////////////












import java.util.Scanner;//imports Scanner



public class DayWeekCalcActualProgram {


    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);//makes new Scanner object

        System.out.println("This program will print the day of the week for the date that you enter");//tells user what will happen

        System.out.println("Please enter the year (Number Only!): ");//asks for user input

        int year = keyboard.nextInt();//takes user input


        System.out.println("Please enter the month (Number Only!): ");//asks for user input

        int month = keyboard.nextInt();//takes user input


        System.out.println("Please enter the day (Number Only!): ");//asks for user input

        int day = keyboard.nextInt();//takes user input


        System.out.println(DayWeekCalc.getDay(year, month, day));//uses the previous input to calculate the day of the week

    }




}
