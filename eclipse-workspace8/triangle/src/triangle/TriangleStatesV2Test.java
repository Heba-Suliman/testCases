package triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriangleStatesV2Test {
	
	private TriangleStates statesV2;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Ignore
	void test1() {
		assertEquals("Not a triangle",this.statesV2.sc(0,0,1));
	}
	@Ignore
	void test2() {
		assertEquals("Not a triangle",this.statesV2.sc(1,1,1));  //boundary values
	}
	@Ignore
	void test3() {
		assertEquals("Not a triangle",this.statesV2.sc(-1,1,2));
	}
	
	@Test
	void test4() {
		assertEquals("Not a triangle",this.statesV2.sc(3,2,6));
	}

	@Test
	void test5() {
		assertEquals("Not a triangle",this.statesV2.sc(3,2,1));
	}
	@Test
	void test6() {
		assertEquals("Not a triangle",this.statesV2.sc(5,5,10));
	}
}
