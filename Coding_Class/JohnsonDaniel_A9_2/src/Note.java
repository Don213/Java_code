public class Note {

    private int noteValue;//stores int
    private int velocity;//stores int
    private int duration;//stores int


    Note(int noteValue, int velocity, int duration){
        this.noteValue = noteValue;
        this.velocity = velocity;
        this.duration = duration;
    }

    /*****************************************************************
     *
     * Name: Note()
     * Description: This is a constructor method that constructs a Note object with three inputs
     * Inputs: This takes a note value, velocity, and duration as input
     * Returned value: This returns no values
     * Preconditions: none
     *
     *****************************************************************/


    public int getNoteValue(){
        return noteValue;
    }

    /*****************************************************************
     *
     * Name: getNoteValue()
     * Description: This returns the note value
     * Inputs: This takes no input
     * Returned value: This returns the note value
     * Preconditions: none
     *
     *****************************************************************/

    public int getVelocity(){
        return velocity;
    }

    /*****************************************************************
     *
     * Name: getVelocity()
     * Description: This returns the velocity
     * Inputs: This takes no input
     * Returned value: This returns the velocity
     * Preconditions: none
     *
     *****************************************************************/

    public int getDuration(){
        return duration;
    }

    /*****************************************************************
     *
     * Name: getDuration()
     * Description: This returns the duration
     * Inputs: This takes no input
     * Returned value: This returns the duration
     * Preconditions: none
     *
     *****************************************************************/












}
