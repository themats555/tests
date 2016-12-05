package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import progettoTest.MetodiDaTestare;

public class MetodiDaTestareTest{

	@Test
	public void testConcatenate() {
		MetodiDaTestare test = new MetodiDaTestare();
		String result =test.concatenate("one","two");
		assertEquals("onetwo",result);
	}

}
