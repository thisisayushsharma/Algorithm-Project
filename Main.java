
public class Main {
    public static void main(String[] args) {
        int vertices = 8;
        Graph.WGraph tree = new Graph.WGraph(vertices);
        tree.addEgde(0, 2, 4);
        tree.addEgde(2, 4, 3);
        tree.addEgde(0, 6, 2);
        tree.addEgde(0, 1, 5);
        tree.addEgde(1, 7, 7);
        tree.addEgde(1, 3, 2);
        tree.addEgde(3, 5, 4);

        tree.printGraph();

        Graph.WGraph cycle = new Graph.WGraph(vertices);
        cycle.addEgde(0, 2, 4);
        cycle.addEgde(2, 4, 3);
        cycle.addEgde(4, 6, 2);
        cycle.addEgde(6, 7, 5);
        cycle.addEgde(7,5 , 7);
        cycle.addEgde(5, 3, 4);
        cycle.addEgde(3,1,6);
        cycle.addEgde(1,0,7);

        Graph.WGraph twelve = new Graph.WGraph(vertices);
        twelve.addEgde(0, 2, 4);
        twelve.addEgde(2, 4, 3);
        twelve.addEgde(4, 6, 2);
        twelve.addEgde(6, 7, 5);
        twelve.addEgde(7,5 , 7);
        twelve.addEgde(5, 3, 4);
        twelve.addEgde(3,1,6);
        twelve.addEgde(1,0,7);
        twelve.addEgde(2,5,8);
        twelve.addEgde(3,4,2);
        twelve.addEgde(6,0,4);
        twelve.addEgde(1,7,5);

        Graph.WGraph eighteen = new Graph.WGraph(vertices);
        eighteen.addEgde(0, 2, 4);
        eighteen.addEgde(2, 4, 3);
        eighteen.addEgde(4, 6, 2);
        eighteen.addEgde(6, 7, 5);
        eighteen.addEgde(7,5 , 7);
        eighteen.addEgde(5, 3, 4);
        eighteen.addEgde(3,1,6);
        eighteen.addEgde(1,0,7);
        eighteen.addEgde(2,5,8);
        eighteen.addEgde(3,4,2);
        eighteen.addEgde(6,0,4);
        eighteen.addEgde(1,7,5);
        eighteen.addEgde(6,3,4);
        eighteen.addEgde(7,2,5);
        eighteen.addEgde(0,7,8);
        eighteen.addEgde(1,6,2);
        eighteen.addEgde(5,4,4);
        eighteen.addEgde(3,2,5);

        Graph.WGraph twentyFour = new Graph.WGraph(vertices);
        twentyFour.addEgde(0, 2, 4);
        twentyFour.addEgde(2, 4, 3);
        twentyFour.addEgde(4, 6, 2);
        twentyFour.addEgde(6, 7, 5);
        twentyFour.addEgde(7,5 , 7);
        twentyFour.addEgde(5, 3, 4);
        twentyFour.addEgde(3,1,6);
        twentyFour.addEgde(1,0,7);
        twentyFour.addEgde(2,5,8);
        twentyFour.addEgde(3,4,2);
        twentyFour.addEgde(6,0,4);
        twentyFour.addEgde(1,7,5);
        twentyFour.addEgde(6,3,4);
        twentyFour.addEgde(7,2,5);
        twentyFour.addEgde(0,7,8);
        twentyFour.addEgde(1,6,2);
        twentyFour.addEgde(5,4,4);
        twentyFour.addEgde(3,2,5);
        twentyFour.addEgde(1,2,4);
        twentyFour.addEgde(2,6,5);
        twentyFour.addEgde(6,5,8);
        twentyFour.addEgde(5,1,2);
        twentyFour.addEgde(3,7,4);
        twentyFour.addEgde(0,4,5);

        Graph.WGraph fullyConnected = new Graph.WGraph(vertices);
        fullyConnected.addEgde(0, 2, 4);
        fullyConnected.addEgde(2, 4, 3);
        fullyConnected.addEgde(4, 6, 2);
        fullyConnected.addEgde(6, 7, 5);
        fullyConnected.addEgde(7,5 , 7);
        fullyConnected.addEgde(5, 3, 4);
        fullyConnected.addEgde(3,1,6);
        fullyConnected.addEgde(1,0,7);
        fullyConnected.addEgde(2,5,8);
        fullyConnected.addEgde(3,4,2);
        fullyConnected.addEgde(6,0,4);
        fullyConnected.addEgde(1,7,5);
        fullyConnected.addEgde(6,3,4);
        fullyConnected.addEgde(7,2,5);
        fullyConnected.addEgde(0,7,8);
        fullyConnected.addEgde(1,6,2);
        fullyConnected.addEgde(5,4,4);
        fullyConnected.addEgde(3,2,5);
        fullyConnected.addEgde(1,2,4);
        fullyConnected.addEgde(2,6,5);
        fullyConnected.addEgde(0,3,8);
        fullyConnected.addEgde(7,4,2);
        fullyConnected.addEgde(4,1,4);
        fullyConnected.addEgde(5,0,5);
        
        System.out.print(tree.getAdjacencyList(0).get(1).destination);        
    }
}

