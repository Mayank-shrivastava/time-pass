package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Learning stream apis in java
        // - Rules for doing stream methods
        // - Create the stream
        // - Use the intermediate operations (filter, sorted, map etc)
        // - Use the terminal operators (count, reduce, collect)

        // Different ways for creating the stream
        // 1. From Collection
        List<Integer> salaryList = Arrays.asList(1100, 1220,12204, 3000);
        Stream<Integer> streamFromList = salaryList.stream();

        // 2. From Array
        Integer[] arr = {1100, 1220,12204, 3000};
        Stream<Integer> streamForArray = Arrays.stream(arr);

        // 3. from static method
        Stream<Integer> streamFromStaticMethod = Stream.of(1100, 1220,12204, 3000);

        // 4. from stream builder
        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(100).add(200);
        Stream<Integer> streamFromBuilder = streamBuilder.build();

        // 5. from stream iterator
        Stream<Integer> streamForIterator = Stream.iterate(1000, (Integer n) -> n + 10000).limit(5);

    }
}
