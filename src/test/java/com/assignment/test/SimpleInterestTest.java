package com.assignment.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.assignment.code.SimpleInterest;

public class SimpleInterestTest {

	SimpleInterest sim;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSimpleInterestValue() {
		System.out.println("test case");

		Assert.assertEquals(sim.simpleInterest(1000, 10, 12), 3000, 0.001);

	}

	@After
	public void tearDown() throws Exception {
	}
}