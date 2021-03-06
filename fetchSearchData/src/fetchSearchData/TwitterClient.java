package fetchSearchData;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import java.util.List;
import java.util.ArrayList;

public class TwitterClient {
	//Consumer Key
	static String consumerKeyStr = "xxxxxx";
	static String consumerSecretStr = "xxxxx";
	
	//Access Token
	static String accessTokenStr = "xxxxxx";
	static String accessTokenSecretStr = "xxxxxx";
	
	public List<String> searchForWord(String word){
		List<String> tweets = new ArrayList<String>();
		
		try {
			Twitter twitter = new TwitterFactory().getInstance();
			twitter.setOAuthConsumer(consumerKeyStr, consumerSecretStr);
			
			AccessToken accessToken = new AccessToken(accessTokenStr, accessTokenSecretStr);
			twitter.setOAuthAccessToken(accessToken);
			
			Query query = new Query(word);
			query.setCount(100);
			QueryResult result = twitter.search(query);
			
			for(Status status: result.getTweets()){
				tweets.add(status.getText());
			}
		} catch (TwitterException te) {
			te.printStackTrace();
		}
		return tweets;
	}
	
}

