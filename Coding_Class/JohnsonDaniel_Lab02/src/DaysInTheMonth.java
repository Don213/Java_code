//1. The break; line separates the case comparison and ends the switch statements if something comes back equal.
//2. If you misspell a month, then it will go to the switch statement's default statement: days = 31.
//3. Done
//4. Done
//5.







import java.util.Scanner;



public class DaysInTheMonth {
    public static void main(String[] args) {
        String month;
        int days;
        char answer;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the name of a month,\n" +
                "and I'll tell you how many days are in it: ");
        month = keyboard.nextLine().toLowerCase();

        switch (month) {
            case "september": //Compares month and September
            case "april": //Compares month and April
            case "june": //Compares month and June
            case "november": //Compares month and November
                days = 30; //If month is equal to any of these months, then days = 30 and the switch statement ends after the break.
                break; //Separates the months that have 30 days from the rest. It will start comparing month to February after comparing it to the previous strings.
            case "february": //Compares month to February
                System.out.print("Is it a leap year? (Y/N): ");
                answer = keyboard.nextLine().toLowerCase().charAt(0);
                if (answer == 'y') { days = 29; }
                else{ days = 28;}
                break;
            /*case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                days = 31;
                break;*/
            default:
                if (month.equals("january") || month.equals("march") || month.equals("may") || month.equals("july") || month.equals("august") ||month.equals("october") || month.equals("december")) {
                    days = 31;

                    month = month.toUpperCase().charAt(0) + month.substring(1);
                    System.out.println("There are " + days + " days in " + month + ".");
                }
                else {
                    days = -1;
                    System.out.println("I am sorry, but the month you entered is misspelled. Please restart the program and try again.");
                }
        }

        //month = month.toUpperCase().charAt(0) + month.substring(1);
        //System.out.println("There are " + days + " days in " + month + ".");
    }
}