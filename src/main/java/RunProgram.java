import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by borisgrunwald on 19/10/2016.
 */
public class RunProgram {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter name of file.");
        System.out.println();

        String fileName = userInput.next();

        Scanner input = new Scanner(new File(fileName));

        int NumOfVertices = input.nextInt();
        input.nextLine();

        //array to store vertices
        Integer[] vertices = new Integer[NumOfVertices];

        //Makes an adjacency matrix with size NumOfVertices x NumOfVertices
        int[][] adjMatrix = new int[NumOfVertices][NumOfVertices];

        //Reads data from file into vertices and adjmatrix
        for (int row = 0; row < adjMatrix.length; row++) {
            Scanner lineScan = new Scanner(input.nextLine());
            vertices[row] = lineScan.nextInt();
            while (lineScan.hasNextInt()) {
                int edge = lineScan.nextInt();
                adjMatrix[row][edge] = 1;
            }
        }

        //Construct a new graph with the given vertices and edges;
        Graph<Integer> g = new UnweightedGraph<>(adjMatrix,vertices);

        g.printEdges();

        AbstractGraph.Tree t = g.dfs(0);

        System.out.println(isConnected(t,g));



    }

    public static <V> String isConnected (AbstractGraph.Tree t, Graph<V> g) {

        if(t.getNumberOfVerticesFound() == g.getSize()) {
            return "Graph is connected";
        } else {
            return "Graph is not connected";
        }

    }

}
