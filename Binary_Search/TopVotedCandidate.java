package Binary_Search;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class TopVotedCandidate {

    TreeMap<Integer, Integer> LeaderAtTime = new TreeMap<>();
    int leader;
    public static void main(String[] args) {
        int[] persons = {0, 1, 1, 0, 0, 1, 0};
        int[] times = {0, 5, 10, 15, 20, 25, 30};
        TopVotedCandidate obj = new TopVotedCandidate(persons, times);
        int param_1 = obj.q(3);
    }

    public TopVotedCandidate(int[] persons, int[] times) {
        int n = persons.length;
        leader = -1;
        Map<Integer, Integer> voteCount = new HashMap<>();
        for(int i = 0; i < n; i++){
            voteCount.put(persons[i], voteCount.getOrDefault(persons[i], 0)+1);
            if (i==0 || voteCount.get(persons[i]) >= voteCount.get(leader)){
                leader = persons[i];
            }
            LeaderAtTime.put(times[i], leader);
        }
    }

    public int q(int t) {
        return LeaderAtTime.floorEntry(t).getValue();
    }

}
