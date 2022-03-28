package com.javatechie.GitHub_from_eclipse;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyClassTest {

	int[] a;
	@Before
	public void setUp() throws Exception {
		a = new int[] {2,3,4};
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testSearch() {
		fail("Not yet implemented"); // TODO
	}
	@Test
	public final void testSearchNoIten() {
		boolean val = (new MyClass()).search(a, 5);
		assertFalse(val);
	}

}
