package StreamsExercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberExercises {

    public Stream<Double> randomNumberStream(int size) {
        return(Stream.generate(() -> getRandomDouble()).limit(size));
    }

    public List<Double> randomNumberList(int size) {
        return(randomNumberStream(size).collect(Collectors.toList()));
    }

    public double getRandomDouble() {
        return Math.random();
    }
}
