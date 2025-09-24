
package com.tnsif.task8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
public class exceptionfinal {


    public static void main(String[] args) {
        FileWriter fileWriter = null;

        try {
            // Create a file to write to.
            fileWriter = new FileWriter("example.txt");
            System.out.println("File 'example.txt' opened successfully.");

            // This will cause an IOException, demonstrating that 'finally' still executes.
            if (true) {
                throw new IOException("Simulating an I/O error.");
            }
            
            fileWriter.write("This line will not be written to the file.");

        } catch (FileNotFoundException e) {
            System.err.println("Error: The file was not found.");
        } catch (IOException e) {
            System.err.println("An I/O exception occurred: " + e.getMessage());
        } finally {
            // The 'finally' block ensures that the file is closed, whether an exception occurred or not.
            System.out.println("Attempting to close the file.");
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                    System.out.println("File closed successfully.");
                }
            } catch (IOException e) {
                System.err.println("Error closing the file: " + e.getMessage());
            }
        }
        System.out.println("Program finished.");
    }
}