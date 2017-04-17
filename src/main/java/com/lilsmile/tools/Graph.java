package com.lilsmile.tools;

import java.util.List;

import static java.lang.Math.min;
import static java.util.Arrays.fill;

/**
 * Created by Smile on 18.03.2017.
 */
public class Graph {

    int[][] graph;
    boolean[] used;
    int[] depth;
    int vNum; // количество вершин

    public Graph(int[][] graph) {
        this.graph = graph;
        vNum = graph.length;
    }

    public int[] dfsHandler() {
        used = new boolean[graph.length];
        depth = new int[graph.length];
        for (int i = 0; i<graph.length; i++) {
            dfs(i);
            depth[i]=countUsed();
            cleanUsed();
        }
        return depth;
    }

    private int countUsed() {
        int sum=0;
        for (int i = 0; i<used.length; i++) {
            if (used[i]) {
                sum++;
            }
        }
        return sum;
    }

    private void cleanUsed() {
        used = new boolean[graph.length];
    }

    private void dfs(int pos) {
        used[pos] = true;
        //System.out.println(pos);
        for (int next : graph[pos])
            if (!used[next])
                dfs(next);
    }

    public int getDiameter() {

        return floydWarshall();
    }

    int INF = Integer.MAX_VALUE / 2; // "Бесконечность"



    private int floydWarshall() {
        int[][] dist = new int[vNum][vNum]; // dist[i][j] = минимальное_расстояние(i, j)
        for (int i = 0; i < vNum; i++) System.arraycopy(graph[i], 0, dist[i], 0, vNum);
        for (int k = 0; k < vNum; k++) {
            for (int i = 0; i < vNum; i++) {
                for (int j = 0; j < vNum; j++) {
                    dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
        int max = -INF;
        for (int i = 0; i< vNum; i++) {
            for (int j = 0; j<vNum; j++) {
                //System.out.print(dist[i][j]);
                //System.out.print(" ");
                if (dist[i][j] > max) {
                    max = dist[i][j];
                }
            }
            //System.out.println();
        }
        return max;
    }
}
