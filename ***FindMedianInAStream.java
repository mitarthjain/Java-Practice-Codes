import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class GFG {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine());
		int[] a = new int[t];
		int i = 0;
		while (t-- > 0) {
			int x = Integer.parseInt(reader.readLine());
			a[i++] = x;
		}
		int[] medians = runningMedian(a);
		for (int median : medians) {
			System.out.println(median);
		}
	}

	private static final PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    private static final PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    private static int[] runningMedian(int[] a) {
        
        int[] medians = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int number = a[i];
            addNum(number);
            medians[i] = findMedian();
        }
        return medians;
    }

    private static void addNum(int num) {
        minHeap.add(num);
        maxHeap.add(minHeap.remove());

        if (minHeap.size() < maxHeap.size()) {
            minHeap.add(maxHeap.remove());
        }
    }

    private static int findMedian() {
        if (minHeap.size() > maxHeap.size()) {
            return minHeap.peek();
        } else {
            return (minHeap.peek() + maxHeap.peek()) / 2;
        }
    }

}
