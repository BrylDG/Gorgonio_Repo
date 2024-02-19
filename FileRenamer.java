import java.io.File;

public class FileRenamer {
    public static void main(String[] args) {
        // Replace 'your_directory_path' with the path of the directory containing the files
        String directoryPath = "C:\\Users\\User\\Downloads\\Edited Videos-20240219T092006Z-001\\Edited Videos - Copy";

        renameFiles(directoryPath);
    }

    private static void renameFiles(String directoryPath) {
        File directory = new File(directoryPath);

        // Check if the specified path is a directory
        if (directory.isDirectory()) {
            // List all files in the directory
            File[] files = directory.listFiles();

            if (files != null) {
                // Loop through all files in the directory
                for (File file : files) {
                    if (file.isFile()) {
                        // Replace spaces with underscores and dashes
                        String newFileName = file.getName().replaceAll("[\\s-]+", "_");

                        // Rename the file
                        File newFile = new File(directory, newFileName);
                        file.renameTo(newFile);

                        System.out.println("Renamed: " + file.getName() + " -> " + newFileName);
                    }
                }
            } else {
                System.out.println("No files found in the directory.");
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }
}