package com.svit.filehandling;


	import java.io.FileWriter;
	import java.io.IOException;

	public class writeFile {
		
		public static void main(String[] args) {
			try {
				
			      FileWriter myWriter = new FileWriter("sample.txt");
			      myWriter.write("This is a sample txt file created by using file handling operations!");
			      myWriter.close();
			      System.out.println("Successfully wrote to the file.");

				
			} catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();

			}
		}

	}

