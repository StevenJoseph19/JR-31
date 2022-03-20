package collections.java8;

import java.util.ArrayList;

import collections.operations.MyClass;

public class RetrieveArray {

	public static void main(String[] args) {
		ArrayList<MyClass> list = new ArrayList<>();

		list.add(new MyClass("v1", "abc"));
		list.add(new MyClass("v2", "xyz"));
		list.add(new MyClass("v3", "abc"));

	}

}
