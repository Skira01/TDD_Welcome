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

}
