public class Car {

    private String name;
    private int mpg;



    public String getName(){return name;}
    public int getMpg(){return mpg;}


    public void setName(String name1){

        name = name1;

        //return null;
    }


    public void setMpg(int mpg1){

        mpg = mpg1;

        //return null;
    }


    public void writeOutput(){

        System.out.println("Name: " + name);
        System.out.println("MPG: " + mpg);
    }

}
