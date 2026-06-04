import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public boolean isPossible(int[] target) {
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;

        for (int x : target) {
            pq.add((long) x);
            sum += x;
        }

        while (true) {
            long mx = pq.poll();
            long rest = sum - mx;

            if (mx == 1) return true;
            if (rest == 1) return true;

            if (rest == 0 || mx <= rest) return false;

            long prev = mx % rest;
            if (prev == 0) return false;

            pq.add(prev);
            sum = rest + prev;
        }
    }
}