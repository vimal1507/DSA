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
    
    */
