////////////////////////////////
//
// Daniel Johnson
// Assignment 10.2
// 4/26/2018
//
////////////////////////////////


////////////////////////////////
//
// DESCRIPTION: This program has the user traverse through a simulated maze and it can either end with them escaping or
// suffering a horrendous fate (Or lost in the maze forever).
//
//
// INPUTS: This takes input from the user by asking them what direction they want to go when traversing the maze.
// New objects are created with String input as their name variable filled and then their NSEW arrays filled with the
// other new objects as inputs in set methods as well. The current (starting location in maze), end (end location in
// maze with happy ending), and the unsafe (end location with unhappy ending) variables are also set with chosen objects.
//
//
// OUTPUTS: This outputs the directions that the user can go and if the user escaped or suffered a horrendous fate.
//
//
//
////////////////////////////////



public class PassageExecutable{

    public static void main(String[] args){
        UndergroundPassage statM = new UndergroundPassage();//created for the specific reason of referencing static methods


        //These are created and then have each other assigned to
        //their NSEW (North, South, East, West) arrays in order
        //to reference each other for directional use later
        UndergroundPassage a = new UndergroundPassage("a");//new passage object instance
        UndergroundPassage b = new UndergroundPassage("b");//new passage object instance
        UndergroundPassage c = new UndergroundPassage("c");//new passage object instance
        UndergroundPassage d = new UndergroundPassage("d");//new passage object instance
        UndergroundPassage e = new UndergroundPassage("e");//new passage object instance
        UndergroundPassage f = new UndergroundPassage("f");//new passage object instance
        UndergroundPassage g = new UndergroundPassage("g");//new passage object instance
        UndergroundPassage h = new UndergroundPassage("h");//new passage object instance
        UndergroundPassage i = new UndergroundPassage("i");//new passage object instance


        ////////////The following setup the NSEW (North, South, East, West) arrays
        ////////////for directional use.
        a.setSouth(b);
        a.setEast(c);

        b.setNorth(a);
        b.setSouth(e);
        b.setEast(c);

        c.setNorth(a);
        c.setSouth(b);
        c.setEast(d);

        d.setNorth(f);
        d.setSouth(e);
        d.setEast(g);
        d.setWest(c);

        e.setNorth(d);
        e.setEast(h);
        e.setWest(b);

        f.setSouth(d);

        g.setSouth(h);
        g.setWest(d);

        h.setNorth(g);
        h.setEast(i);
        h.setWest(e);

        i.setWest(h);
        ////////////
        ////////////



        statM.setUnsafe(f);//Sets a point to stop at in the maze
        statM.setCurrent(a);//sets the starting point of the maze
        statM.setEnd(i);//sets the ending point of the maze
        statM.goingThroughPassage();//a method that has you traverse through the arrays until your reach the end or unsafe point


    }




}







