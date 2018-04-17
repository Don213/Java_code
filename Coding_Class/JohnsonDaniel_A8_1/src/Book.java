public class Book {


    private String bookName; //name of book
    private double bookPrice; //price of book

    Book(String bookName){
        this.bookName = bookName;
    }

    /*****************************************************************
     *
     * Name: Book()
     * Description: Constructor for Book class that sets up its name
     * Inputs: Takes a name for a book as input
     * Returned value: This returns no values
     * Preconditions: None
     *
     *****************************************************************/



    public String getBookName(){
        return bookName;
    }

    /*****************************************************************
     *
     * Name: getBookName()
     * Description: returns the name of the book
     * Inputs: no input
     * Returned value: This returns a String value (book's name)
     * Preconditions: none
     *
     *****************************************************************/



    public double getBookPrice(){
        return bookPrice;
    }

    /*****************************************************************
     *
     * Name: getBookPrice()
     * Description: Returns the book's price
     * Inputs: Takes no input
     * Returned value: Returns a double value (The book's price)
     * Preconditions: None
     *
     *****************************************************************/



    public void setPrice(double bookPrice){
        this.bookPrice = bookPrice;
    }

    /*****************************************************************
     *
     * Name: setPrice()
     * Description: Sets the price of the book
     * Inputs: This takes a double input as the price value it will assign to the book
     * Returned value: This returns no values
     * Preconditions: None
     *
     *****************************************************************/



    public String toString(String x){
        System.out.println("The name of the book is " + this.bookName + ", and its price is " + this.bookPrice + "0.");
        return null;
    }

    /*****************************************************************
     *
     * Name: toString
     * Description: This outputs the name and the price of the book
     * Inputs: This takes a String input that was required to overload the method (input does nothing inside of the method)
     * Returned value: This returns no values (null)
     * Preconditions: None
     *
     *****************************************************************/



}
