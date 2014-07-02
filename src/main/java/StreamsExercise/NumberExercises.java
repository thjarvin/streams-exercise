package StreamsExercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberExercises {

    private Stream<Double> randomNumberStream(int size) {
        return(Stream.generate(() -> getRandomDouble()).limit(size));
    }

    public List<Double> randomNumberList(int size) {
        return(randomNumberStream(size).collect(Collectors.toList()));
    }

    private Stream<Integer> orderedNumberStream(int first, int stepSize, int listSize) {
        return (Stream.iterate(first, s -> s + stepSize)).limit(listSize);
    }

    public List<Integer> orderedNumberList(int first, int stepSize, int listSize) {
        return (orderedNumberStream(first, stepSize, listSize).collect(Collectors.toList()));
    }

    public double getRandomDouble() {
        return Math.random();
    }
}
