public class NonFiction extends Book{

    private void setPrice(){
        setPrice(28.50);
    }

    /*****************************************************************
     *
     * Name: setPrice()
     * Description: This sets the price of the non-fiction book
     * Inputs: This takes no input
     * Returned value: This returns no values
     * Preconditions: None
     *
     *****************************************************************/


    public NonFiction(String bookName){
        super(bookName);
        setPrice();
    }

    /*****************************************************************
     *
     * Name: NonFiction
     * Description: This is a constructor that sets up the name and the price of the non-fiction book
     * Inputs: This takes a string as the name of the book for input
     * Returned value: This returns no values
     * Preconditions: None
     *
     *****************************************************************/



}
