package collections.java8.sorting;

import java.util.TreeSet;

public class TreeSetWithComparator {

	public static void main(String[] args) {
		TreeSet<MyClass> tree = new TreeSet<>(new MyComparator());
		tree.add(new MyClass("2222", "ghi"));
		tree.add(new MyClass("3333", "abc"));
		tree.add(new MyClass("1111", "def"));
		tree.forEach(m -> System.out.println(m));

	}

}
