class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfs(i, isConnected, vis);
                count++;
            }
        }

        return count;
    }

    void dfs(int node, int[][] graph, boolean[] vis) {
        vis[node] = true;

        for (int i = 0; i < graph.length; i++) {
            if (graph[node][i] == 1 && !vis[i]) {
                dfs(i, graph, vis);
            }
        }
    }
}