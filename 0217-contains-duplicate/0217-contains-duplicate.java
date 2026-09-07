import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            // If number already exists, duplicate found
            if (set.contains(num)) {
                return true;
            }
            // Add number to set
            set.add(num);
        }

        // No duplicates found
        return false;
    }
}
