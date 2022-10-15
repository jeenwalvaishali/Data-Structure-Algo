import java.util.ArrayList;
import java.util.List;

/*Given a directed acyclic graph (DAG) of n nodes labeled from 0 to n - 1,
find all possible paths from node 0 to node n - 1 and return them in any order.
The graph is given as follows: graph[i] is a list of all nodes you can visit from node i
(i.e., there is a directed edge from node i to node graph[i][j]).

Input: graph = [[1,2],[3],[3],[]]
Output: [[0,1,3],[0,2,3]]

Input: graph = [[4,3,1],[3,2,4],[3],[4],[]]
Output: [[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]

* */
public class SourceToTarget {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> possibleList = new ArrayList();
        List<Integer> list = new ArrayList();
        list.add(0);
        generatePathList(graph, list, possibleList, 0, graph.length - 1);
        return possibleList;
    }

    void generatePathList(int[][] graph, List<Integer> list, List<List<Integer>> possibleList, int startNode, int lastNode) {
        if(startNode == lastNode) {
            possibleList.add(new ArrayList(list));
            return;
        }

        for(int i : graph[startNode]) {
            list.add(i);
            generatePathList(graph, list, possibleList, i, lastNode);
            list.remove(list.size() - 1);
        }
    }
}
