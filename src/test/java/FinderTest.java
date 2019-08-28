import org.junit.*;
import static org.junit.Assert.assertEquals;

public class FinderTest {

    @Test
    public void test_findMax_valid() {
        System.out.println("@Test - test_findMax_valid");
        Finder finder = new Finder();
        int[] intArray = {-1000, 0, 1000, 15, 20, 25};
        Integer expectedResult = 1000;
        Integer actualResult = finder.findMax(intArray);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_findMax_empty() {
        System.out.println("@Test - test_findMax_empty");
        Finder finder = new Finder();
        int[] intArray = { };
        Integer expectedResult = null;
        Integer actualResult = finder.findMax(intArray);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_findMax_null() {
        System.out.println("@Test - test_findMax_null");
        Finder finder = new Finder();
        int[] intArray = null;
        Integer expectedResult = null;
        Integer actualResult = finder.findMax(intArray);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_findMin_valid() {
        System.out.println("@Test - test_findMin_valid");
        Finder finder = new Finder();
        int[] intArray = {-1000, 0, 1000, 15, 20, 25};
        Integer expectedResult = -1000;
        Integer actualResult = finder.findMin(intArray);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_findMin_empty() {
        System.out.println("@Test - test_findMin_empty");
        Finder finder = new Finder();
        int[] intArray = { };
        Integer expectedResult = null;
        Integer actualResult = finder.findMin(intArray);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_findMin_null() {
        System.out.println("@Test - test_findMin_null");
        Finder finder = new Finder();
        int[] intArray = null;
        Integer expectedResult = null;
        Integer actualResult = finder.findMin(intArray);
        assertEquals(actualResult, expectedResult);
    }

}
