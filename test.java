//I've made an edit! - Jordan
//Look at the edit. Big wow.
//third commit is the charm 
//Hello World
//Much java, very code

//This is awesome
//Print out Branch

/*
 *
 * 
 * 
 * 
 * 
 * 
 * I wonder if this will conflict with anything?
 * 
 * 
 * 
 * 
 * 
 * 
 */

// :-)
//Testing Testing
//More Testing

/// adding a new file does not affect anything, is this right?
//Much java, very code
// conflicts can always be resolvedwith patience 
//not just pullin and pushin
// I am tryign to create a local divergence here 

//Commit 1
//Commit 2

//New feature - Natalie
//Even MORE features! - Natalie

//This is a change that I made

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.PrintWriter;
import java.io.PrintWriter;

public class test {
//Testing DB Branch 
	//Stuff, Stuff, Stuff!!!!!!!!!

public static void main (String[] args) throws IOException {
	      FileInputStream fileByteStream = null; // File input stream
	      FileOutputStream fileStream = null; //File output stream
	      PrintWriter outFS = null; //File printer
	      Scanner inFS = null;	//Scanner Object
	      ArrayList<Float> Values = new ArrayList<Float>();
	      float Sum = 0;
	      float average;
	      int i;
	      int k=9/0;
	      //Try to open the file
	     //Add exception handling methods 
	      //try {
	      fileByteStream = new FileInputStream("avgFile1.txt");
	      inFS = new Scanner(fileByteStream);
	      
	      //File is open and valid (otherwise exception thrown)
	      
	      while(inFS.hasNextFloat()) {
	    	  Values.add(inFS.nextFloat());	//adds values to array list
	      }
	      
	      for(i=0; i<Values.size();i++) {
	    	  Sum = Sum + Values.get(i);  //Sums all values
	      }
	      
	      average = Sum/(Values.size());  //finds average
	      
	      fileByteStream.close(); //this is a testing file 
 
	     
	      
	      fileStream = new FileOutputStream("avgOutput1.txt");
	      outFS = new PrintWriter(fileStream);
	      
	      outFS.println("Average: ");
	      outFS.println(average);
	      outFS.flush();
	      
	      
	      System.out.println("Average: ");
	      System.out.println(average);
	      
	      
	      fileStream.close();
	      inFS.close(); //idk why you'd name it that but ok
	      
	     //}
	    // catch ( IOException II) {
	     //System.out.println("djhsjdhfsdjkfhsdjhsdjkhfdj");
	    // }
	     
	      
	      
	}

}

//adding a new commit - june 10th.

