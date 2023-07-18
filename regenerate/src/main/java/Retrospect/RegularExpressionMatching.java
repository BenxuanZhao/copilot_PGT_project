package Retrospect;

public class RegularExpressionMatching {
    /* Here is the explanation for the code above:
1. If a star is present in the pattern, it will be in the second position pattern[1].
Then, we may ignore this part of the pattern, or delete a matching character in the text.
If we have a match on the remaining strings after any of these operations, then the initial inputs matched.

2. If the pattern[1] is not a star, then we must match the current character of the text to
that of the pattern. Again, if there is a match, we proceed. Otherwise, we return false.

The base cases of the recursion are when the length of the pattern is 0 or when the length
of the pattern is 1 and isn't followed by a star. In both of these cases, we simply check
if the lengths of the text and pattern are equal. If they are, we have a match on our hands! */
    public boolean isMatch(String text, String pattern) {
        if (pattern.isEmpty()){
            return text.isEmpty();
        }
        boolean firstMatch = (!text.isEmpty() &&
                (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

        if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
            return (isMatch(text, pattern.substring(2)) ||
                    (firstMatch && isMatch(text.substring(1), pattern)));
        } else {
            return firstMatch && isMatch(text.substring(1), pattern.substring(1));
        }
    }
}
