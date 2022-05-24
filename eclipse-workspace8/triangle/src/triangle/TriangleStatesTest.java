package triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriangleStatesTest {
	private TriangleStates statesV1;

	@BeforeEach
	void setUp() throws Exception {
		this.statesV1= new TriangleStates();
	}

	@Test
	void test1() {
		assertEquals("Not a triangle",this.statesV1.sc(0,0,1));
	}
	@Test
	void test2() {
		assertEquals("Equilateral triangle",this.statesV1.sc(1,1,1));  //boundary values
	}
	@Test
	void test3() {
		assertEquals("Not a triangle",this.statesV1.sc(-1,1,2));
	}
	
	@Test
	void test4() {
		assertEquals("Not a triangle",this.statesV1.sc(3,2,6));
	}

	@Test
	void test5() {
		assertEquals("Not a triangle",this.statesV1.sc(3,2,1));
	}
	@Test
	void test6() {
		assertEquals("Not a triangle",this.statesV1.sc(5,5,10));
	}
	@Test
	void test7() {
		assertEquals("Scalene triangle",this.statesV1.sc(5,6,10));
	}
	@Test
	void test8() {
		assertEquals("Isosceles triangle",this.statesV1.sc(5,5,9));
	}
}
