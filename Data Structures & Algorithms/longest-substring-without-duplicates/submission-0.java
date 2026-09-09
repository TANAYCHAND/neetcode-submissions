class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0;
        int[] hash = new int[255];
        for(int i=0; i<hash.length; i++){
            hash[i] = -1;
        }
        int left = 0;
        for(int j=0; j<s.length(); j++){
            int val = (int)s.charAt(j);
            if(hash[val] >= left){
                left = hash[val]+1;
            }
            hash[val] = j;

            maxlen = Math.max(maxlen,(j-left)+1);
        }
        return maxlen;
    }
}
