package StreamsExercise;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

public class StringExercisesTest extends TestCase {
    private StringExercises stringExercises;
    private List<String> words;

    @Override
    protected void setUp() {
        stringExercises = new StringExercises();
        words = Arrays.asList("hi", "hello", "shalom", "tov");
    }

    public void testReturnUppercaseAndConcatenatedStringWithoutMap() {
        assertEquals("HIHELLOSHALOMTOV", stringExercises.transformUppercaseAndConcatenateWithoutMap(words).get());
    }

    public void testReturnUppercaseAndConcatenatedStringWithMap() {
        assertEquals("HIHELLOSHALOMTOV", stringExercises.transformUppercaseAndConcatenateWithMap(words).get());
    }

    public void testConcatenateWithCommas() {
        assertEquals("hi,hello,shalom,tov", stringExercises.concatenateWithCommas(words).get());
    }

    public void thisShouldNotBeCalled() {
        assertTrue(false);
    }
}
