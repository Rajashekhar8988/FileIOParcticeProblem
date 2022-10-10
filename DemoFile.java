package bridgeLabz.FileReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class DemoFile {
	//method to write the content into the file
    static void writeTextFileContent(String fileURL){
    //Using try catch block to handle the exception	
    	try{
    //Using FileWriter and BufferedWriter classes to write the content 		
    	FileWriter fileWriterObject = new FileWriter(fileURL);
    	BufferedWriter writer = new BufferedWriter(fileWriterObject);
    	  writer.write("Rama is a good boy");
    	  writer.write("\nLakshman is a good boy");
    	  writer.close();
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
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
