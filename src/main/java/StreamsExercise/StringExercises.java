package StreamsExercise;

import java.util.List;
import java.util.Optional;

public class StringExercises {

    public Optional<String> transformUppercaseAndConcatenateWithoutMap(List<String> words) {
        return words.stream().reduce((x, y) -> x.toUpperCase().concat(y.toUpperCase()));
    }

    public Optional<String> transformUppercaseAndConcatenateWithMap(List<String> words) {
        return words.stream().map(s -> s.toUpperCase()).reduce((x, y) -> x.concat(y));
    }

    public Optional<String> concatenateWithCommas(List<String> words) {
        return words.stream().reduce((x, y) -> x.concat("," + y));
    }
}
