
package org.sample;

import java.util.Map;


public class PerformaceMap {
	private static int TEST_INDEX = 1000;

	public void addMap(Map map) {
		for (int testCount = 0; testCount < TEST_INDEX; testCount++) {
			map.put(testCount, testCount);
		}
	}

	public void searchMap(Map map) {
		addMap(map);
		for (int testCount = 0; testCount < TEST_INDEX; testCount++) {
			map.get(testCount);
		}
	}

	public void removeMap(Map map) {
		addMap(map);
		for (int testCount = 0; testCount < TEST_INDEX; testCount++) {
			map.remove(testCount);
		}
	}

	private void printName(Map map) {
		Class c = map.getClass();
		System.out.println("map(4) : " + c.getName());
	}
}
