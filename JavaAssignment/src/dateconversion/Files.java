package dateconversion;

import java.util.*;
import java.io.*;
import java.nio.file.*;

public class Files {
	
	public static void main(String [] args) throws IOException,FileNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file path:");
		String path=sc.nextLine();
		File f=new File(path);
		int ch=0;
		if(f.exists()) {
			if(f.canRead()) {
				FileReader fr=new FileReader(f);
				while((ch=fr.read())!=-1) {
					System.out.print((char)(ch));
				}
				fr.close();
			}
			if(f.canWrite()) {
				FileWriter fw=new FileWriter(f);
				fw.append("\n Hello");
				FileInputStream fis=new FileInputStream(path);
				Scanner newscan=new Scanner(fis);
				while(newscan.hasNext()) {
					System.out.println(newscan.nextLine());
				}
				
			}
		}
		
	}

}
