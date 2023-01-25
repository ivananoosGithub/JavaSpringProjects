package com.in28minutes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.in28minutes.junit.helper.StringHelper;

public class StringHelperTest {
	
	StringHelper newHelper = new StringHelper();

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		System.out.println("Test 1 Executed");
		assertEquals("CD", newHelper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPositions() {
		System.out.println("Test 2 Executed");
		assertEquals("CD", newHelper.truncateAInFirst2Positions("ACD"));
	}
	
	@Before
	public void beforeSetup() {
		System.out.println("Before Annotation");
	}
	
	@After
	public void afterSetup() {
		System.out.println("After Annotation");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class Executed");
	}

}
