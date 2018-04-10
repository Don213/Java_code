////////////////////////////////
//
// Daniel Johnson
// Assignment 7.2
// 4/3/2018
//
////////////////////////////////


////////////////////////////////
//
// DESCRIPTION:This program plays a random minuet and trio
//
//
// INPUTS:There is no input
//
//
// OUTPUTS: This outputs a minuet and a trio
//
//
//
////////////////////////////////







import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.Random;

public class MozartDiceFinal {


    public static void playFile(String filename) {
        String path = "measures\\" + filename; // use forward slash for unix/mac machines
        File wavFile = new File(path);
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(wavFile));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength()/1000);
        }
        catch (Exception e) {
            System.out.println("playFile error");
        }
    }


    // 2D array initialized to the numbers for the 11 possible minuets for
    // measures 1-16
    int minuets[][] =
    {
            {96,32,69,40,148,104,152,119,98,54,3},
            {22,6,95,17,74,157,60,84,142,130,87},
            {141,128,158,113,163,27,171,114,42,10,165},
            {41,63,13,85,45,167,53,50,156,103,61},
            {105,146,153,161,80,154,99,140,75,28,135},
            {122,46,55,2,97,68,133,86,129,37,47},
            {11,134,110,159,36,118,21,169,62,106,147},
            {30,81,24,100,107,91,127,94,123,5,33},
            {70,117,66,90,25,138,16,120,65,35,102},
            {121,39,139,176,143,71,155,88,77,20,4},
            {26,126,15,7,64,150,57,48,19,108,31},
            {9,56,132,34,125,29,175,166,82,92,164},
            {112,174,73,67,76,101,43,51,137,12,144},
            {49,18,58,160,136,162,168,115,38,124,59},
            {109,116,145,52,1,23,89,72,149,44,173},
            {14,83,79,170,93,151,172,111,8,131,78}
    };
    // 2D array initialized to the numbers for the 6 possible minuets for
    // trios 17-32
    int trios[][] =
    {
            {72,56,75,40,83,18},
            {6,82,39,73,3,45},
            {59,42,54,16,28,62},
            {25,74,1,68,53,38},
            {81,14,65,29,37,4},
            {41,7,43,55,17,27},
            {89,26,15,2,44,52},
            {13,71,80,61,70,94},
            {36,76,9,22,63,11},
            {5,20,34,67,85,92},
            {46,64,93,49,32,24},
            {79,84,48,77,96,86},
            {30,8,69,57,12,51},
            {95,35,58,87,23,60},
            {19,47,90,33,50,78},
            {66,88,21,10,91,31}
    };



    public void makePlayMinuet() {

        Random rand = new Random();
        int randNum;

        int[] tempMusic = new int[16];

        for (int i = 0; i < tempMusic.length; i++) {
            randNum = rand.nextInt(11) + 2;//the statements are redundant, but it simulates getting 2 - 12
            tempMusic[i] = minuets[i][randNum - 2];//the statements are redundant, but it simulates getting 2 - 12
        }

            for (int i = 0; i < tempMusic.length; i++) {
                playFile("m" + tempMusic[i] + ".wav");
            }
        }

    /*****************************************************************
     *
     * Name: makePlayMinuet()
     * Description: plays a minuet
     * Inputs: no input
     * Returned value: This returns no values
     * Preconditions: none
     *
     *****************************************************************/



    public void makePlayTrio() {

        Random rand = new Random();
        int randNum;

        int[] tempMusic = new int[6];

        for (int i = 0; i < tempMusic.length; i++) {
            randNum = rand.nextInt(6);//the statements are redundant, but it simulates getting 1 - 6
            tempMusic[i] = trios[i][randNum];//the statements are redundant, but it simulates getting 1 - 6
        }

        for (int i = 0; i < tempMusic.length; i++) {
            playFile("T" + tempMusic[i] + ".wav");
        }
    }

    /*****************************************************************
     *
     * Name: makePlayTrio()
     * Description: plays a trio
     * Inputs: no input
     * Returned value: This returns no values
     * Preconditions: none
     *
     *****************************************************************/


    public static void main(String[] args){

        MozartDiceFinal mdf = new MozartDiceFinal();

        System.out.println("Playing minuet.");
        mdf.makePlayMinuet();


        System.out.println("Playing trio.");
        mdf.makePlayTrio();


    }

}
