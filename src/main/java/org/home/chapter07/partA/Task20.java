package org.home.chapter07.partA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Calculates number of puncuation marks in text.
 */
public class Task20 {
    
    public static void main(String[] args) {
        String text = "My Shadow.\n" +
                "I have a little shadow that goes in and out with me,\n" +
                "And what can be the use of him is more than I can see.\n" +
                "He is very, very like me from the heels up to the head;\n" +
                "And I see him jump before me, when I jump into my bed.\n" +
                "The funniest things about him is the way he likes to grow-\n" +
                "Not at all like proper children, which is always very slow;\n" +
                "For he sometimes shoots up taller like an India rubber ball,\n" +
                "And he sometimes gets so little that there's none of him at all.\n" +
                "He hasn't got a notion of how children ought to play,\n" +
                "And can only make a fool of me in every sort of way.\n" +
                "He stays so close beside me, he's a coward you can see;\n" +
                "I'd think shame to stick to nursie as that shadow sticks to me!\n" +
                "One morning, very early, before the sun was up,\n" +
                "I rose and found the shining dew on every buttercup;\n" +
                "But my lazy little shadow, like an arrant sleepy-head,\n" +
                "Had stayed at home behind me and was fast asleep in bed.";
    
        Matcher matcher = Pattern.compile("\\p{Punct}").matcher(text);
        
        int count = 0;
        
        while (matcher.find()) {
            count++;
        }
    
        System.out.println("Number of punctuation marks is " + count + ".");
    }
}
