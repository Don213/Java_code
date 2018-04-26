////////////////////////////////
//
// Daniel Johnson
// Assignment 10.1
// 4/26/2018
//
////////////////////////////////


////////////////////////////////
//
// DESCRIPTION: This program finds a file by looking recursively through directories.
//
//
// INPUTS: There is no user input, but there needs to be a starting directory name and a name for the file searched for
// in string form.
//
//
// OUTPUTS: This outputs the path name of the file searched for or tells you the file was not found.
//
//
//
////////////////////////////////









import java.io.File;

public class FileSearch {

    public static String searchForFile(File currentFolder, String fileName) {

        String finalFilePath = "";

        if (!currentFolder.isDirectory()) {
            if (currentFolder.getName().equals(fileName)) {
                return currentFolder.getAbsolutePath();
            }
        } else {
            File[] tempFileArray = currentFolder.listFiles();

            if(!(tempFileArray == null)) {
                for (int i = 0; i < tempFileArray.length; i++) {
                    String tempString = searchForFile(tempFileArray[i], fileName);
                    if (!tempString.equals("")) {
                        finalFilePath = tempString;
                    }
                }

            }


        }

        return finalFilePath;
    }


    /*****************************************************************
     *
     * Name: searchForFile()
     * Description: This searches for a file recursively using a given starting directory and a name to search for
     * Inputs: This takes a current folder name in string form (starting location) and a file name in string form to search for.
     * Returned value: This returns the file path in string form for the file you searched for (first one found) it will return "" if there is no file found
     * Preconditions: Starting directory must exist or errors will ensue
     *
     *****************************************************************/





    public static void main(String[] args) {


        String filePath = "C:\\Users";//A name for the starting location of the search
        File codeRepository = new File(filePath);//new object to access file searching method

        String finalFilePath = searchForFile(codeRepository, "FileSearch.java");

        if (finalFilePath.equals("")) {//method returns this if file not found
            System.out.println("File not found");//tells that the file was not found
        } else {
            System.out.println("File found at: " + finalFilePath);//tells what the file path was
        }
    }
}
