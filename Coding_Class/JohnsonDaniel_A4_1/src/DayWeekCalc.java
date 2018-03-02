public class DayWeekCalc {

    public static boolean isLeapYear(int year) {

        if ((year % 4 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }

    }


    public static int getCenturyValue(int year) {


        String newYear = Integer.toString(year);

        String ftd = newYear.substring(0, 2);

        int ftdInt = Integer.parseInt(ftd);


        int finalValue = ((3 - (ftdInt % 4)) * 2);


        return finalValue;
    }


    public static int getYearValue(int year) {


        String newYear = Integer.toString(year);

        String ftd = newYear.substring(2, 4);

        int ftdInt = Integer.parseInt(ftd);

        int ftdDivision = ftdInt / 4;

        int finalValue = ftdInt + ftdDivision;

        return finalValue;
    }


    public static int getMonthValue(int month, int year) {

        int finalValue = 0;


        if (isLeapYear(year)) {

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

            switch (month) {
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


        return finalValue;
    }


    public static String getDay(int year, int month, int day){

        int centuryV = getCenturyValue(year);
        int yearV =getYearValue(year);
        int monthV = getMonthValue(month, year);


        int finalValue = (day + centuryV + yearV + monthV)%7;

        String finalMonthCalc = "";

        switch (finalValue) {
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


        return finalMonthCalc;
    }
}
