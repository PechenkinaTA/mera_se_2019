package ru.mera.pechenkina.task10;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class SequantialIO {


	   static final int OUTPUT_STRING_LENGTH = 20;

	   
	    public static void main(String[] args) throws IOException {
	    	
	    	List<String> stringArray = new ArrayList<>(10);
	        
	        //string containing allowed characters, modify according to your needs
	        String strAllowedCharacters = 
	                "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	                
	        //initialize Random
	        Random random = new Random();

	       //create array with 1000 strings 
	        for (int i=0; i <= 999; i++) {
	        	String stringToBeAdded = getNextRandomString(strAllowedCharacters, random);
	        	//System.out.println("stringToBeAdded " + stringToBeAdded);
	        	stringArray.add(stringToBeAdded);
	        }
	        
	        //print array with 1000 strings + add strings to files in sequential mode and check time of execution
	        long startTimeOfsequentialWritingToFiles = System.nanoTime();
	        for (int i=0; i <= stringArray.size()-1; i++) {
	        	String filename = i +".txt";
	        	//System.out.println("Elements in array: " + stringArray.get(i));
	        	
	        	File file = new File("C:\\Users\\Лисенок\\workspace\\_pechenkinat\\10\\ru\\mera\\pechenkina\\task10\\strings_sequential\\"+ filename);

	        	
	        	try (FileOutputStream fileOutputStream = new FileOutputStream(file);) {
	        		fileOutputStream.write(stringArray.get(i).getBytes()); 
	        		fileOutputStream.close();
	        		
	        	} catch(IOException ex){
	                
	                System.out.println(ex.getMessage());
	            }  
	        } 
	        
	        
	        long finishTimeOfsequentialWritingToFiles = System.nanoTime();
	        System.out.println("Speed of sequential writing to files = " + (finishTimeOfsequentialWritingToFiles - startTimeOfsequentialWritingToFiles));
	        
	       
	        
	        //read stringsSequential from all files and check time of execution
	        long startTimeOfsequentialReadingFromFiles = System.nanoTime();
	        Integer filesInDir = new File("C:\\Users\\Лисенок\\workspace\\_pechenkinat\\10\\ru\\mera\\pechenkina\\task10\\strings_sequential\\").listFiles().length;
	        List<String> stringsSequential = new ArrayList<>(filesInDir);
	        
	        for (int i = 0; i <= filesInDir-1; i++) {
	        	String filename = i +".txt";
	        	File file = new File("C:\\Users\\Лисенок\\workspace\\_pechenkinat\\10\\ru\\mera\\pechenkina\\task10\\strings_sequential\\"+ filename);

	        	try  {
	        		FileInputStream fis = new FileInputStream(file);
	        		InputStreamReader ipsr = new InputStreamReader(fis);
	                BufferedReader br = new BufferedReader(ipsr);
	                String line;

	                while ((line = br.readLine()) != null){
	                    //System.out.println(line);
	                    stringsSequential.add(line);
	                }
	                br.close();

		        } catch(IOException ex){
		             
		            System.out.println(ex.getMessage());
		        }  
			}
	        long finishTimeOfsequentialReadingFromFiles = System.nanoTime();
	        System.out.println("Speed of reading from files = " + (finishTimeOfsequentialReadingFromFiles - startTimeOfsequentialReadingFromFiles));
	        
	        //print stringsSequential array taken from all files
	       //printStringsArray(stringsSequential);  
	        
	    }
	    
    
	    public static void printStringsArray(List<String> arrayToBePrinted) {
	    	for (int i=0; i <= arrayToBePrinted.size()-1; i++) {
	        	System.out.println("step = " + i);
	        	System.out.println("Elements in arrayToBePrinted array: " + arrayToBePrinted.get(i));
	        }
	    	
	    }
	 
	    private static String getNextRandomString(String strAllowedCharacters, Random random) {
	        
	        StringBuilder sbRandomString = new StringBuilder(OUTPUT_STRING_LENGTH);
	        
	        for(int i = 0 ; i < OUTPUT_STRING_LENGTH; i++){
	            
	            //get random integer between 0 and string length
	            int randomInt = random.nextInt(strAllowedCharacters.length());
	            
	            //get char from randomInt index from string and append in StringBuilder
	            sbRandomString.append( strAllowedCharacters.charAt(randomInt) );
	        }
	        
	        return sbRandomString.toString();
	        
	    }

	
}
