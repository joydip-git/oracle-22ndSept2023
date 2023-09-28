import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.TreeMap;
//import java.util.SortedMap;

public class App {

	public static void main(String[] args) {
		// useHashMap();
		useTreeMap();
	}

	private static void useTreeMap() {
		Map<String, Integer> map = new TreeMap<>();
		map.put("oracle", 5);
		map.put("bangalore", 3);
		map.put("india", 2);
//		map.put(1, "oracle");
//		map.put(0, "bangalore");
//		map.put(4, "India");
//		map.put(10, "HSR Layout");

		map.replace("bangalore", 4);
//		String oldValue = map.get(1);
		System.out.println(map.getOrDefault("India", 100));
//
		// map.remove(10);
		// map.remove(1,"oracle");

		// System.out.println(map.containsKey(10) ? map.get(10) : map.getOrDefault(10,
		// "ECity"));

		System.out.println("\nallentries\n");
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		for (Map.Entry<String, Integer> entry : set) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

	private static void useHashMap() {
		Map<Integer, String> map = new HashMap<>();
		map.put(5, "oracle");
		map.put(3, "bangalore");
		map.put(2, "India");
		map.put(1, "oracle");
		map.put(0, "bangalore");
		map.put(4, "India");
		map.put(10, "HSR Layout");

		map.replace(0, "Bengaluru");
//		String oldValue = map.get(1);
		System.out.println(map.getOrDefault(10, "ECity"));
//
		map.remove(10);
		// map.remove(1,"oracle");

		System.out.println(map.containsKey(10) ? map.get(10) : map.getOrDefault(10, "ECity"));

		System.out.println("\nallentries\n");
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		for (Map.Entry<Integer, String> entry : set) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
