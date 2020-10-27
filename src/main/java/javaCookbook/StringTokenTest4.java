package javaCookbook;

import java.util.StringTokenizer;

public class StringTokenTest4 {
    public final static int MAXFIELDS = 5;
    public final static String DELIM = "|";

    /** processes one string, return it as an array of Strings */
    public static String[] process(String line){
        String[] results = new String[MAXFIELDS];

        //unless you ask StringTokenizer to give you the tokens,
        // it silently discards multiple null tokens.
        StringTokenizer st = new StringTokenizer(line, DELIM, true);
        int i =0;

        // stuff each token into the current slot in the array.

        while (st.hasMoreTokens()){
            String s = st.nextToken();
            if (s.equals(DELIM)){
                if (i++ >= MAXFIELDS)
                    throw new IllegalArgumentException("Input Line " +
                            line + " has too many fields");
                continue;
            }
            results[i] = s;
        }
        return results;
    }

    public static void printResults(String input, String[] outputs){
        System.out.println("Input: "+ input);
        int i=0;
        for (String s : outputs){
            System.out.println("Output: "+ i +" was: " +s);
            i ++;
        }
    }

    public static void main (String[]args){
        printResults("A|B|C|D", process("A|B|C|D"));
        printResults("A||C|D", process("A||C|D"));
        printResults("A|||D|E", process("A|||D|E"));

    }
}

