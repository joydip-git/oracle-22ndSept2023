import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App {

	public static void main(String[] args) {
		// Consumer<T> => void accept(T t);
		Consumer<String> printName = (String name) -> System.out.println(name);
		printName.accept("anil");

		// BiConsumer<T,U> => void accept(T t, U u);
		BiConsumer<String, String> printFullName = (firstName, lastName) -> System.out
				.println(firstName + " " + lastName);
		printFullName.accept("Aisiri", "M R");

		// Predicate<T> => boolean test(T t);
		Predicate<Integer> isEven = (num) -> num % 2 == 0;
		System.out.println(isEven.test(12));

		// BiPredicate<T, U> => boolean test(T t, U u);
		BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
		System.out.println(isGreater.test(3, 5));

		// Function<T,R> => R apply(T t);
		Function<Integer, Integer> square = (side) -> side * side;
		System.out.println(square.apply(12));

		Function<Integer, Boolean> isOdd = (num) -> num % 2 != 0;
		System.out.println(isOdd.apply(13));

		// BiFunction<T, U, R> => R apply(T t, U u);
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
		System.out.println(add.apply(12, 13));

		// Supplier<T> => T get();
		Supplier<String> welcome = () -> "welcome to Functional Programming...";
		System.out.println(welcome.get());

		// Comparator<T> => int compare(T o1, T o2);
		Comparator<Integer> compareLogic = (a, b) -> a - b;
		System.out.println(compareLogic.compare(12, 3));
	}

}
