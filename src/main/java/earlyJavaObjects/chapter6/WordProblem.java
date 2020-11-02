package earlyJavaObjects.chapter6;

public class WordProblem {
    private String text;

    public WordProblem(String s) {
        int i = 0;
        while (i < s.length() && !Character.isLetter(s.charAt(i))) {
            i++;
        }
        int j = s.length() - 1;
        while (j > i && !Character.isLetter(s.charAt(j))) {
            j--;
        }
        text = s.substring(i, j + 1);
    }

    public String getText() {
        return text;
    }

    public int countSyllables() {
        int count = 0;
        int end = text.length() - 1;
        if (end < 0) {
            return 0;
        }
        char ch = text.charAt(end);
        if (ch == 'e' || ch == 'E') {
            end--;
        }
        boolean insideVowelGroup = false;

        for (int i = 0; i <= end; i++) {
            ch = text.charAt(i);
            String vowels = "aeiouyAEIOUY";
            if (vowels.indexOf(ch) >= 0) {
                if (!insideVowelGroup) {
                    count++;
                    insideVowelGroup = true;
                }

            } else insideVowelGroup = false;
        }
        if (count == 0) {
            count = 1;
        }
        return count;
    }
}
