class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String firstString = strs[0];
        String lastString = strs[strs.length - 1];
        for (int i = 0; i < firstString.length(); i++) {
            if(i == lastString.length() || firstString.charAt(i) != lastString.charAt(i)) {
                firstString = firstString.substring(0, i);
            }
        }
        return firstString;
    }
}