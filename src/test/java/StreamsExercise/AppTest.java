package StreamsExercise;

import junit.framework.TestCase;
import org.junit.Before;

import java.util.Arrays;
import java.util.List;

public class AppTest extends TestCase {
    private App app;
    private List<String> words;

    @Override
    protected void setUp() {
        app = new App();
        words = Arrays.asList("hi", "hello", "shalom", "tov");
    }

    public void testReturnUppercaseAndConcatenatedStringWithoutMap() {
        assertEquals("HIHELLOSHALOMTOV", app.transformUppercaseAndConcatenateWithoutMap(words).orElse("moi"));
    }

    public void testReturnUppercaseAndConcatenatedStringWithMap() {
        assertEquals("HIHELLOSHALOMTOV", app.transformUppercaseAndConcatenateWithMap(words).orElse("moi"));
    }



    public void thisShouldNotBeCalled() {
        assertTrue(false);
    }
}
