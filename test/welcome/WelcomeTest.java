package welcome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void test1() {
		assertEquals(Welcome.welcome("bob"),"Hello, Bob");
	}
	
	@Test
	void test2() {
		assertEquals(Welcome.welcome(""),"Hello, my friend");
		assertEquals(Welcome.welcome("    "),"Hello, my friend");
		assertEquals(Welcome.welcome(null),"Hello, my friend");
	}
	 
	@Test
	void test3() { 
		assertEquals(Welcome.welcome("JERRY"),"HELLO, JERRY!");
	}
	
	@Test
	void test4() {
		assertEquals(Welcome.welcome("amy,bob"),"Hello, Amy, Bob");
		assertEquals(Welcome.welcome("jon,bob"),"Hello, Jon, Bob");
		assertNotEquals(Welcome.welcome("jon,bob"),"Hello, jon, bob");
	} 
	
	@Test
	void test5() {
		assertEquals(Welcome.welcome("amy,bob"),"Hello, Amy, Bob");
		assertEquals(Welcome.welcome("amy,jon,bob"),"Hello, Amy, Jon, Bob");
		assertNotEquals(Welcome.welcome("amy,jon,bob"),"Hello, amy, jon, bob");
	}

}
