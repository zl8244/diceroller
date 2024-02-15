package ptui.src;

import java.util.List;
import java.util.Arrays;

public class Spinner {
    private List<String> events;

    public Spinner(String[] acts) {
        events = Arrays.asList(acts);
    }

    public void spin() {
        int numSections = events.size();
        int result = (int)(Math.random()*numSections);
        System.out.println("Spinning a spinner.");
        String resultingEvent = events.get(result);
        System.out.println("Spinner lannded on \"" + resultingEvent + "\".");
    }
}
