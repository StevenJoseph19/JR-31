import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediaryandFinal {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("One", "Two", "Three", "Four", "Five");

		Predicate<String> p1 = Predicate.isEqual("Two");

		Predicate<String> p2 = Predicate.isEqual("Three");

		List<String> list = new ArrayList<>();


	}
}
