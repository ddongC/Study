package algorithm.grape;

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
		for (GrapeNode w = g.getAdjacencyList()[v]; w != null; w = w.getLink()) {
			if (!visited[w.getVertex()]) {
				System.out.println(v + "에서 " + w.getVertex() + " 으로 이동 ");
				dfsList(g, w.getVertex());
			}
		}

	}
}
