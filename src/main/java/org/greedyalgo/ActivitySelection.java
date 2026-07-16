package org.greedyalgo;
import java.util.*;

public class ActivitySelection {
        public static List<Integer> selectActivities(int[] startTimes, int[] finishTimes) {
            List<Integer> selectedActivities = new ArrayList<>();
            int n = startTimes.length;

            // Sort activities based on finish times
            List<Activity> activities = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                activities.add(new Activity(startTimes[i], finishTimes[i]));
            }
            Collections.sort(activities, Comparator.comparingInt(Activity::getFinishTime));

            // Select first activity
            selectedActivities.add(0);

            // Iterate through remaining activities
            int prevFinishTime = activities.get(0).getFinishTime();
            for (int i = 1; i < n; i++) {
                if (activities.get(i).getStartTime() >= prevFinishTime) {
                    selectedActivities.add(i);
                    prevFinishTime = activities.get(i).getFinishTime();
                }
            }

            return selectedActivities;
        }

        public static void main(String[] args) {
            int[] startTimes = {1, 3, 0, 5, 8, 5};
            int[] finishTimes = {2, 4, 6, 7, 9, 9};
            List<Integer> selectedActivities = selectActivities(startTimes, finishTimes);

            System.out.println("Selected activities:");
            for (int index : selectedActivities) {
                System.out.println("Activity " + (index + 1) + ": Start time = " + startTimes[index] + ", Finish time = " + finishTimes[index]);
            }
        }

        static class Activity {
            private int startTime;
            private int finishTime;

            public Activity(int startTime, int finishTime) {
                this.startTime = startTime;
                this.finishTime = finishTime;
            }

            public int getStartTime() {
                return startTime;
            }

            public int getFinishTime() {
                return finishTime;
            }
        }
    }

