//package com.globalsoftwaresupport.advancedalgorithms;

import java.util.LinkedList;
import java.util.Queue;


public class BreadthFirstSearch {
	
	public void traverse(VertexV2 root){
		
		Queue<VertexV2> queue = new LinkedList<>();

		root.setVisited(true);
		queue.add(root);

		while (!queue.isEmpty()) {
			VertexV2 actualVertex = queue.remove();

			System.out.println("Actual visited vertex: " + actualVertex);

			for (VertexV2 v : actualVertex.getAdjacencyList() ) {
				if (!v.isVisited()) {
					v.setVisited(true);
					queue.add(v);
				}
			}
		}

	}


}//end class