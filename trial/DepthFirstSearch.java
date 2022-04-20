//package com.globalsoftwaresupport;

import java.util.Stack;
import java.util.List;


public class DepthFirstSearch{

	private Stack<VertexV2> stack;

	public DepthFirstSearch(){
		this.stack = new Stack<>();
	}

	public void dfs(List<VertexV2> vertexList){

		//it may happen that we have independent clusters
		for (VertexV2 v: vertexList ) {
			if (!v.isVisited()) {
				v.setVisited(true);
				dfsHelper(v);
			}
		}
	}

	private void dfsHelper(VertexV2 rootVertex){
		//LIFO STRUCTURE
		stack.add(rootVertex);
		rootVertex.setVisited(true);

		while (!stack.isEmpty()) {
			VertexV2 actualVertex = stack.pop();
			System.out.println((actualVertex));

			//consider all the neighbors
			for (VertexV2 v : actualVertex.getAdjacencyList()) {
				if (!v.isVisited()) {
					v.setVisited(true);
					stack.add(v);
				}
			}
		}


	}
}//end class