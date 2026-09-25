class Solution {
    
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
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

            if (difference == 0) {
                maxHeap.add(0);
            }
        }

        Integer val = maxHeap.poll();
        return val;
    }
}
