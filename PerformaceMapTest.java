
package org.sample;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@Fork(1)
@State(Scope.Thread)
@BenchmarkMode({ Mode.AverageTime })
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class PerformaceMapTest {
	PerformaceMap performanceMap = new PerformaceMap();

	@Benchmark
	public void testAddHashtable() throws Exception {
		performanceMap.addMap(new Hashtable());
	}
	
	@Benchmark
	public void testAddHashMap() throws Exception {
		performanceMap.addMap(new HashMap());
	}
	
	@Benchmark
	public void testAddLinkedHashMap() throws Exception {
		performanceMap.addMap(new LinkedHashMap());
	}
	
	@Benchmark
	public void testAddTreeMap() throws Exception {
		performanceMap.addMap(new TreeMap());
	}

	@Benchmark
	public void testSearchHashtable() throws Exception {
		performanceMap.searchMap(new Hashtable());
	}
	
	
	@Benchmark
	public void testSearchHashMap() throws Exception {
		performanceMap.searchMap(new HashMap());
	}
	
	
	@Benchmark
	public void testSearchLinkedHashMap() throws Exception {
		performanceMap.searchMap(new LinkedHashMap());
	}
	
	
	@Benchmark
	public void testSearchTreeMap() throws Exception {
		performanceMap.searchMap(new TreeMap());
	}

	@Benchmark
	public void testRemoveHashTable() throws Exception {
		performanceMap.removeMap(new Hashtable());
	}
	@Benchmark
	public void testRemoveHashMap() throws Exception {
		performanceMap.removeMap(new HashMap());
	}
	@Benchmark
	public void testRemoveLinkedHashMap() throws Exception {
		performanceMap.removeMap(new LinkedHashMap());
	}
	@Benchmark
	public void testRemoveTreeMap() throws Exception {
		performanceMap.removeMap(new TreeMap());
	}

}
