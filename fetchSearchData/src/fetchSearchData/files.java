package fetchSearchData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class files {
	void createFile(String name, List<String> data) throws IOException{
		int i=0;
		String path = new File("searchFile/"+name+".txt").getAbsolutePath();
		BufferedWriter out = new BufferedWriter(new FileWriter(path,true));	
		while(i<data.size()) {
			String content = "tweet:  "+data.get(i) +System.lineSeparator();
			out.write(content);
			i++;
		}
		out.close();
	}
}