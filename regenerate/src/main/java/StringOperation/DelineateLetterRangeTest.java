package StringOperation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DelineateLetterRangeTest {
    @Test
    public void testPartitionLabels() {
        DelineateLetterRange delineateLetterRange = new DelineateLetterRange();

        String s1 = "abacdc";
        List<Integer> expected1 = Arrays.asList(3, 3);
        assertEquals(expected1, delineateLetterRange.partitionLabels(s1));

        String s2 = "abcabc";
        List<Integer> expected2 = Arrays.asList(6);
        assertEquals(expected2, delineateLetterRange.partitionLabels(s2));

        String s3 = "abacdfedc";
        List<Integer> expected3 = Arrays.asList(3, 6);
        assertEquals(expected3, delineateLetterRange.partitionLabels(s3));
    }
}