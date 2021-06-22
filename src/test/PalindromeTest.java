package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import unit.Palindrome;

class PalindromeTest {
	Palindrome obj = new Palindrome();

	@Test
	void palindromeTest() 
	{
		assertEquals(true,obj.palindrome("gooboog"));
		assertEquals(true,obj.palindrome("Gurukrishnan"));

	}

}
