package datastructure;

public class MySparseGrape {
	private int numOfVertex;
	private int maxVertex;
	private GrapeNode[] adjacencyList;

	public MySparseGrape(int maxVertex) {
		this.numOfVertex = 0;
		this.maxVertex = maxVertex;
		this.adjacencyList = new GrapeNode[maxVertex];
	}

	private boolean isFull() {
		return ((numOfVertex + 1) > maxVertex);
	}

	public void insertVertex(int v) {
		if (isFull()) {
			System.err.println("정점의 개수 초과");
			System.exit(-1);
		}
		numOfVertex++;
	}

	public void insertEdge(int u, int v) {
		if (u >= numOfVertex || v >= numOfVertex) {
			System.err.println("정점 번호 오류");
			System.exit(-2);
		}
		GrapeNode node = new GrapeNode();
		node.setVertex(v);
		node.setLink(adjacencyList[u]);
		adjacencyList[u] = node;
	}

	public GrapeNode[] getAdjacencyList() {
		return adjacencyList;
	}

}
