package welcome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void test() {
		assertEquals(Welcome.welcome("bob"),"Hello, Bob");
	}

}
