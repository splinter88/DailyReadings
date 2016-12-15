package rayoflight.dailyreadings;

/**
 * Created by meshraghi on 15/11/16.
 */

public class Quotes {

    private String[] quotes = {
            "The betterment of the world can be accomplished through pure and goodly deeds, through commendable and seemly conduct.",
            "Beware O people of Baha! Lest ye walk in the ways of them whose words differ from their deeds."
    };

    private int index;
    public Quotes() {
        index = 0;
    }

    public String getNextQuote() {
        return quotes[index++ % quotes.length];
    }
}
