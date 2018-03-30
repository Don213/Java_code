public class Cat extends PetRecord {

private int numLives;


public Cat(String name, int age, double weight){
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.numLives = 9;

}

public void writeOutput(){//this method overrides the last generation's writeOutput method because their signature is the same.

    super.writeOutput();
    System.out.println("Number of lives: " + numLives);

}

    public boolean equals(Object otherObj)//This method overrides the default equals method because their signature is the same.
    {
        if (otherObj == this) return true;
        if (!(otherObj instanceof Cat)) {
            return false;
        }
        Cat otherCat = (Cat) otherObj;

        if(this.name.equals(otherCat.name) && this.age == otherCat.age && ((this.weight - otherCat.weight) < 0.1 && (this.weight - otherCat.weight) > -0.1)){
            return true;
        }
        else{return false;}
    }




}
