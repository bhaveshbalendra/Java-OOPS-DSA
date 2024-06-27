package GACP.AssignmentGACP;
import java.io.BufferedReader;
// import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//Question King of code forces https://codeforces.com/gym/469833/submission/223238368

public class BhaveshBalendra_211010221_Assignment1 {
    public static void main(String[] args) throws IOException{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine());

            while (T-- > 0) {

                String s[] = br.readLine().trim().split(" ");
                int V = Integer.parseInt(s[0]);
                ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

                for (int i =0; i < V; i++) adj.add(i,new ArrayList<>());

                for (int j = 0; j < V*(V-1)/2 ; j++) {
                    String S[] = br.readLine().trim().split(" ");
                    int u = Integer.parseInt(S[0]);
                    int v = Integer.parseInt(S[1]); 
                    u--;
                    v--;  
                    adj.get(u).add(v);
                }

                ArrayList<Integer> ans = new ArrayList<>();
                Tournament solution = new Tournament();
                for (int i = 0; i < V; i++) {
                    if (solution.isQueen(i,adj) ) {
                        ans.add(i);
                    }
                } 
                for (int i = 0; i < ans.size(); i++) System.out.print(ans.get(i) + 1 + " ");
                System.out.println();
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}

class Tournament {
    Boolean isQueen(int s, GACP.AssignmentGACP.ArrayList<GACP.AssignmentGACP.ArrayList<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[adj.size()];
        for(int i=0;i<adj.size();i++)
        {
            vis[i] = false ;
        }
        q.add(s);
        vis[s] = true;
        int d = 0;
        
        while (!q.isEmpty() && d < 2) {
            int qs = q.size();
            for (int i = 0; i < qs; i++) {
                Integer node = q.poll();
                for (Integer j : adj.get(node)) {
                    if (vis[j] == false) {
                        vis[j] = true;
                        q.add(j);
                    }
                }
                d++;
            } 

        }
        for (int i = 0; i < vis.length; i++) {
            if (vis[i] == false) return false;
        }
        return true;
    }
}