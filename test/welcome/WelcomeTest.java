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
		assertEquals(Welcome.welcome("amy,bob"),"Hello, Amy and Bob");
		assertEquals(Welcome.welcome("jon,bob"),"Hello, Jon and Bob");
		assertNotEquals(Welcome.welcome("jon,bob"),"Hello, jon and bob");
	} 
	
	@Test
	void test5() {
		assertEquals(Welcome.welcome("amy,bob"),"Hello, Amy and Bob");
		assertEquals(Welcome.welcome("amy,jon,bob"),"Hello, Amy, Jon and Bob");
		assertNotEquals(Welcome.welcome("amy,jon,bob"),"Hello, amy, jon, bob");
	}
	
	@Test
	void test6() {
		assertEquals(Welcome.welcome("amy,BOB,jerry"),"Hello, Amy and Jerry. AND HELLO, BOB!");
		assertEquals(Welcome.welcome("amy,jerry"),"Hello, Amy and Jerry");
		assertEquals(Welcome.welcome("BOB,jerry"),"Hello, Jerry. AND HELLO, BOB!");
	}
	
	@Test
	void test7(){
		assertEquals(Welcome.welcome("amy,jerry"),"Hello, Amy and Jerry");
		assertEquals(Welcome.welcome("amy,jerry,bob,frank"),"Hello, Amy, Jerry, Bob and Frank");
		assertEquals(Welcome.welcome("amy,BOB,jerry,JACK"),"Hello, Amy and Jerry. AND HELLO, BOB AND JACK!");
		assertEquals(Welcome.welcome("BOB,JACK"),"HELLO, BOB AND JACK!");
	}
	
	@Test
	void test8(){
		assertEquals(Welcome.welcome("amy      ,jerry"),"Hello, Amy and Jerry");
		assertEquals(Welcome.welcome(" amy      ,jerry,  BOB	"),"Hello, Amy and Jerry. AND HELLO, BOB!");
		
	}
	
	@Test
	void test9(){
		assertEquals(Welcome.welcome("amy,jerry,amy"),"Hello, Amy(x2) and Jerry");
		assertEquals(Welcome.welcome(" amy,jerry,BOB,amy,amy,BOB,jerry"),"Hello, Amy(x3) and Jerry(x2). AND HELLO, BOB(X2)!");
		assertEquals(Welcome.welcome(" amy,   jerry, BOB,amy  , amy,BOB,jerry"),"Hello, Amy(x3) and Jerry(x2). AND HELLO, BOB(X2)!");
	}
	
	@Test
	void test10() {
		assertEquals(Welcome.welcome("amy,jerry,yoda"),"Amy, Jerry and Yoda, Hello");
		assertEquals(Welcome.welcome("amy,jerry,BOB,yoda"),"Amy, Jerry and Yoda, Hello. AND HELLO, BOB!");
		assertEquals(Welcome.welcome("YODA,amy,jerry,BOB,yoda"),"Amy, Jerry and Yoda, Hello. AND YODA AND BOB, HELLO!");
	}

}
