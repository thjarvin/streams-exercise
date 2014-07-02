package StreamsExercise;

import junit.framework.TestCase;

import java.text.DecimalFormat;
import java.util.List;

public class NumberExercisesTest extends TestCase {
    private NumberExercises numberExercises;
    private int i = 1;
    private DecimalFormat df = new DecimalFormat("#.0");

    @Override
    protected void setUp() {
        numberExercises = new NumberExercises() {

            @Override
            public double getRandomDouble() {
                return Double.valueOf(df.format(0.1 * i++));
            }
        };
    }

    public void testRandomNumberList() {
        List<Double> randomNumberList = numberExercises.randomNumberList(3);
        assertEquals(3, randomNumberList.size());
        assertEquals(0.1, randomNumberList.get(0));
        assertEquals(0.2, randomNumberList.get(1));
        assertEquals(0.3, randomNumberList.get(2));
    }

    public void testOrderedNumberList() {
        List<Integer> orderedNumberList = numberExercises.orderedNumberList(50, 5, 4);
        assertEquals(4, orderedNumberList.size());
        assertEquals(Integer.valueOf(50), orderedNumberList.get(0));
        assertEquals(Integer.valueOf(55), orderedNumberList.get(1));
        assertEquals(Integer.valueOf(60), orderedNumberList.get(2));
        assertEquals(Integer.valueOf(65), orderedNumberList.get(3));
    }
}
