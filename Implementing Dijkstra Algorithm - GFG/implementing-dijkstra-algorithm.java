// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main(String args[]) throws IOException {

        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            int S = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            
            int[] ptr = ob.dijkstra(V, adj, S);
            
            for(i=0; i<V; i++)
                System.out.print(ptr[i] + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java


// class Solution
// {
//     //Function to find the shortest distance of all the vertices
//     //from the source vertex S.
//     static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
//     {
//         // Write your code here
//         int dist [] = new int[V+1];
//         Arrays.fill(dist,Integer.MAX_VALUE);
//         dist[S]=0;
//         PriorityQueue<Node> pq = new PriorityQueue<Node>(V,new Node());
//         pq.offer(0,);
        
//         while(pq.size()>0){
//             Node node = pq.poll();
//             for(Node it:adj.get(node.getV())){
//                 if(dist[node]+it.getWeight() < dist[it.getV()]){
//                     dist[it.getV()] = dist[node]+it.getWeight();
//                     pq.add(new Node(it.getV(),dist[it.getV()]));
//                 }
//             }
//         }
//     }
// }   
//     class Node implements Comparator<Node>{
//         private int v;
//         private int weight;
        
//         Node(int _v,int _w){
//             v=_v;
//             weight=_w;
//         }
//         int getV(){
//             return v;
//         }
//         int getWeight(){
//             return weight;
//         }
//         @Override
//         public int compare ( Node node1 , Node node2 ){
//             if ( node1.weight < node2.weight )
//                 return -1 ;
//             if ( node1.weight > node2.weight )
//                 return 1 ;
//             return 0 ;
//         }
// }

//User function Template for Java


class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int s)
    {
       //create a distance array
       //intialize it with integer.maxvalue
       //create a priority Queue
       //add a source node to it with its distance in distance array
       //find all the adjacent nodes 
       //check if dis[adjacentNode] > distance.source node + adjacent node distance
       //add in prioirty Queue
       
       int[] distance = new int[V];
       Arrays.fill(distance, Integer.MAX_VALUE);
       
       PriorityQueue<Pair> pq = new PriorityQueue<>(V, new Pair());
       
       distance[s] = 0;
       pq.add(new Pair(s, 0));
       while(!pq.isEmpty()){
           Pair node = pq.poll();
           
          ArrayList<ArrayList<Integer>> list = adj.get(node.vertex);
          for(ArrayList<Integer> lists : list){
              int adjVertex = lists.get(0);
              int adjWeight = lists.get(1);
              
              if(distance[adjVertex] > node.weight + adjWeight)
              {
                 distance[adjVertex] = node.weight + adjWeight;
                 pq.add(new Pair(adjVertex, distance[adjVertex]));
              }
          }
       }
       return distance;
    }
    
}
class Pair implements Comparator<Pair>{
    int vertex;
    int weight;
    Pair(){}
    Pair(int vertex, int weight){
        this.vertex =vertex;
        this.weight = weight;
    }
    
    public int compare(Pair p1, Pair p2){
        if(p1.weight < p2.weight)
            return 1;
        else if(p1.weight > p2.weight)
            return -1;
        else 
            return 0;
    }
}


