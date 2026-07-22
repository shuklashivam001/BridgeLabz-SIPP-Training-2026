package dsa.dsa.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class LogEntry {

    int timestamp;

    LogEntry(int timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return String.valueOf(timestamp);
    }
}

public class MergeKSortedLogs {

    static List<LogEntry> mergeLogs(List<List<LogEntry>> logFiles) {

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                (a, b) ->
                        logFiles.get(a[0]).get(a[1]).timestamp -
                                logFiles.get(b[0]).get(b[1]).timestamp
        );

        // Insert first element of every list
        for (int i = 0; i < logFiles.size(); i++) {
            if (!logFiles.get(i).isEmpty()) {
                minHeap.offer(new int[]{i, 0});
            }
        }

        List<LogEntry> mergedLogs = new ArrayList<>();

        while (!minHeap.isEmpty()) {

            int[] current = minHeap.poll();

            int listIndex = current[0];
            int elementIndex = current[1];

            mergedLogs.add(logFiles.get(listIndex).get(elementIndex));

            if (elementIndex + 1 < logFiles.get(listIndex).size()) {
                minHeap.offer(new int[]{listIndex, elementIndex + 1});
            }
        }

        return mergedLogs;
    }

    public static void main(String[] args) {

        List<List<LogEntry>> logFiles = new ArrayList<>();

        logFiles.add(Arrays.asList(
                new LogEntry(1),
                new LogEntry(4),
                new LogEntry(7)
        ));

        logFiles.add(Arrays.asList(
                new LogEntry(2),
                new LogEntry(5),
                new LogEntry(8)
        ));

        logFiles.add(Arrays.asList(
                new LogEntry(3),
                new LogEntry(6),
                new LogEntry(9)
        ));

        List<LogEntry> merged = mergeLogs(logFiles);

        System.out.println("Merged Log Timeline:");
        for (LogEntry log : merged) {
            System.out.print(log.timestamp + " ");
        }
    }
}