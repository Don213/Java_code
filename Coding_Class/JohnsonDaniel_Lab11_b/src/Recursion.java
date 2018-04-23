public class Recursion {


    private static int numPins(int num){

        if(num == 0){
            return 0;
        }
        else if(num == 1){
            return 1;
        }
        else {
            return (num + numPins((num - 1)));
        }



    }


    public static void main(String[] args){

        System.out.println(numPins(6));
    }


}
