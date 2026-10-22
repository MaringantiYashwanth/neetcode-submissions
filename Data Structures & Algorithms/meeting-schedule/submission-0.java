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
       for (int i = 1; i < intervals.size(); i++) {

            
            
            int firstMeetingEnd = intervals.get(i - 1).end;
            int secondMeetingStart = intervals.get(i).start;
            if (secondMeetingStart < firstMeetingEnd) {
                return false;
            }
            if (firstMeetingEnd <= secondMeetingStart){
                return true;
            }
       }
       return false;
    }
}
