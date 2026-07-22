class Solution {
    public int maxStarSum(int[] vals, int[][] edges, int k) {
      int n = vals.length;

      List<Integer>[] graph = new ArrayList[n];

    for( int i = 0; i < n; i++){
        graph[i] = new ArrayList<>();
    }

    for (int[] e : edges){
        int u = e[0];
        int v = e[1];

        if(vals[v] > 0)
        graph[u].add(vals[v]);

         if(vals[u] > 0)
        graph[v].add(vals[u]);
    }
    int ans = Integer.MIN_VALUE;

    for( int i = 0; i < n; i++){
        Collections.sort(graph[i], Collections.reverseOrder());

        int sum = vals[i];

        for (int j = 0; j < Math.min(k, graph[i].size()); j++){
            sum += graph[i].get(j);
        }
        ans = Math.max(ans, sum);
    }
    return ans;
    }
}