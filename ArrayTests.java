import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 0, 1, 2 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 0, 1, 2 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { 0, 1, 2 };
    assertArrayEquals(new int[] { 0, 1, 2 }, ArrayExamples.reversed(input1));
  }
  
  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = { 3.0, 3.0, 4.0 };
    assertEquals(3.5, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }
}
