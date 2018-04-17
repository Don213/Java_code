////////////////////////////////
//
// Daniel Johnson
// Assignment 8.1
// 4/10/2018
//
////////////////////////////////


////////////////////////////////
//
// DESCRIPTION: This program creates an object list of my favorite books and outputs their names and prices
//
//
// INPUTS: There is no user input for this program
//
//
// OUTPUTS: This outputs the names and the prices of some of my favorite books
//
//
//
////////////////////////////////









public class BookExecutable {

    public static void main(String[] args) {

        Book[] books = { //I do not read Non-Fiction books very often (only when forced).
                new Fiction("Harry Potter"),
                new Fiction("Charlie Bone"),
                new Fiction("Theodore Boone"),
                new NonFiction("Unbroken"),
                new Fiction("One Piece")
        };


        for (Book b : books){//prints book names and prices using a foreach loop.
            b.toString("");
        }


    }
}
