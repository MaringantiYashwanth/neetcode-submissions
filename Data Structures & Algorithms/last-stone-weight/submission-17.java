class Solution {
    public class MyHeap {
        private List<Integer> heap;
        
        public MyHeap() {
            heap = new ArrayList<>();
        }

        public int left(int index) {
            return 2 * index + 1;
        }
    
        public int right(int index) {
            return 2 * index + 2;
        }
    
        public int parent(int index) {
            return (index - 1) / 2;
        }

        public boolean isEmpty() {
            return heap.isEmpty();
        }

        public Integer getMax() {
            if (isEmpty()) {
                return null;
            }
            return heap.get(0);
        }

        public int getSize() {
            return heap.size();
        }

        public void insert(int value) {
            heap.add(value);
            bubbleUp(heap.size() - 1);
        }

        public void bubbleUp(int index) {
            int parentIndex = (index - 1) / 2;
            while (heap.get(index) > heap.get(parentIndex) && index > 0) {
                swap(index, parentIndex);
                index = parentIndex;
                parentIndex = (index - 1) / 2;
            }
        }

        public Integer remove() {
            if (isEmpty()) {
                return null;
            }
            if (heap.size() == 1) {
                return heap.remove(heap.size() - 1);
            }
            int root = heap.get(0);
            heap.set(0, heap.remove(heap.size() - 1));
            sinkDown(0);

            return root;
        } 

        public void sinkDown(int index) {
            int size = heap.size() - 1;
            int largest = index;
            while (true) {
                if (left(index) <= size && heap.get(left(index)) > heap.get(largest)) {
                   largest = left(index); 
                }
                if (right(index) <= size && heap.get(right(index)) > heap.get(largest)) {
                    largest = right(index);
                }

                if (largest != index) {
                    swap(index, largest);
                    index = largest;
                } else {
                    break;
                }
            }
        }

        public void swap(int index, int parentIndex) {
            int temp = heap.get(index);
            heap.set(index, heap.get(parentIndex));
            heap.set(parentIndex, temp);
        }
    }
    public int lastStoneWeight(int[] stones) {
        MyHeap myHeap = new MyHeap();
        for (int stone : stones) {
            myHeap.insert(stone);
        }         
        while (myHeap.getSize() > 1) {
            int a = myHeap.remove();
            int b = myHeap.remove();
            int difference = a - b;
            if (difference > 0) {
                myHeap.insert(difference);
            }
        }
        int val = myHeap.isEmpty() ? 0 : myHeap.remove();
        return val;
    }
}
