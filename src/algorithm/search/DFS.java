package algorithm.search;

import java.util.Arrays;

import datastructure.grape.GrapeNode;
import datastructure.grape.MySparseGrape;

public class DFS {
	private boolean[] visited;

	public DFS(int maxVertex) {
		this.visited = new boolean[maxVertex];
		Arrays.fill(visited, false);
	}

	public void dfsList(MySparseGrape g, int v) {
		visited[v] = true;
		for (GrapeNode w = g.getAdjacencyList()[v];; w = w.getLink()) {
			if (!visited[w.getVertex()]) {
				dfsList(g, w.getVertex());
			}
		}

	}
}
