package com.javatechie.GitHub_from_eclipse;

public class MyClass {
	public boolean search(int[] a,int b) {
		int i;
		for(i=0;i<a.length;i++) {
			if(a[i]==b) return true;
		}
		return false;
	}
}
