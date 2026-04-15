package com.dsa.prefixsum;

import java.util.List;

public class MeetingRoomII {

	public static void main(String[] args) {
		

	}

	    public static int minMeetingRooms(List<Interval> intervals) {
	        int[] time = new int[1000001];
	        for(int i=0; i<intervals.size(); i++){
	            Interval t = intervals.get(i);
	            time[t.start] += 1;
	            time[t.end] += -1;
	        }
	        int count = 0;
	        int res = 0;
	        for(int x : time){
	            count += x;
	            res = Math.max(res,count);
	        }
	        return res;
	    }
	}


 
   class Interval {
      public int start, end;
      public Interval(int start, int end) {
          this.start = start;
          this.end = end;
      }
  }
   
   
   
   /*
    ========== 2nd approach ============
    public int minMeetingRooms(List<Interval> intervals) {
        intervals.sort((a, b) -> a.start - b.start);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (Interval interval : intervals) {
            if (!minHeap.isEmpty() && minHeap.peek() <= interval.start) {
                minHeap.poll();
            }
            minHeap.offer(interval.end);
        }
        return minHeap.size();
    }
    
    ==============3rd approach====================
    class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        // TreeMap automatically keys ko sorted rakhta hai
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for (Interval t : intervals) {
            map.put(t.start, map.getOrDefault(t.start, 0) + 1);
            map.put(t.end, map.getOrDefault(t.end, 0) - 1);
        }
        
        int count = 0;
        int res = 0;
        
        for (int x : map.values()) {
            count += x;
            res = Math.max(res, count);
        }
        
        return res;
    }
}

================4th approach ========================
class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int n = intervals.size();
        int[] starts = new int[n];
        int[] ends = new int[n];
        
        for (int i = 0; i < n; i++) {
            starts[i] = intervals.get(i).start;
            ends[i] = intervals.get(i).end;
        }
        
        // Dono ko sort kar lo
        Arrays.sort(starts);
        Arrays.sort(ends);
        
        int count = 0;
        int res = 0;
        int endPtr = 0;
        
        // Two pointers technique
        for (int i = 0; i < n; i++) {
            // Agar nayi meeting shuru ho rahi hai purani khatm hone se pehle
            if (starts[i] < ends[endPtr]) {
                count++;
            } else {
                // Purani khatm ho gayi, ek room khali ho gaya
                endPtr++;
            }
            res = Math.max(res, count);
        }
        
        return res;
    }
}

================5th approach====================

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        TreeSet<Integer> set = new TreeSet<>();
        for (Interval inv : intervals) {
            set.add(inv.start);
            set.add(inv.end);
        }

        Map<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for (int time : set) {
            map.put(time, rank++);
        }

        int[] timeDiff = new int[rank]; 
        
        for (Interval inv : intervals) {
            int startIdx = map.get(inv.start);
            int endIdx = map.get(inv.end);
            
            timeDiff[startIdx] += 1;
            timeDiff[endIdx] -= 1;
        }

        int count = 0, res = 0;
        for (int x : timeDiff) {
            count += x;
            res = Math.max(res, count);
        }

        return res;
    }
}
    
    */
