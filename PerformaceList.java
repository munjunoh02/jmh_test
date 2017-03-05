
package org.sample;

import java.util.List;

public class PerformaceList {
	private static int TEST_INDEX = 1000;

	public void addList(List list) {
		for (int testCount = 0; testCount < TEST_INDEX; testCount++) {
			list.add(testCount);
		}
	}

	public void searchList(List list) {
		addList(list);
		for (int testCount = 0; testCount < TEST_INDEX; testCount++) {
			list.get(testCount);
		}
	}

	public void removeList(List list) {
		addList(list);
		for (int testCount = 0; testCount < TEST_INDEX; testCount++) {
			list.remove(testCount);
		}
	}

	private void printName(List list) {
		Class c = list.getClass();
		System.out.println("list(3) : " + c.getName());
	}

}
