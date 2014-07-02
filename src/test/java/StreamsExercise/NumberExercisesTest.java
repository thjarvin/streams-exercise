package StreamsExercise;

import junit.framework.TestCase;

import java.text.DecimalFormat;
import java.util.List;

public class NumberExercisesTest extends TestCase {
    private NumberExercises integerExercises;
    private int i = 1;
    private DecimalFormat df = new DecimalFormat("#.0");

    @Override
    protected void setUp() {
        integerExercises = new NumberExercises() {

            @Override
            public double getRandomDouble() {
                return Double.valueOf(df.format(0.1 * i++));
            }
        };
    }

    public void testRandomNumberList() {
        List<Double> randomNumberList = integerExercises.randomNumberList(3);
        assertEquals(3, randomNumberList.size());
        assertEquals(0.1, randomNumberList.get(0));
        assertEquals(0.2, randomNumberList.get(1));
        assertEquals(0.3, randomNumberList.get(2));
    }
}
