public class CompareCars {


    public static void main(String[] args){

        Car honda = new Car();

        Car ford = new Car();

        int mpg1 = honda.getMpg();
        int mpg2 = ford.getMpg();




        honda.setMpg();
        honda.setName();

        ford.setMpg();
        ford.setName();
        //honda.mpg = 20;
        //ford.mpg = 35;

        //honda.name = "2018 Honda Accord Sedan";
        //ford.name = "2018 Ford Focus";

        String name1 = honda.getName();
        String name2 = ford.getName();


        if (mpg1 > mpg2){
            System.out.println("The " + name1 + " has better fuel mileage");
        }
        else{System.out.println("The " + name2 + " has better fuel mileage");}


    }
}
