import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class _207 {
    public static boolean result;
    public static List<List<Integer>> graph;
    public static int [] check;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        result = true;
        graph = new ArrayList<>();
        check = new int[numCourses];

        for(int i=0; i<numCourses; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0; i<prerequisites.length; i++) {
            graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i<numCourses; i++) {
            dfs(prerequisites, hashMap, i);
        }

        return result;
    }
    public static void dfs(int [][] prerequisites, HashMap <Integer, Integer> hashMap, int i) {
        if(result == false) {
            return;
        }
        if(hashMap.get(i) != null) {
            result = false;
            return;
        }
        if(check[i] == 1) {
            return;
        }

        check[i] = 1;
        System.out.println(i);

        for(int j=0; j<graph.get(i).size(); j++) {
            hashMap.put(i, 1);
            dfs(prerequisites, hashMap, graph.get(i).get(j));
            hashMap.remove(i);
        }
    }
}