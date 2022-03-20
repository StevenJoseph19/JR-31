package collections.operations;

import java.util.ArrayList;

public class RemoveFromCollection {
	public static void main(String[] args) {
		ArrayList<MyClass> list = new ArrayList<>();
		MyClass v1 = new MyClass("v1", "abc");
		MyClass v2 = new MyClass("v2", "abc");
		MyClass v3 = new MyClass("v3", "abc");

		list.add(v1);
		list.add(v2);
		list.add(v3);

		list.remove(v3);

		for (MyClass m : list)
			System.out.println(m.getLabel());

	}

}
