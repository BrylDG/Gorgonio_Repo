import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileListerAndWriter {
    public static void main(String[] args) {
        // Replace 'your_directory_path' with the path of the directory containing the files
        String directoryPath = "C:\\Users\\User\\Downloads\\content";

        listFilesAndCreateTextFile(directoryPath);
    }

    private static void listFilesAndCreateTextFile(String directoryPath) {
        File directory = new File(directoryPath);

        // Check if the specified path is a directory
        if (directory.isDirectory()) {
            // List all files in the directory
            File[] files = directory.listFiles();

            if (files != null) {
                // Print the list of filenames
                System.out.println("Filenames in the directory:");
                for (File file : files) {
                    System.out.println(file.getName());
                }

                // Create a new text file (change the filename if needed)
                String outputFilePath = "file_list2.txt";

                // Write the list of filenames to the text file
                try (FileWriter writer = new FileWriter(outputFilePath)) {
                    writer.write("Filenames in the directory:\n");
                    for (File file : files) {
                        writer.write(file.getName() + "\n");
                    }
                    System.out.println("\nFile list written to " + outputFilePath);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("No files found in the directory.");
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }
}