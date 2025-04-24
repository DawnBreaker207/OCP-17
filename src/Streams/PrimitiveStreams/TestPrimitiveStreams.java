package Streams.PrimitiveStreams;

import java.util.*;
import java.util.stream.*;

public class TestPrimitiveStreams {

    public static void main(String[] args) {
	Stream<Integer> stream = Stream.of(1, 2, 3);
	System.out.println(stream.mapToInt(x -> x).sum());

	IntStream intStream = IntStream.of(1, 2, 3);
	OptionalDouble avg = intStream.average();
	System.out.println(avg.getAsDouble());

	DoubleStream empty = DoubleStream.empty();
	DoubleStream oneValue = DoubleStream.of(3.14);

	oneValue.forEach(System.out::println);

	DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
	varargs.forEach(System.out::println);

	var random = DoubleStream.generate(Math::random);
	var fractions = DoubleStream.iterate(.5, d -> d / 2);
	random.limit(3).forEach(System.out::println);
	fractions.limit(3).forEach(System.out::println);

	IntStream count = IntStream.iterate(1, n -> n + 1).limit(5);
	count.forEach(System.out::print);

	IntStream range = IntStream.range(1, 6);
	range.forEach(System.out::print);

	IntStream rangeClosed = IntStream.rangeClosed(1, 5);
	rangeClosed.forEach(System.out::print);

	Stream<String> objStream = Stream.of("penguin", "fish");
	IntStream intStream1 = objStream.mapToInt(s -> s.length());

	var stream1 = IntStream.rangeClosed(1, 10);
	OptionalDouble optional = stream1.average();

	optional.ifPresent(System.out::println);
	System.out.println(optional.getAsDouble());
	System.out.println(optional.orElseGet(() -> Double.NaN));

	LongStream longs = LongStream.of(5, 10);
	long sum = longs.sum();
	System.out.println(sum);
	DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
	OptionalDouble min = doubles.min();
    }

    private static Stream<Integer> mapping(IntStream stream) {
	return stream.mapToObj(x -> x);
    }

    private static Stream<Integer> boxing(IntStream stream) {
	return stream.boxed();
    }

    private static int max(IntStream ints) {
	OptionalInt optional = ints.max();
	return optional.orElseThrow(RuntimeException::new);
    }

    private static int range(IntStream ints) {
	IntSummaryStatistics stats = ints.summaryStatistics();
	if (stats.getCount() == 0)
	    throw new RuntimeException();
	return stats.getMax() - stats.getMin();
    }

}
