package DictTree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceWordTest {
    @Test
    public void testReplaceWords() {
        ReplaceWord replaceWord = new ReplaceWord();

        List<String> roots = Arrays.asList("cat", "bat", "rat");
        String sentence = "the cattle was rattled by the battery";

        String expected = "the cat was rat by the bat";

        long startTime = System.nanoTime();
        String result = replaceWord.replaceWords(roots, sentence);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        Assertions.assertEquals(expected, result);
        System.out.println("Replaced Sentence: " + result);
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}