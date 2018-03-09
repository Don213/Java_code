public class MonthTest {

    public static void main(String[] args){


        Month defaultMonth = new Month();//creates new month object with default constructor
        Month numMonth = new Month(2);//creates new month object with int as constructor input
        Month strMonth = new Month("jan");//creates new month object with string as constructor input
        Month testMonth = defaultMonth.nextMonth();//creates new month object using the nextMonth() method to return the next month of the current month object


        System.out.println();


        //The next lines test the methods for the Month class and describe what they are testing

        System.out.println("defaultMonth test:");

        System.out.println("This is the getMonthInt method test for defaultMonth: " + defaultMonth.getMonthInt() + " is equal to 4");
        System.out.println("This is the getMonthString method test for defaultMonth: " + defaultMonth.getMonthString() + " is the same as apr");


        System.out.println();
        System.out.println("numMonth test:");


        System.out.println("This is the getMonthInt method test for numMonth: " + numMonth.getMonthInt() + " is equal to 2");
        System.out.println("This is the getMonthString method test for numMonth: " + numMonth.getMonthString() + " is the same as feb");


        System.out.println();
        System.out.println("strMonth test:");


        System.out.println("This is the getMonthInt method test for strMonth: " + strMonth.getMonthInt() + " is equal to 1");
        System.out.println("This is the getMonthString method test for strMonth: " + strMonth.getMonthString() + " is the same as jan");


        System.out.println();
        System.out.println("testMonth test");


        System.out.println("This is the getMonthInt method test for testMonth: " + testMonth.getMonthInt() + " is equal to 5");
        System.out.println("This is the getMonthString method test for testMonth: " + testMonth.getMonthString() + " is the same as may");
        System.out.println("April is before " + testMonth.getMonthString());//tests the testMonth() method
    }
}
