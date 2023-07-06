package in.vinayit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class MathUtilsTest {

	@Test
	void testAdd() {
		assertEquals(1, MathUtils.add(0,1),"add method should add two numbers");
	}
	@Test
	void testComputeCircleRadius() {
		assertEquals(314.1592653589793,MathUtils.computeCircleArea(10),"should return right circle area");
	}
}
