import java.util.*;

public class NearestKPoints
{
   public static class points implements Comparable<points>
   {
      int x;
      int y;
      int idx;
      int distsq;


       points(int x, int y, int distsq, int idx)
        {
            this.x = x;
            this.y = y;
            this.distsq = distsq;
            this.idx = idx;
        }

      @Override
      public int compareTo(points p2)
       {
          return this.distsq - p2.distsq;
       }
}


public static void main(String args[])
{
   int pts[][] = { {5,-1}, {-2,4},{3,3}};
   int k = 2 ;

   PriorityQueue<points> pq = new PriorityQueue<>();
   
    
   for(int i = 0; i < pts.length; i++)
     {
        int distsq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
        pq.add( new points( pts[i][0], pts[i][1],distsq, i));
     }
   
   
   
   for(int i = 0; i < k; i++)
     {
        //System.out.println("C "+pq.remove().idx);
        System.out.println(pq.peek().x+" "+pq.peek().y+" "+pq.peek().distsq);
        pq.remove();
     }
    
}

}