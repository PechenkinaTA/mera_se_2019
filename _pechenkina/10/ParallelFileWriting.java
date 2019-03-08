package ru.mera.pechenkina.task10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParallelFileWriting implements Runnable{
	

		List<String> stringArray = new ArrayList<>();
		int i=0;

		
	    /**
		 * @param stringArray
		 * @param i
		 */
		public ParallelFileWriting(List<String> stringArray, int i) {
			super();
			this.stringArray = stringArray;
			this.i = i;
		}



		public void run(){
			//System.out.println(Thread.currentThread().getName());
	    	String filename = i + ".txt";
			File file = new File(
					"C:\\Users\\Лисенок\\workspace\\_pechenkinat\\10\\ru\\mera\\pechenkina\\task10\\strings_parallel\\"
							+ filename);

				try {
				FileOutputStream fileOutputStream = new FileOutputStream(file);
				
					fileOutputStream.write(stringArray.get(i).getBytes());
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	  }
}
