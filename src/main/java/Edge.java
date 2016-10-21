/**
 * Created by borisgrunwald on 19/10/2016.
 */
public class Edge {

    int u;
    int v;

    public Edge(int u, int v) {
        this.u = u;
        this.v = v;
    }


    @Override
    public boolean equals(Object obj) {
        return obj instanceof Edge && u == ((Edge) obj).u && v == ((Edge) obj).v;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "u=" + u +
                ", v=" + v +
                '}';
    }
}
