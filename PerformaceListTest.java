package org.sample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
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
public class PerformaceListTest {
	PerformaceList performanceList = new PerformaceList();
	
	
	
	@Benchmark
	public void testAddVector() throws Exception {
		performanceList.addList(new Vector());
	}

	@Benchmark
	public void testAddArrayList() throws Exception {
	performanceList.addList(new ArrayList());
	}
	
	@Benchmark
	public void testAddLinkedList() throws Exception {
		performanceList.addList(new LinkedList());
	}
	
	@Benchmark
	public void testSearchVector() throws Exception {
		performanceList.searchList(new Vector());
	}
	
	@Benchmark
	public void testSearchArrayList() throws Exception {
		performanceList.searchList(new ArrayList());
	}
	
	@Benchmark
	public void testSearchLinkedList() throws Exception {
		performanceList.searchList(new LinkedList());
	}

	@Benchmark
	public void testRemoveVector() throws Exception {
		performanceList.removeList(new Vector());
	}
	
	@Benchmark
	public void testRemoveArrayList() throws Exception {
		performanceList.removeList(new ArrayList());
	}
	
	@Benchmark
	public void testRemoveLinkedList() throws Exception {
		performanceList.removeList(new LinkedList());
	}

}
