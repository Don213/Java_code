public class ConstructorTest {


    public static void main(String[] args) {
        Car Ford = new Car();

        Car Honda = new Car("Honda", 40);

        Car Ford2 = new Car("Ford");

        Ford2.setMpg(25);


        System.out.println("The name is " + Ford.getName() + " and the mpg is " + Ford.getMpg() + ".");

        System.out.println("The name is " + Honda.getName() + " and the mpg is " + Honda.getMpg() + ".");

        System.out.println("The name is " + Ford2.getName() + " and the mpg is " + Ford2.getMpg() + ".");






        System.out.println();//Spacer
        System.out.println("This compares Ford and Honda using == and .equals()");
        //////////////
        if(Ford == Honda){//This checks if the addresses are the same.
            System.out.println("They are equal.");}

        else{System.out.println("They are not equal");}




        if (Ford.carEquals(Honda)) {
            System.out.println("They are equal.");}//This checks if they are the same.

        else{System.out.println("They are not equal.");}
        /////////////




        System.out.println();//Spacer
        System.out.println("This compares Ford and Ford2 using == and .equals()");
        //////////////
        if(Ford == Ford2){//This checks if the addresses are the same.
            System.out.println("They are equal.");}

        else{System.out.println("They are not equal");}




        if (Ford.carEquals(Ford2)) {
            System.out.println("They are equal.");}//This checks if they are the same.

        else{System.out.println("They are not equal.");}
        /////////////





    }
}
