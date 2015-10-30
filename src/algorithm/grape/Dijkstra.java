package algorithm.grape;

import java.util.Arrays;

public class Dijkstra {
	private int[][] weight;
	private int[] distance;
	private boolean[] found;

	public Dijkstra(int maxVertex) {
		this.weight = new int[maxVertex][maxVertex];
		this.distance = new int[maxVertex];
		this.found = new boolean[maxVertex];
		Arrays.fill(found, false);
	}

	public int choose(int n) {
		int min = 10000000, minpos = -1;

		for (int i = 0; i < n; i++) {
			if (distance[i] < min && found[i] == false) {
				min = distance[i];
				minpos = i;
			}
		}

		return minpos;
	}

	public void shortestPath(int start, int n) {
		for (int i = 0; i < n; i++) {
			distance[i] = weight[start][i];
		}
		found[start] = true;
		distance[start] = 0;

		for (int i = 0; i < n - 1; i++) {
			int u = choose(n);
			found[u] = true;

			for (int w = 0; w < n; w++) {
				if (found[w] == false && (distance[u] + weight[u][w] < distance[w])) {
					distance[w] = distance[u] + weight[u][w];
				}
			}
		}
	}

}
