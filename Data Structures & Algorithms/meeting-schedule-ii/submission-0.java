/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        List<Integer> startTimes = new ArrayList<>();
        List<Integer> endTimes = new ArrayList<>();
        for (Interval interval: intervals) {
            startTimes.add(interval.start);
            endTimes.add(interval.end);
        }
        Collections.sort(startTimes);
        Collections.sort(endTimes);
        int startPtr = 0, endPtr = 0;
        int rooms = 0, result = 0;
        while (startPtr < startTimes.size()) {
            if (startTimes.get(startPtr) < endTimes.get(endPtr)) {
                // a meeting is continuing
                startPtr++;
                rooms++;
            } else { // a meeting has ended before next meeting started
                rooms--;
                endPtr++;
            }
            result = Math.max(result, rooms);
        }
        return result;
    }
}
