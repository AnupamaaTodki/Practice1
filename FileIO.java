package com.practice.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {
	public static void main(String args[]) throws IOException {
		
		File myFile = new File("E:\\LFP191\\dummmy.txt");
		myFile.createNewFile();
		System.out.println(myFile.getAbsolutePath());
		System.out.println(myFile.getName());
		System.out.println(myFile.getParent());
		System.out.println(myFile.isDirectory());
		
		FileWriter myWriter = new FileWriter("E:\\LFP191\\dummmy.txt");
		myWriter.write("I am feeling File IO is tricky");
		myWriter.close();
		System.out.println("Successfully update the file");
		
		Path filePath = Paths.get("E:\\LFP191\\dummmy.txt");
		Files.delete(filePath);
		System.out.println("deleted file");
		
		// Path filePath1 = Paths.get("E:\\LFP191\\dummy.txt");
		Reader reader = Files.newBufferedReader(Paths.get("E:\\LFP191\\dummy.txt"));
		System.out.println(reader);
	}

}
