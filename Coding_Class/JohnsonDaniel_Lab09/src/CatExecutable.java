public class CatExecutable {


    public static void main(String[] args){

        Cat cat = new Cat("kat",2,24);

        Cat kat = new Cat("kat",2,24);


        cat.writeOutput();

        System.out.println("It is " + cat.equals(kat)  + " that the cat and kat objects are equal");
        /*Without adding an equals method to the class file, this will only compare the location of the objects*/


    }
}
