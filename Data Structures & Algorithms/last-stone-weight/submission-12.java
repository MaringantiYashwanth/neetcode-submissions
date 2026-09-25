class Solution {
    
    // class MaxHeap {
    //     private List<Integer> heap;

    //     public MaxHeap() {
    //         heap = new ArrayList<>();
    //     }

    //     public boolean isEmpty() {

    //         return heap.isEmpty();
    //     }

    //     public Integer getMax() {
    //         if (isEmpty()) {
    //             return null;
    //         }
    //         return heap.get(0);
    //     }

    //     public int getSize() {
    //         return heap.size();
    //     }

    //     public void insert(int value) {
    //         heap.add(value);
    //         bubbleUp(heap.size() - 1);
    //     }

    //     public void bubbleUp(int index) {
    //         int parentIndex = (index - 1) / 2;
    //         while(index > 0 && heap.get(index) > heap.get(parentIndex)) {
    //             swap(index, parentIndex);
    //             index = parentIndex;
    //             parentIndex = (index - 1) / 2;
    //         }
    //     }
    // }
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        for (int stone: stones) {
            maxHeap.add(stone);
        }
        while (maxHeap.size() > 1) {
            int a = maxHeap.poll();
            int b = maxHeap.poll();
            int difference =  a - b;

            if (difference > 0) {
                maxHeap.add(difference);
            } 

            // if (difference == 0) {
            //     maxHeap.add(0);
            // }
        }

        int val = maxHeap.isEmpty() ? 0 : maxHeap.poll();
        return val;
    }
}
