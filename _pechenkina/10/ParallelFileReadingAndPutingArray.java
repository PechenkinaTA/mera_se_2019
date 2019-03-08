package ru.mera.pechenkina.task10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ParallelFileReadingAndPutingArray implements Runnable{

	List<String> stringArray = new ArrayList<>();
	List<String> stringsParalell = new ArrayList<>();
	int i=0;

	
    /**
	 * @param stringArray
	 * @param i
	 */
	public ParallelFileReadingAndPutingArray(List<String> stringArray, int i, List<String> stringsParalell) {
		super();
		this.stringArray = stringArray;
		this.stringsParalell = stringsParalell;
		this.i = i;
	}

	/*Resource res;
	int i=0;
	public ParallelFileReadingAndPutingArray(Resource res,	int i) {
		// TODO Auto-generated constructor stub
		this.res = res;
		this.i = i;
	}*/


	public void run(){
		//System.out.println(Thread.currentThread().getName());
    	String filename = i + ".txt";
		File file = new File(
				"C:\\Users\\Лисенок\\workspace\\_pechenkinat\\10\\ru\\mera\\pechenkina\\task10\\strings_parallel\\"
						+ filename);

		synchronized (file) {
			try {
				FileInputStream fis = new FileInputStream(file);
        		InputStreamReader ipsr = new InputStreamReader(fis);
                BufferedReader br = new BufferedReader(ipsr);
                String line;

                while ((line = br.readLine()) != null){
                    //System.out.println(line);
                	stringsParalell.add(line);
                }
                br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
  }			
	}
}
