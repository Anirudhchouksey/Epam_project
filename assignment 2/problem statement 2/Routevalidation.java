import java.util.*;

public class Routevalidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] dist = new int[N + 1];
        Arrays.fill(dist, -1);

        Deque<Integer> queue = new ArrayDeque<>();
        dist[1] = 0;
        queue.add(1);

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for (int nxt : adj.get(cur)) {
                if (dist[nxt] == -1) {
                    dist[nxt] = dist[cur] + 1;
                    queue.add(nxt);
                }
            }
        }

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (dist[i] != -1 && dist[i] <= D) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}