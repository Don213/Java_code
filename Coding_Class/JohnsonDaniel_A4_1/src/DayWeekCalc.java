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






public class DayWeekCalc {

    public static boolean isLeapYear(int year) {//a method for determining if the year is a leap year

        if ((year % 4 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }

    }


    public static int getCenturyValue(int year) {//a method for determining the century value for later


        String newYear = Integer.toString(year);//converts to string to make a substring later

        String ftd = newYear.substring(0, 2);//pulls a substring

        int ftdInt = Integer.parseInt(ftd);//turns substring back into an integer


        int finalValue = ((3 - (ftdInt % 4)) * 2);//determines the century value


        return finalValue;//returns century value
    }


    public static int getYearValue(int year) {


        String newYear = Integer.toString(year);//converts to string to make a substring later

        String ftd = newYear.substring(2, 4);//pulls a substring

        int ftdInt = Integer.parseInt(ftd);//turns substring back into an integer


        ////determines year value
        int ftdDivision = ftdInt / 4;
        int finalValue = ftdInt + ftdDivision;
        ////determines year value



        return finalValue;//returns year value
    }


    public static int getMonthValue(int month, int year) {

        int finalValue = 0;//initializes finalValue


        if (isLeapYear(year)) {//a switch statement that gives values for each month value if it is a leap year

            switch (month) {
                case 1:
                    finalValue = 6;
                    break;
                case 2:
                    finalValue = 2;
                    break;
                case 3:
                    finalValue = 3;
                    break;
                case 4:
                    finalValue = 6;
                    break;
                case 5:
                    finalValue = 1;
                    break;
                case 6:
                    finalValue = 4;
                    break;
                case 7:
                    finalValue = 6;
                    break;
                case 8:
                    finalValue = 2;
                    break;
                case 9:
                    finalValue = 5;
                    break;
                case 10:
                    finalValue = 0;
                    break;
                case 11:
                    finalValue = 3;
                    break;
                case 12:
                    finalValue = 5;
                    break;
            }
        } else {

            switch (month) {//a switch statement that gives values for each month value if it is not a leap year
                case 1:
                    finalValue = 0;
                    break;
                case 2:
                    finalValue = 3;
                    break;
                case 3:
                    finalValue = 3;
                    break;
                case 4:
                    finalValue = 6;
                    break;
                case 5:
                    finalValue = 1;
                    break;
                case 6:
                    finalValue = 4;
                    break;
                case 7:
                    finalValue = 6;
                    break;
                case 8:
                    finalValue = 2;
                    break;
                case 9:
                    finalValue = 5;
                    break;
                case 10:
                    finalValue = 0;
                    break;
                case 11:
                    finalValue = 3;
                    break;
                case 12:
                    finalValue = 5;
                    break;

            }
        }


        return finalValue; //returns month value
    }


    public static String getDay(int year, int month, int day){//a method to determine the day of the month by using the other previous methods

        int centuryV = getCenturyValue(year);//returns century value and assigns it to a variable
        int yearV =getYearValue(year);//returns year value and assigns it to a variable
        int monthV = getMonthValue(month, year);//returns month value and assigns it to a variable


        int finalValue = (day + centuryV + yearV + monthV)%7;//calculates value for the day of the week

        String finalMonthCalc = "";//initializes finalMonthCalc

        switch (finalValue) {//determines the day of the week using all of the previous methods
            case 0:
                finalMonthCalc = "Sunday";
                break;
            case 1:
                finalMonthCalc = "Monday";
                break;
            case 2:
                finalMonthCalc = "Tuesday";
                break;
            case 3:
                finalMonthCalc = "Wednesday";
                break;
            case 4:
                finalMonthCalc = "Thursday";
                break;
            case 5:
                finalMonthCalc = "Friday";
                break;
            case 6:
                finalMonthCalc = "Saturday";
                break;

        }


        return finalMonthCalc;//returns the day of the week.
    }
}
