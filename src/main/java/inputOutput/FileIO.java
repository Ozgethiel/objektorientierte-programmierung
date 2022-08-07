package inputOutput;

import java.io.*;

public class FileIO {

    public static void main(String[] args)  {

        String fileName = "C:\\Users\\Akademie\\Desktop\\output.txt";
        String[] names = {"John", "Clara", "Jerry"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write("Writing a file");
            writer.write("\nHere is another line");

//            for (int i = 0; i < names.length; i++) {
//                writer.write("\n" + names[i]);
//
//            }
            for( String name : names) {
                writer.write("\n" + name);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader reader= null;
        try {
            reader = new BufferedReader(new FileReader("output.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

