import java.util.ArrayList;
import java.util.Scanner;

public class CycleOfGraph {
    static class Pair {
        int first, second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static void cycle(ArrayList<Integer>[] adj, int x, int p, int[] ch, int[] parent, int[] len) {
        if (ch[x] == 2) {
            return;
        }

        if (ch[x] == 1) {
            len[0]++;
            int current = p;

            while (current != x) {
                current = parent[current];
                len[0]++;
            }
            return;
        }
        parent[x] = p;

        ch[x] = 1;

        for (int i : adj[x]) {
            if (i == parent[x]) {
                continue;
            }
            cycle(adj, i, x, ch, parent, len);
        }
        ch[x] = 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            ArrayList<Integer>[] adj = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                adj[x].add(y);
                adj[y].add(x);
            }
            int[] len = {0};
            int[] ch = new int[n];
            int[] parent = new int[n];

            cycle(adj, 0, -1, ch, parent, len);

            System.out.println(len[0]);
        }
    }
}
