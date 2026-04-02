import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // Step 1: Count the frequency of each number using a HashMap
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        // Step 2: Check if frequencies are unique using a HashSet
        // A Set only stores unique values, so if a frequency is repeated, 
        // it won't increase the set's size.
        Set<Integer> occurrences = new HashSet<>(counts.values());

        // If the number of unique elements in the map matches the size of the set,
        // all frequencies are unique.
        return counts.size() == occurrences.size();
    }
}
