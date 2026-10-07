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
    public boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort(Comparator.comparingInt(interval -> interval.start));
        boolean found = false;
       for (int i = 1; i < intervals.size(); i++) {
            int currentMeetingEnd = intervals.get(i - 1).end;
            int nextMeetingStart = intervals.get(i).start;
            if (currentMeetingEnd > nextMeetingStart){
                return false;
            }
       }
       return true;
    }
}
