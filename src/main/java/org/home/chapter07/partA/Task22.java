package org.home.chapter07.partA;

/**
 * Delete all comments in java text (there is some issue).
 */
public class Task22 {
    
    public static void main(String[] args) {
        String text = "The quick brown /*fox \n*jumps*/ over the lazy-dog\n" +
                "/**\n" +
                "* Yo!\n" +
                "*/\n" +
                "public smth //start\n" +
                "/* comment */\n" +
                "System.out.print(\"/*not a comment*/\")\n" +
                "The end";
        
        String o1 = text.replaceAll("//.*\\n", "\n"); // replace comments (//)
        String o2 = o1.replaceAll("/\\*(.|\\n)+?\\*/", ""); // replace comments (/** */ /* */)
    
        System.out.println(o2);
    }
}

