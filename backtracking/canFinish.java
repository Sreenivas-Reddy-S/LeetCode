package backtracking;

import java.util.HashSet;
import java.util.Set;

public class canFinish {
    public static void main(String[] args) {
        System.out.println(canFinish(2, new int[][]{{1,0}})); // true
        System.out.println(canFinish(2, new int[][]{{1,0},{0,1}})); // false
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        Set<Integer> visited = new HashSet<>();
        Set<Integer> visiting = new HashSet<>();
        for(int i = 0; i<numCourses; i++){
            if(!dfs(i, prerequisites, visited, visiting)){
                return false;
            }
        }
        return true;
    }

    public static boolean dfs(int course, int[][] prerequisites, Set<Integer> visited, Set<Integer> visiting){
        if(visited.contains(course)) return true;
        if(visiting.contains(course)) return false;
        visiting.add(course);
        for(int[] prerequisite: prerequisites){
            if(prerequisite[0]==course){
                if(!dfs(prerequisite[1], prerequisites, visited, visiting)){
                    return false;
                }
            }
        }
        visiting.remove(course);
        visited.add(course);
        return true;
    }
}
