package com.test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CollectionsTest {

	@Test
	public void testListOfNumbers() {
		
		List<String> list = Arrays.asList("Deva","Raja");
		List<String> expctData = Arrays.asList("Deva","Raja");
		

		
		assertThat(list.size(),is(6));
		
		assertThat(list, hasItems("Deva"));
	
		assertEquals(list,expctData);
	}
	
}
