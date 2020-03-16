import static org.junit.Assert.*;
import org.junit.Test; 
import java.util.Arrays;
public class MaxHeapTest {
	@Test
	public void LogNtest() {
	Integer[] test1= {3,1,5,2,6,4};
	MaxHeap H=new MaxHeap(6);
	H.MaxHeapLogN(test1);
	Integer[] expect={6,5,4,1,2,3};
	
	assertArrayEquals(H.data,expect);
	}
	
	@Test
	public void nTest(){
		Integer[] test1= {3,1,5,2,6,4};
		MaxHeap H=new MaxHeap(6);
		H.MaxHeapN(test1);
		Integer[] expect={6,3,5,2,1,4};
		assertArrayEquals(H.data,expect);
	}
	@Test
	public void addTest() {
		Integer[] test1= {8,7,6,4,3,5,2,1};
		MaxHeap H=new MaxHeap(9);
		H.MaxHeapLogN(test1);
		H.add(9);
		Integer[] expect={9,8,6,7,3,5,2,1,4};
		assertArrayEquals(H.data,expect);
	}
	@Test
	public void getTest() {
		Integer[] test1= {8,7,6,4,3,5,2,1};
		MaxHeap H=new MaxHeap(8);
		H.MaxHeapLogN(test1);
		Integer expect=8;
		Integer test=H.get();
		assertEquals(test,expect);
		
	}
	@Test
	public void popTest() {
		Integer[] test1= {9,8,6,7,3,5,2,1,4};
		MaxHeap H=new MaxHeap(9);
		H.MaxHeapLogN(test1);
		Integer test=H.pop();
		Integer expect=9;
		System.out.println(Arrays.toString(H.data));
		assertEquals(test,expect);
	}
	
}