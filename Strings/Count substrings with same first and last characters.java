class Solution {
    //https://www.geeksforgeeks.org/problems/substrings-with-similar-first-and-last-characters3644/1
    //these problem achieved time complexity is O(N)
    // and the Space is O(1) because the frequency with constant 26 space
    //   Given a string s consisting of lowercase characters, the task is to find the count of all substrings that start and end with the same character.
    
    // Examples:
    
    // Input: s = "abcab"
    // Output: 7
    // Explanation: There are 7 substrings where the first and last characters are the same: "a", "abca", "b", "bcab", "c", "a", and "b"
    // Input: s = "aba"
    // Output: 4
    // Explanation: There are 4 substrings where the first and last characters are the same: "a", "aba", "b", "a"
    // Constraints:
    // 1 <= |s| <= 104
    // s contains lower case english alphabets
    public int countSubstring(String s) {
        int[] f = new int[26];
        int ans = 0;
        for(char c : s.toCharArray()){
            f[c - 'a']++;
            ans += f[c - 'a'];
        }
        // System.out.println(Arrays.toString(f));
        return ans;
    }
}
