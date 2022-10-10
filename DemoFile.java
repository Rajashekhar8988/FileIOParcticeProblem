package bridgeLabz.FileReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class DemoFile {
	//method to write the content into the file
    static void writeTextFileContent(String fileURL){
    	//writing the content of an array
    	String[] names= {"Nani","Raju","Komal"};
    //Using try catch block to handle the exception	
    	try{
    //Using FileWriter and BufferedWriter classes to write the content 		
    	FileWriter fileWriterObject = new FileWriter(fileURL);
    	BufferedWriter writer = new BufferedWriter(fileWriterObject);
    	  writer.write("Rama is a good boy");
    	  writer.write("\nLakshman is a good boy");
    	  for(String name:names) {
    		  writer.write("\n"+name);
    	  }
    	  writer.close();
    	}  catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    //method to append the data to an existing file
    static void appendContentToFile(String fileURL) {
    	try {
    		FileWriter fileWriterObject = new FileWriter(fileURL,true);
    		BufferedWriter writer = new BufferedWriter(fileWriterObject);
    		writer.write("\nRama is an elder brother of lakshman");
    		  writer.close();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	}

	//method to read the content from the file
    static void readTextFileContent(String fileURL){
		try {
	//Using FileReader and BufferedReader classes to write the content 		
		FileReader fileReaderObject=new FileReader(fileURL);
    	BufferedReader reader = new BufferedReader(fileReaderObject);
    	String line;
				while((line=reader.readLine()) != null) {
					System.out.println(line);
				}
				 reader.close();
	}  catch(Exception e) {
		e.printStackTrace();
	}
	}
    //main method
public static void main(String[] args) {
	try {
		//using the scanner class to enter the file path by the user
		Scanner filePath =new Scanner(System.in);
		System.out.println("Enter the path of the file : ");
		String fileURL =filePath.next();
		writeTextFileContent(fileURL);
		appendContentToFile(fileURL);
		readTextFileContent(fileURL);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
