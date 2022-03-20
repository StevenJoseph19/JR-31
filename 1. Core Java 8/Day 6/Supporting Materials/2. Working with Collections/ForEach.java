package collections.java8;

import java.util.ArrayList;

import collections.operations.MyClass;

public class ForEach {

	public static void main(String[] args) {
		ArrayList<MyClass> list = new ArrayList<>();

		MyClass v1 = new MyClass("v1", "abc");
		MyClass v2 = new MyClass("v2", "xyz");
		MyClass v3 = new MyClass("v3", "abc");

		list.add(v1);
		list.add(v2);
		list.add(v3);

	}

}
