import java.io.*;

public class combined {
    public static void main(String[] args) {
        String fileName = "instructions.txt";
        
        // Create File
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        // Write to File
        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write("This is an example line.\n");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read from File
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        // Delete File
        if (new File(fileName).delete()) {
            System.out.println("Deleted the file: " + fileName);
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
