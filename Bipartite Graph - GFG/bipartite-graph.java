// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int V = Integer.parseInt(S[0]);
            int E = Integer.parseInt(S[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for(int i = 0; i < V; i++){
                adj.add(new ArrayList<Integer>());
            }
            for(int i = 0; i < E; i++){
                String[] s = br.readLine().trim().split(" ");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isBipartite(V, adj);
            if(ans)
                System.out.println("1");
            else System.out.println("0");
       }
    }
}// } Driver Code Ends


class Solution
{
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj){
        int colors[]= new int[V];
        Arrays.fill(colors,-1);
        for(int i=0;i<V;i++){
            if(colors[i]==-1){
                if(!solve(adj,colors,i))
                    return false;
            }
        }
        return true;
    }
    public boolean solve( ArrayList<ArrayList<Integer>>adj,int colors[],int i){
        Queue <Integer> q = new LinkedList<>();
        q.add(i);
        colors[i]=1;
        while(!q.isEmpty()){
            int node = q.poll();
            for(int it:adj.get(node)){
                if(colors[it]==-1){
                    q.add(it);
                    colors[it]=1-colors[node];                    
                }
                else if(colors[it]==colors[node])
                    return false;
            }
        }
        return true;
    }
}