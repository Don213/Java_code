public class CompareCars {


    public static void main(String[] args){

        Car honda = new Car();
        Car ford = new Car();


        honda.setMpg(25);
        honda.setName("Civic");

        ford.setMpg(30);
        ford.setName("Focus");

        //honda.mpg = 20;
        //ford.mpg = 35;

        //honda.name = "2018 Honda Accord Sedan";
        //ford.name = "2018 Ford Focus";

        int mpg1 = honda.getMpg();
        int mpg2 = ford.getMpg();

        String name1 = honda.getName();
        String name2 = ford.getName();


        if (mpg1 > mpg2){
            System.out.println("The " + name1 + " has better fuel mileage");
        }
        else{System.out.println("The " + name2 + " has better fuel mileage");}


        ford.writeOutput();
        honda.writeOutput();

    }
}
