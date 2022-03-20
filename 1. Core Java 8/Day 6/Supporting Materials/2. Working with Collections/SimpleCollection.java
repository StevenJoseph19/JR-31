package collections.simple;

import java.util.ArrayList;

public class SimpleCollection {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Foo");
		list.add("Bar");
		System.out.println("Elements: " + list.size());
		for (Object o : list)
			System.out.println(o.toString());
		String s = (String) list.get(0);
		SomeClassIMadeUp c = new SomeClassIMadeUp();
		list.add(c);

	}

}
