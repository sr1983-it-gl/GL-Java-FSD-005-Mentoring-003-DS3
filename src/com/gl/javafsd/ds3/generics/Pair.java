package com.gl.javafsd.ds3.generics;

public class Pair<DT1, DT2> {

	private DT1 data1;
	private DT2 data2;
	
	public Pair(DT1 data1, DT2 data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	public DT1 getData1() {
		return data1;
	}

	public void setData1(DT1 data1) {
		this.data1 = data1;
	}

	public DT2 getData2() {
		return data2;
	}

	public void setData2(DT2 data2) {
		this.data2 = data2;
	}
	
	public String toString() {
		return "Element 1 -> " + data1 + ", Element 2 -> " + data2;
	}
	
}
