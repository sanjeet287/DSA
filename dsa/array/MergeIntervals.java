package com.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {

        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int[][] merged = merge(intervals);

        System.out.println("Merged Intervals:");
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }

    }

    private static int[][] merge(int[][] intervals) {

        if(intervals.length<=1) return intervals;

        List<int[]> mergedIntervals=new ArrayList<>();

        int[] currentInterval=intervals[0];
        mergedIntervals.add(currentInterval);

        for(int[]interval:intervals) {

            if(interval[0] <= currentInterval[1]) {
                currentInterval[1]=Math.max(currentInterval[1], interval[1]);
            }else {
                currentInterval=interval;
                mergedIntervals.add(currentInterval);
            }
        }

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
