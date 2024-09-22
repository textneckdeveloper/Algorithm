import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Node>[] A;
    static long lcm;
    static boolean visited[];
    static long D[];

    static class Node {
        int b, p, q;
        Node(int b, int p, int q) {
            this.b = b;
            this.p = p;
            this.q = q;
        }
        int getB() { return b; }
        int getP() { return p; }
        int getQ() { return q; }
    }

    static long gcd(long a, long b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

    static void dfs(int nd) {
        visited[nd] = true;
        for (Node i : A[nd]) {
            int next = i.getB();
            if (!visited[next]) {
                D[next] = D[nd] * i.getQ() / i.getP();
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        A = new ArrayList[n];
        visited = new boolean[n];
        D = new long[n];
        lcm = 1;
        for (int i = 0; i < n; i++) A[i] = new ArrayList<Node>();
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            A[a].add(new Node(b, p, q));
            A[b].add(new Node(a, q, p));
            lcm *= (p * q / gcd(p, q));
        }
        D[0] = lcm;
        dfs(0);
        long mgcd = D[0];
        for (int i = 1; i < n; i++) mgcd = gcd(mgcd, D[i]);
        for (int i = 0; i < n; i++) System.out.print(D[i] / mgcd + " ");
    }
}