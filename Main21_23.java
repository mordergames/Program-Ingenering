public class Main21_23 {
    public static String findLongestString(String[] array) {
        String longestString = "";
        for (String str : array) {
            if (str.length() > longestString.length()) {
                longestString = str;
            }
        }
        return longestString;
    }
}