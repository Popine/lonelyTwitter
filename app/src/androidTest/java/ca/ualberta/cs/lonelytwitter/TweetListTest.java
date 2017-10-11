package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by apriest on 10/10/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList tweets = new TweetList();
        Tweet myTweet = new NormalTweet("my tweet");

        tweets.addTweet(myTweet);
        assertTrue(tweets.hasTweet(myTweet));
    }

    public void testDeleteTweet() {
        TweetList tweets = new TweetList();
        Tweet myTweet = new NormalTweet("my tweet");

        tweets.deleteTweet(myTweet);
        assertFalse(tweets.hasTweet(myTweet));
    }

    public void testHasTweet() {
        TweetList tweets = new TweetList();
        Tweet myTweet = new NormalTweet("my tweet");

        assertFalse(tweets.hasTweet(myTweet));
        tweets.addTweet(myTweet);
        assertTrue(tweets.hasTweet(myTweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet myTweet = new NormalTweet("my tweet");
        tweets.addTweet(myTweet);

        Tweet theTweet = tweets.getTweet(0);
        assertEquals(theTweet.getId(), myTweet.getId());

    }

    public void testGetTweets(){
        TweetList tweets = new TweetList();
        Tweet myTweet = new NormalTweet("my tweet");
        tweets.addTweet(myTweet);
        Tweet myTweet2 = new NormalTweet("my tweet2");
        tweets.addTweet(myTweet2);

        ArrayList<Tweet> myTweets = tweets.getTweets();

        for(int i = myTweets.size() - 1; i >= 0; i--){
            assertEquals(myTweets.get(i), tweets.getTweet(i));
        }

    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet myTweet = new NormalTweet("my tweet");
        tweets.addTweet(myTweet);
        Tweet myTweet2 = new NormalTweet("my tweet2");
        tweets.addTweet(myTweet2);

        assertEquals(tweets.getCount(), 2);
    }

}
