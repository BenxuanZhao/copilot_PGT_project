package hash;

public class FirstUniqueChar {
    //* input: a string
    //* output: the index of the first unique character
    //* method: count the number of characters in the string, and then find the first character that only appears once
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++; // count the number of characters in the string
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) { // find the first character that only appears once
                return i;
            }
        }
        return -1;
    }
}
