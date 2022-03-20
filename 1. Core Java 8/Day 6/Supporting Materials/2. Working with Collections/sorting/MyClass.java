package collections.java8.sorting;

public class MyClass implements Comparable<MyClass> {
	String label, value; // Other members elided for clarity



	public String toString() {
		return label + "|" + value;
	}

	public MyClass(String label, String value) {
		super();
		this.label = label;
		this.value = value;
	}

	public boolean equals(Object o) {
		MyClass other = (MyClass) o;
		return value.equalsIgnoreCase(other.value);
	}

	public int compareTo(MyClass other) {
		return value.compareToIgnoreCase(other.value);
	}
}
