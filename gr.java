import java.util.*;
public class gr{
    static class Edge{
        int src;
        int dst;
        int weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dst = d;
            this.weight = w;
        }
         
                  
    }
    public static void main(String args[]){
        int v = 5;

        ArrayList<Edge>[] grap = new ArrayList[v];

        for(int i=0; i<v;i++){
            grap[i] = new ArrayList<>();
        }
     grap[0].add(new Edge(0,1, 5));

     grap[1].add(new Edge(1, 0, 5));
     grap[1].add(new Edge(1, 2, 3));
     grap[1].add(new Edge(1, 3, 1));

     grap[2].add((new Edge(2,1 , 1)));
     grap[2].add((new Edge(2, 3, 1)));
     grap[2].add((new Edge(2, 4, 4)));


     grap[3].add(new Edge(3, 1, 3));
     grap[3].add(new Edge(3, 2, 1));

     for(int i=0;i<grap[2].size();i++){
        Edge e = grap[2].get(i);
        System.out.println(e.src +"->"+ e.dst);
     }

    }
}