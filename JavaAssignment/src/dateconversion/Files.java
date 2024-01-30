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
				System.out.println();
				fr.close();
			}
			if(f.canWrite()) {
				System.out.println("New File:");
				FileWriter fw=new FileWriter(f,true);
				//PrintWriter pw=new PrintWriter(fw,true);
				fw.append("\n Hello");
				fw.close();
				//fw.close();
				FileInputStream fis=new FileInputStream(path);
				Scanner newscan=new Scanner(fis);
				while(newscan.hasNext()) {
					System.out.println(newscan.nextLine());
				}
				
			}
		}
		File file=new File("C:\\Users\\Admin\\Desktop\\git.html");
		if(!file.exists()) file.createNewFile();
	}

}
