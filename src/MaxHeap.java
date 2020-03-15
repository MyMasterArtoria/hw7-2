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
    		swaplogN(i);
    		i++;
    		size++;
    	}
    }
    private void swaplogN(int i)
    {
    	int parent=(i-1)/2;
    	if(this.data[i]>this.data[parent])
    	{	 
    		int swap=this.data[parent];
    		this.data[parent]=this.data[i];
    		this.data[i]=swap;
    		swaplogN(parent);
    	}
    	else 
    	{return;}
    }
   
    // build a heap based on data
    // to be implemented in O(n)
    public void MaxHeapN(Integer[] data) {
    	int n=data.length;
    	for(int i=0;i<n;i++) {
    		this.data[i]=data[i];
    	}
    	size=n;
      int lastnode=(n/2)-1;
      	for(int j=lastnode;j>=0;j--) {
      		heapify(this.data,n,j);
      	}
    }
    private void heapify(Integer arr[], int n, int i) {
    	int largest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest]) 
        { largest = l;} 
        if (r < n && arr[r] > arr[largest]) 
            {largest = r;} 
        if (largest != i) { 
        	{
        		int swap=arr[i];
        		arr[i]=arr[largest];
        		arr[largest]=swap;
        	} 

            heapify(arr, n, largest); 
        } 
    }
    
    // add an item to the heap
    public boolean add(Integer item) {
    	this.data[size]=item;
    	swaplogN(size);
    	size++;
        return true;
    }

    // return the max item in the heap
    public Integer get() {
   
        return this.data[0];
    }

    // remove the root item
    public Integer pop() {
    	int n=data.length;
        int lastElement = data[n - 1];  
        int root=data[0];
        data[0] = lastElement;  
        size= size - 1; 
        n=n-1;
        heapify(data,n, 0); 
        data[size]=null;
        return root; 
        
    }
}
