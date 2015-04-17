package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero () {
		// Given
		String input = "0";
		String expected = "zéro";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test_text2num_zero(){
		// Given
				String input = "zéro";
				String expected = "0";
				Convert myConvert = new Convert();
				// When
				String actual = myConvert.text2num(input);
				// Then
				Assert.assertEquals(expected, actual);
	}
	
}
