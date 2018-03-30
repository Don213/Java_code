public class PetRecordExecutable {




    public static void main(String[] args){



        PetRecord[] petArray1 = {
                new PetRecord("Pupper"),
                new PetRecord("Kitty Kat"),
                new PetRecord("Gator Boi"),
                new PetRecord("Turtle Boi"),
                new PetRecord("Koala MAN")

        };



        PetRecord[] petArray2 = {
                new PetRecord(petArray1[0].getName()),
                new PetRecord("Kitty Kat"),
                new PetRecord("Gator Boi"),
                new PetRecord("Turtle Boi"),
                new PetRecord("Birdy Boi")

        };


/*
        PetRecord[] petArray2 = {
                new PetRecord("Pupper"),
                new PetRecord("Kitty Kat"),
                new PetRecord("Gator Boi"),
                new PetRecord("Turtle Boi"),
                new PetRecord("Birdy Boi")

        };
*/

        for(int i =0; i < petArray1.length; i++){

            System.out.println("Array 1, Item " + i);

            petArray1[i].writeOutput();
            System.out.println();
        }


        System.out.println();
        System.out.println();


        for(int i =0; i < petArray1.length; i++){

            System.out.println("Array 2, Item " + i);

            petArray2[i].writeOutput();
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        for(int i =0; i < petArray1.length; i++){

            System.out.println("Array 1 & 2, Item " + (i+1));

            if(petArray1[i].equals(petArray2[i])){
                System.out.println("The objects are equal.");
            }
            else{System.out.println("Objects not equal.");}

            System.out.println();
        }



    }
}
