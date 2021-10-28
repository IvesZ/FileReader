import java.io.*;
import java.util.ArrayList;


public class FileTools {
    /**
     * Read file data
     * @param fileName String: Name of the file
     * @return ArrayList<String> with data in file
     */
    public ArrayList<String> FileReader(String fileName)  {
        ArrayList<String> ret = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new java.io.FileReader(fileName));
            String str;
            while ((str = in.readLine()) != null) {
                ret.add(str);
            }
        } catch (IOException e) {
            System.err.println();
        }
        return ret;
    }


    /**
     *  Create and write data to the file
     * @param data ArrayList<String>: Data
     * @param fileName String: Name of the file
     */
    public void FileWriter(ArrayList<String> data, String fileName)  {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
            int counter = 0;
            for(String str : data ){
                out.write(str);
                counter++;
            }
            System.out.printf("%d lines wrote to the file!\n",counter);
            out.close();
            System.out.println("File created！successfully");
        } catch (IOException e) {
            System.err.println();
        }
    }
}
