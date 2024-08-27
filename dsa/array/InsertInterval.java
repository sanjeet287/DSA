package com.dsa.array;
import java.util.*;

public class InsertInterval {

    public static void main(String[] args) {

        int [][]intervals= { { 1, 3 }, { 6, 9 } };

        int[] newInterval = { 2, 5 };

        int[][] result=insertInterval(intervals,newInterval);
        for(int[]interval:result) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }

    private static int[][] insertInterval(int[][] intervals, int[] newInterval) {

        List<int[]>mergedInterval=new ArrayList<>();
        int i=0;

        //check if new interval is non-overlapping in given intervals
        while(i<intervals.length && intervals[i][1] < newInterval[0]) {
            mergedInterval.add(newInterval);
            i++;
        }

        //now merge the new interval in existing intervals
        while(i<intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        mergedInterval.add(newInterval);

        //now add remaining interval into result list
        while(i<intervals.length) {
            mergedInterval.add(intervals[i]);
            i++;
        }


        return mergedInterval.toArray(new int[mergedInterval.size()][]);
    }
}
