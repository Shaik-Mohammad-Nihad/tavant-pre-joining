package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test() {
		HelloWorld n=new HelloWorld();
		String a=n.getMessage();
		String e="Hello World";
		assertEquals(a,e);
	}

}
