class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] arr = new int[n + 1];
        for (int[] i : trust) {
            arr[i[0]] = -1;
            arr[i[1]] += arr[i[1]] == -1 ? 0 : 1;
        }
        for (int i = 1; i < n + 1; i++)
            if (arr[i] == n - 1)
                return i;
        return -1;
    }
}