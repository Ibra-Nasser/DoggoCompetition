package com.qa.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.Doggo;

public class DoggoTest {

	@Test
	public void no15th() {
		assertEquals(15, Doggo.doggo(15));
	}

}
