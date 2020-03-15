import static org.junit.Assert.*;

public class MaxHeapTest {
	public void LogNtest() {
	Integer[] test1= {3,1,5,2,6,4};
	MaxHeap H=new MaxHeap(6);
	H.MaxHeapLogN(test1);
	for(int i=0;i<H.data.length;i++)
	{
	System.out.println(H.data[i]);
	}
	Integer[] expect={6,5,4,1,2,3};
	assertArrayEquals(H.data,expect);
	}
	
}