package datastructure.grape;

public class GrapeNode {
	private int vertex;
	private GrapeNode link;

	public GrapeNode() {

	}

	public int getVertex() {
		return vertex;
	}

	public void setVertex(int vertex) {
		this.vertex = vertex;
	}

	public GrapeNode getLink() {
		return link;
	}

	public void setLink(GrapeNode link) {
		this.link = link;
	}

}
