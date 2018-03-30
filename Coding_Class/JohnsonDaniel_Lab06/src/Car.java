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




    public Car(){
        this.name = "Ford";
        this.mpg = 25;
    }

    public Car(String name, int mpg){
        this.name = name;
        this.mpg = mpg;
    }
    public Car(String name){
        this.name = name;
    }


    public boolean carEquals(Car otherObject){

        if ((this.name).equals(otherObject.getName()) && (this.mpg) == otherObject.getMpg()){
            return true;
        }
        else{return false;}

    }
}
