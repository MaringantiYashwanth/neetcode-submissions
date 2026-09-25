class KthLargest {
    // public class Heap 
    // {
    //     private List<Integer> heap;

    //     public Heap() {
    //         heap = new ArrayList<>();
    //     }

    //     public int getSize() {
    //         return heap.size();
    //     }

    //     public boolean isEmpty() {
    //         return heap.isEmpty();
    //     }

    //     public void insert(int value) {
    //         heap.add(value);
    //         bubbleUp(getSize() - 1); 
    //     }

    //     public void swap(int index, int parentIndex) {
    //         int temp = heap.get(index);
    //         heap.set(index, heap.get(parentIndex));
    //         heap.set(parentIndex, temp);
    //     }

    //     public void bubbleUp(int index) {
    //         int parentIndex = (index - 1) / 2;
    //         while (index > 0 && heap.get(index) > heap.get(parentIndex)) {
    //             swap(index, parentIndex);
    //             index = parentIndex;
    //             parentIndex = (index - 1) / 2;
    //         }
    //     }

    //     public Integer remove() {
    //         if (isEmpty()) {
    //             return null;
    //         }
    //         if (heap.size() == 1) {
    //             return heap.remove(heap.size() - 1);
    //         }
    //         int root = heap.get(0);
    //         heap.set(0, heap.remove(heap.size() - 1));
    //         sinkDown(0);
    //         return root;
    //     }

    //     public void sinkDown(int index) {
    //         int size = heap.size();
    //         int largest = index;
    //         while (true) {
    //             int left = 2 * index + 1;
    //             int right = 2 * index + 2;
    //             if (left  < size && heap.get(left) < heap.get(largest)) {
    //                 largest = left;
    //             }
    //             if (right < size && heap.get(right) < heap.get(largest)) {
    //                 largest = right;
    //             }

    //             if (largest != index) {
    //                 swap(index, largest);
    //                 index = largest;

    //             } else {
    //                 break;
    //             }
    //         }
    //     }
    // }
    private PriorityQueue<Integer> minHeap ;
    private List<Integer> arr;
    private int num;
    public KthLargest(int k, int[] nums) {
         arr = new ArrayList<>();
         num = k;
         for (int i = 0; i < nums.length; i++) {
            arr.add(nums[i]);
         }
    }
    
    public int add(int val) {
        arr.add(val);
        Collections.sort(arr);
        return arr.get(arr.size() - num);
    } 
}
