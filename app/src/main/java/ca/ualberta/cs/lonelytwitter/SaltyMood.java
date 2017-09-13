package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by apriest on 9/12/17.
 */

public class SaltyMood extends Mood {

    public SaltyMood() {
        super();
    }

    public SaltyMood(Date date) {
        super(date);
    }

    public String moodString(){
        return "I am salty.";
    }

}
