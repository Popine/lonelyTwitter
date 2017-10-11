package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by apriest on 10/10/17.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void addTweet(Tweet tweet) {
        if (this.hasTweet(tweet)) {
            throw new IllegalArgumentException();

        } else {
            tweets.add(tweet);
        }
    }

    public void deleteTweet(Tweet tweet) {
        tweets.remove(tweet);
    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int i) {
        return tweets.get(i);
    }

    public ArrayList<Tweet> getTweets(){
        return this.tweets;
    }

    public int getCount(){
        return tweets.size();
    }

}
