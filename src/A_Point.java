public class A_Point {
    
	private int[] low;
    private int[] pre;
    private int cnt;
    private boolean[] articulation;

	public A_Point(Graph G) {
        low = new int[G.V()];
        pre = new int[G.V()];
        articulation = new boolean[G.V()];
        for (int v = 0; v < G.V(); v++)
            low[v] = -1;
        for (int v = 0; v < G.V(); v++)
            pre[v] = -1;
        
        for (int v = 0; v < G.V(); v++)
            if (pre[v] == -1)
                dfs(G, v, v);
    }

    public boolean isArticulation(int v) { return articulation[v]; }
}
