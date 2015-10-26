package data.structure;

public class MyGrape {
	private int numOfVertex;
	private int[][] adjacencyMatrix;
	private int maxVertex;

	public MyGrape(int maxVertex) {
		this.numOfVertex = 0;
		this.adjacencyMatrix = new int[maxVertex][maxVertex];
	}

	private boolean isFull() {
		return ((numOfVertex + 1) > maxVertex);
	}

	public void insertVertex() {
		if(isFull()) {
			System.err.println("정점의 개수 초과");
			System.exit(-1);
		}
		numOfVertex++;
	}
	
	public void insertEdge(int start, int end) {
		if(start >= numOfVertex || end >= numOfVertex) {
			System.err.println("정점 번호 오류");
			System.exit(-2);
		}
		adjacencyMatrix[start][end] = 1;
		adjacencyMatrix[end][start] = 1;
	}
}
