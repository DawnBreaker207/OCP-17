package Streams.Optional;

import java.util.Optional;

public class TestOptional {

    public static void main(String[] args) {
	Optional<Double> opt1 = average(90, 100);
	Optional<Double> opt2 = average();

//	if (opt1.isPresent()) {
//	    System.out.println(opt1.get());
//	}

	opt1.ifPresent(System.out::println);

	System.out.println(opt2.get());
	Optional o = Optional.ofNullable(opt2);

	System.out.println(opt2.orElse(Double.NaN));
	System.out.println(opt2.orElseGet(() -> Math.random()));
	System.out.println(opt2.orElseThrow());
	System.out.println(opt2.orElseThrow(() -> new IllegalStateException()));
    }

    public static Optional<Double> average(int... scores) {
	if (scores.length == 0)
	    return Optional.empty();
	int sum = 0;
	for (int score : scores)
	    sum += score;
	return Optional.of((double) sum / scores.length);
    }

}
