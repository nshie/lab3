import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
  @Test
  public void testFilter() {
    ArrayList<String> input = new ArrayList<>();
    input.add("Hello");
    input.add("World");
    input.add("Apple");
    input.add("Pineapple");

    List<String> output = ListExamples.filter(input, new StringChecker() {
      @Override
      public boolean checkString(String s) {
        return true;
      }
    });

    assertEquals(output.get(0), "Hello");
    assertEquals(output.get(1), "World");
    assertEquals(output.get(2), "Apple");
    assertEquals(output.get(3), "Pineapple");
  }

    @Test
  public void testMerge() {
    ArrayList<String> input = new ArrayList<>();
    input.add("Hello");
    input.add("World");
    input.add("Apple");
    input.add("Pineapple");

    List<String> output = ListExamples.filter(input, new StringChecker() {
      @Override
      public boolean checkString(String s) {
        return true;
      }
    });

    assertEquals(output.get(0), "Hello");
    assertEquals(output.get(1), "World");
    assertEquals(output.get(2), "Apple");
    assertEquals(output.get(3), "Pineapple");
  }
}
