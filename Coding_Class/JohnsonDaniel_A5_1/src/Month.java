public class Month {
    private int month;

    public Month() {//a default constructor that sets the month value equal to 4
        month = 4;
    }

    public Month(int month){//a constructor that assigns a value to month depending on the integer passed through it
        this.month = month;
    }

    public Month(String month){//a constructor that assigns a value to month depending on a three letter string
        switch(month.toLowerCase()){//switch statement evaluates which string month was entered to assign a integer value to the variable month
            case "jan":
                this.month = 1;
                break;
            case "feb":
                this.month = 2;
                break;
            case "mar":
                this.month = 3;
                break;
            case "apr":
                this.month = 4;
                break;
            case "may":
                this.month = 5;
                break;
            case "jun":
                this.month = 6;
                break;
            case "jul":
                this.month = 7;
                break;
            case "aug":
                this.month = 8;
                break;
            case "sep":
                this.month = 9;
                break;
            case "oct":
                this.month = 10;
                break;
            case "nov":
                this.month = 11;
                break;
            case "dec":
                this.month = 12;
                break;
        }



    }


    public int getMonthInt(){
        return this.month;//returns month as an int
    }

    public String getMonthString(){//returns a string of the month

        String monthString= "";

        //This switch statement assigns a three letter representation of each month depending on which number is passed through
        switch(this.month){
            case 1:
                monthString = "jan";
                break;
            case 2:
                monthString = "feb";
                break;
            case 3:
                monthString = "mar";
                break;
            case 4:
                monthString = "apr";
                break;
            case 5:
                monthString = "may";
                break;
            case 6:
                monthString = "jun";
                break;
            case 7:
                monthString = "jul";
                break;
            case 8:
                monthString = "aug";
                break;
            case 9:
                monthString = "sep";
                break;
            case 10:
                monthString = "oct";
                break;
            case 11:
                monthString = "nov";
                break;
            case 12:
                monthString = "dec";
                break;
        }
        return monthString;//returns a string representing a month
    }

    public Month nextMonth(){//returns an object with the variable month being one month later (month + 1)
        if (this.month < 12) {
            Month nextMonth = new Month((this.month + 1));
            return nextMonth;
        }
        else {
            Month nextMonth = new Month(1); //makes sure december becomes january
            return nextMonth;
        }


    }

}
