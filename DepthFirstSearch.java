//package com.globalsoftwaresupport;

import java.util.Stack;
import java.util.List;


public class DepthFirstSearch{

	private Stack<Vertex> stack;

	public DepthFirstSearch(){
		this.stack = new Stack<>();
	}

	public void dfs(List<Vertex> vertexList){

		//it may happen that we have independent clusters
		for (Vertex v: vertexList ) {
			if (!v.isVisited()) {
				v.setVisited(true);
				dfsHelper(v);
			}
		}
	}

	private void dfsHelper(Vertex rootVertex){
		//LIFO STRUCTURE
		stack.add(rootVertex);
		rootVertex.setVisited(true);

		while (!stack.isEmpty()) {
			Vertex actualVertex = stack.pop();
			System.out.println((actualVertex));

			//consider all the neighbors
			for (Vertex v : actualVertex.getAdjacencyList()) {
				if (!v.isVisited()) {
					v.setVisited(true);
					stack.add(v);
				}
			}
		}


	}
}//end class