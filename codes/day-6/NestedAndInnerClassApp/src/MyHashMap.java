import java.util.Set;
import java.util.TreeSet;

public class MyHashMap<TKey, TValue> {
	class Entry<TKey, TValue> {
		private TKey key;
		private TValue value;

		public Entry(TKey key, TValue value) {
			this.key = key;
			this.value = value;
		}

		public TKey getKey() {
			return key;
		}

		public TValue getValue() {
			return value;
		}
	}

	private Set<Entry<TKey, TValue>> set;

	public MyHashMap() {
		set = new TreeSet<>();
	}

	public Set<Entry<TKey, TValue>> entrySet() {
		return set;
	}

	public void put(TKey key, TValue value) {
		set.add(new Entry<TKey, TValue>(key, value));
	}
}
