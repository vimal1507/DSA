package com.dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TweetCountPerFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class TweetCounts {

    Map<String, TreeMap<Integer,Integer>> map;

    public TweetCounts() {
        map = new HashMap<>();
    }

    public void recordTweet(String tweetName, int time) {
        map.putIfAbsent(tweetName, new TreeMap<>());
        TreeMap<Integer,Integer> tm = map.get(tweetName);
        tm.put(time, tm.getOrDefault(time,0)+1);
    }

    public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {

        int interval = 60;
        if(freq.equals("hour")) interval = 3600;
        if(freq.equals("day")) interval = 86400;

        List<Integer> result = new ArrayList<>();

        TreeMap<Integer,Integer> tm = map.getOrDefault(tweetName,new TreeMap<>());

        for(int start = startTime; start <= endTime; start += interval){

            int end = Math.min(start + interval - 1, endTime);

            int count = 0;

            for(int time : tm.subMap(start,true,end,true).values()){
                count += time;
            }

            result.add(count);
        }

        return result;
    }
}
