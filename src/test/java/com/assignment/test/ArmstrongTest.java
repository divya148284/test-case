package com.assignment.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com. assignment.code.Armstrong;

@RunWith(MockitoJUnitRunner.class)
public class ArmstrongTest {

	@InjectMocks
	private Armstrong test;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void checkArmstrongExamplePositiveTest() {
		boolean status = test.checkArmstrongExample(153);
		Assert.assertEquals(status, true);
	}
	
	@Test
	public void checkArmstrongExampleNegativeTest() {
		boolean status = test.checkArmstrongExample(15);
		Assert.assertEquals(status, false);
	}

}
