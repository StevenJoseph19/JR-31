package collections.operations;

import java.util.ArrayList;
import java.util.LinkedList;

public class AddAll {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Foo");
		list1.add("Bar");
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("Baz");
		list2.add("Boo");
		list1.addAll(list2);
		for (String s : list1)
			System.out.println(s);

	}
}
