import java.lang.invoke.SwitchPoint;

public class MysteryDigits {

    public static void main(String[] args) {

                int c1;
                int c2;
                int c3;
                int c4;
                int mysteryNumber01 = 1001;

        String mysteryNumber02;



        while(mysteryNumber01 < 10000) {
            mysteryNumber02 = Integer.toString(mysteryNumber01);

            c1 = Integer.parseInt(mysteryNumber02.substring(0, 1));
            c2 = Integer.parseInt(mysteryNumber02.substring(1, 2));
            c3 = Integer.parseInt(mysteryNumber02.substring(2, 3));
            c4 = Integer.parseInt(mysteryNumber02.substring(3, 4));



            if ((c1 != c2) && (c1 != c3) && (c1 != c4) && (c2 != c3) && (c2 != c4) && (c3 != c4) && ((c1*3) == c3) && ((c1 + c2 + c3 + c4) == 27)){

                System.out.println("The Riddler plans to strike at " + mysteryNumber01 + " Lake Otis Parkway!");
                System.out.println("Hurry up before he makes his next move!");
                System.exit(0);
            }
            else{
                mysteryNumber01 = mysteryNumber01 + 2;

            }
        }
    }
}

