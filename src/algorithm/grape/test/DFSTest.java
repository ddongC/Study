package algorithm.grape.test;

import algorithm.grape.DFS;
import datastructure.grape.MySparseGrape;

public class DFSTest {
	public static void main(String[] args) {
		MySparseGrape sg = new MySparseGrape(30);

		sg.insertVertex(0);
		sg.insertVertex(1);
		sg.insertVertex(2);
		sg.insertVertex(3);

		sg.insertEdge(0, 1);
		sg.insertEdge(1, 2);
		sg.insertEdge(0, 3);

		DFS dfs = new DFS(30);
		
		dfs.dfsList(sg, 0);
	}
}
