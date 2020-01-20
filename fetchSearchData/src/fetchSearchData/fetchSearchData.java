package fetchSearchData;

import java.io.IOException;
import java.util.ArrayList;

public class fetchSearchData {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		TwitterClient search = new TwitterClient();
		userInputs topics = new userInputs();
		files file = new files();
		ArrayList<String> topic = new ArrayList<String>();
		topic = topics.inputs();
		System.out.println("Press ENTER to terminate the program");
		while(System.in.available() == 0) {
			for(int i=0; i<topic.size();i++) {
				file.createFile(topic.get(i), search.searchForWord(topic.get(i)));
			}
		}
	}

}
