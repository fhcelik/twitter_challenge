package fetchSearchData;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class files {
	void createFile(String name, List<String> data) throws IOException{
		int i=0;
		FileOutputStream out = new FileOutputStream("C:/Users/fhcel/Documents/software/twitter_challenge/searchFile/"+name+".txt");	
		while(i<data.size()) {
			String content = i+1+"."+"tweet:  "+data.get(i) +System.lineSeparator();
			out.write(content.getBytes());
			i++;
		}
		out.close();
	}
}