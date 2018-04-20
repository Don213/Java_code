////////////////////////////////
//
// Daniel Johnson
// Assignment 9.2
// 4/17/2018
//
////////////////////////////////


////////////////////////////////
//
// DESCRIPTION: This program plays two sets of notes in succession (Both sound like the beginning of Twinkle Twinkle Little Star).
//
//
// INPUTS: There is input from a text file called Note.txt
//
//
// OUTPUTS: This outputs two sets of notes in succession
//
//
//
////////////////////////////////



import javax.sound.midi.*;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.Scanner;
import java.io.PrintWriter;




public class NoteExecutable {


    // TODO: modify this method to take a Note object and an array of type MidiChannel
    public static void playNote(Note[] noteArray, MidiChannel[] channels) {

        try {
            for (int i = 0; i < noteArray.length; i++) {

                //assigns the velocity, note value, and duration from the note array.
                int velocity = noteArray[i].getVelocity();
                int note = noteArray[i].getNoteValue();
                int duration = noteArray[i].getDuration();

                //start playing the note using instrument in slot 0
                channels[0].noteOn(note, velocity);
                //wait out the duration
                try {
                    Thread.sleep(duration);
                } catch (InterruptedException e) {
                }
                //stop playing the note
                channels[0].noteOff(note);
            }
        }catch(Exception e){//catches exception if the file cannot be read properly
            System.out.println("Sorry, there was a problem processing the file and the process was terminated.");
        }
    }

    /*****************************************************************
     *
     * Name: playNote()
     * Description: This plays a series of notes depending on the values in a Note class object array (catches exception on line 66)
     * Inputs: This takes a Note class object array and MidiChannel class object array as input
     * Returned value: This does not return any values, but plays notes depending on input from Note class object arrays
     * Preconditions: None
     *
     *****************************************************************/




    public static void main(String[] args) {


        // Initialize the synthesizer
        Synthesizer synth = null;
        try {
            synth = MidiSystem.getSynthesizer();
        }
        catch (MidiUnavailableException e) { }
        try
        {
            synth.open();
        }
        catch (MidiUnavailableException e)
        {
            e.printStackTrace();
            System.exit(1);
        }

        // Define array for musical instruments / channels

        MidiChannel[] channels = synth.getChannels();

        // TODO: modify this code to read in your text file,
        //        create Note objects in an array of type Note,
        //        and then play the notes
        // Play notes using the default for the midi channels

        Note[] note;//initialization of the note class array
        String textFileName = "Notes.txt";//name of the text file with notes

        //Initialization of various variable
        Scanner inputStream = null;
        String line = null;
        String[] split1 = null;


        int tempValue1 = 0;//This is the value that sets the length of the Note array made from the text file.
        int tempValue2 = 0;//Assigns the values of the text file to certain spots in the Note array.





        try {
            inputStream = new Scanner(new FileInputStream(textFileName));
            while (inputStream.hasNextLine()) {//continues as long as there is a next line
                line = inputStream.nextLine();//reads the next line from the file
                tempValue1++;//eventually finds the length of the text file

            }
        } catch (Exception e) { // better to catch FileNotFoundException
            //System.out.println(e.getMessage());
        }
        inputStream.close();//warns about an exception that does not happen on my computer

        note = new Note[tempValue1];//assigns length of the note array of Note class objects


        try {
            inputStream = new Scanner(new FileInputStream(textFileName));
            while (inputStream.hasNextLine()) {//continues as long as there is a next line
                line = inputStream.nextLine();//reads the next line from the file

                split1 = line.split(",");//splits the read line into an array

                note[tempValue2] = new Note(Integer.parseInt(split1[0]),Integer.parseInt(split1[1]),Integer.parseInt(split1[2]));

                tempValue2++;
            }
        } catch (Exception e) { // better to catch FileNotFoundException
            //System.out.println(e.getMessage());
        }
        inputStream.close();

        //////////////////////Creates a Note class array
        Note[] note2 = new Note[15];

        note2[0] = new Note(60, 127, 250);
        note2[1] = new Note(60, 127, 250);

        note2[2] = new Note(67, 127, 250);
        note2[3] = new Note(67, 127, 250);

        note2[4] = new Note(69, 127, 250);
        note2[5] = new Note(69, 127, 250);

        note2[6] = new Note(67, 127, 500);

        note2[7] = new Note(65, 127, 250);
        note2[8] = new Note(65, 127, 250);

        note2[9] = new Note(64, 127, 250);
        note2[10] = new Note(64, 127, 250);

        note2[11] = new Note(62, 127, 250);
        note2[12] = new Note(62, 127, 250);

        note2[13] = new Note(60, 127, 500);
        note2[14] = new Note(60, 127, 500);
        //////////////////////Creates a Note class array






        playNote(note2, channels);//Plays the hardcoded song



        //There is no stop in-between these songs



        playNote(note, channels);//plays the song from the text file






    }

}
