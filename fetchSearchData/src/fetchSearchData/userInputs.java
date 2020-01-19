package fetchSearchData;

import java.util.ArrayList;
import java.util.Scanner;

public class userInputs {

	ArrayList<String> inputs() {
		ArrayList<String> topics= new ArrayList<String>();
		@SuppressWarnings("resource")
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter up to five different topics!!!");
		System.out.println("Please press 1 to quit before entering five topics!!!");
		for(int i=0; i<5; i++) {
			String receivingTopic= input.nextLine();
			if(receivingTopic.equalsIgnoreCase("1")) break;
			while(!checkTopic(topics, receivingTopic)) {
				System.out.println("Please enter different topic!!!");
				receivingTopic= input.nextLine();
			}
			topics.add(i,receivingTopic);
		}
		return topics;
	}
	boolean checkTopic(ArrayList<String> topics, String receivingTopic){
		for(String topic : topics) {
			if(receivingTopic.equalsIgnoreCase(topic)){
				return false;
			}
		}
		return true;
	}

}