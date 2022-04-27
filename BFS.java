import java.util.ArrayList;
import java.util.Queue;
import java.util.*;


public class BFS
{
    public void traverse(int root)
    {
        Queue<Integer> queue= new LinkedList<>();
        ArrayList<Integer> visited = new ArrayList<>();
        visited.add(root);
        root.setVisited(true);
        queue.add(root);
        while(!queue.isEmpty())
        {
            int vertex=queue.remove();
            LinkedList<Edge> list=adjancenylist[vertex];
            for (int j = 0; j <list.size() ; j++) 
            {
                LinkedList<Integer> choice=new LinkedList<Integer>;
                choice.add(list.get(j).destination);
                for(int v: choice)
                {
                    if(!v.isVisited())
                    {
                        v.setVisited(true);
                        queue.add(v);
                    }
                }
            }
        }
    }
}
