import java.util.Scanner;

public class Main2_93 {

    static int[] heap = new int[200001];
    static int H = 0;

    static void insert(int key) {
        if (H + 1 >= heap.length) {
            int[] newHeap = new int[heap.length * 2];
            System.arraycopy(heap, 0, newHeap, 0, heap.length);
            heap = newHeap;
        }

        H++;
        heap[H] = key;
        int i = H;

        while (i > 1 && heap[i / 2] < heap[i]) {
            int tmp = heap[i];
            heap[i] = heap[i / 2];
            heap[i / 2] = tmp;
            i = i / 2;
        }
    }

    static int extractMax() {
        int max = heap[1];
        heap[1] = heap[H];
        H--;

        int i = 1;
        while (true) {
            int l = 2 * i;
            int r = 2 * i + 1;
            int largest = i;

            if (l <= H && heap[l] > heap[largest]) {
                largest = l;
            }
            if (r <= H && heap[r] > heap[largest]) {
                largest = r;
            }

            if (largest == i)
                break;

            int tmp = heap[i];
            heap[i] = heap[largest];
            heap[largest] = tmp;
            i = largest;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String cmd = sc.next();
            if (cmd.equals("insert")) {
                int k = sc.nextInt();
                insert(k);
            } else if (cmd.equals("extract")) {
                System.out.println(extractMax());
            } else if (cmd.equals("end")) {
                break;
            }
        }
        sc.close();
    }
}
