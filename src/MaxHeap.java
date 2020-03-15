public class MaxHeap implements Heap {
    int size;

    Integer[] data;

    public MaxHeap(int capacity) {
        data = new Integer[capacity];
        size = 0;
    }

    // build a heap based on data
    // to be implemented in O(nlogn)
    public void MaxHeapLogN(Integer[] data) {
    	int i=0;
    	while(i<data.length)
    	{
    		this.data[i]=data[i];
    		swap(i);
    		i++;
    		size++;
    	}
    }
    private void swap(int i)
    {
    	int parent=(i-1)/2;
    	if(this.data[i]>this.data[parent])
    	{	 
    		int swap=this.data[parent];
    		this.data[parent]=this.data[i];
    		this.data[i]=swap;
    		swap(parent);
    	}
    	else 
    	{return;}
    }
   
    
   
    // build a heap based on data
    // to be implemented in O(n)
    public void MaxHeapN(Integer[] data) {
      
    }

    // add an item to the heap
    public boolean add(Integer item) {
      
        return false;
    }

    // return the max item in the heap
    public Integer get() {
   
        return null;
    }

    // remove the root item
    public Integer pop() {
      
        return null;
    }
}
