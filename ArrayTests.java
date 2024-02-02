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
    int[] input1 = {0, 1, 2};
    assertArrayEquals(new int[] {0, 1, 2}, ArrayExamples.reversed(input1));
  }
}
