import java.util.*;

public class Main {
    static ArrayList<Integer>[] panel;
    static boolean[] vs;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        		
        int m = sc.nextInt();
        int v = sc.nextInt();

        
        panel = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            panel[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            panel[a].add(b);
            panel[b].add(a);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(panel[i]);
        }

        vs = new boolean[n+1];
        dfs(v);
        System.out.println();
        vs = new boolean[n+1];
        bfs(v);
    }

    
    
    
    
    public static void dfs(int v) {
        	vs[v] = true;
        System.out.print(v + " ");
        for (int i = 0; i < panel[v].size(); i++) {
            int n = panel[v].get(i);
            if (!vs[n]) {
                dfs(n);
            }
        }
    }

    public static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        	vs[v] = true;
        q.offer(v);
        while (!q.isEmpty()) {
            int cur = q.poll();
            System.out.print(cur + " ");
            for (int i = 0; i < panel[cur].size(); i++) {
                int m = panel[cur].get(i);
                if (!vs[m]) {
                    vs[m] = true;
                    q.offer(m);
                }
            }
        }
    }
}