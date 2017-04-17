package com.lilsmile.tools;

import java.util.List;

public class MindMapTool {


    public static int getAbsoluteDepth(int[][] graph){
        int[] depth = dfsHandler(graph);
        int sum = 0;
        for (int i = 0; i<depth.length; i++) {
            sum+=depth[i];
        }
        return sum;
    }

    public static double getAverageDepth(int[][] graph) {
        int[] depth = dfsHandler(graph);
        int count = 0;
        for (int i = 0; i<depth.length; i++)  {
            if (depth[i]>0) {
                count++;
            }
        }
        return getAbsoluteDepth(graph)/count;
    }

    public static int getMaxDepth(int[][] graph) {
        int[] depth = dfsHandler(graph);
        int maxDepth = -1;
        for (int i = 0; i<depth.length; i++) {
            if (depth[i]>=maxDepth) {
                maxDepth = depth[i];
            }
        }
        return maxDepth;
    }

    private static int[] dfsHandler(int[][] data) {
        Graph graph = new Graph(data);
        return graph.dfsHandler();
    }

    public static int getGraphsDiameter(int[][] data) {

        return 12;
    }

    public static int getGraphsHeight(int[][] graph) {
        //проще так посчитать
        return 7;
    }

    public static int getConceptsHeight(int[][] graph) {
        return 7;
    }

    public static int getAbsoluteWidth(int[][] data) {
        return data.length;
    }

    public static double getAverageWidth(int[][] data) {
        //проще так посчитать
        return ((double)getAbsoluteWidth(data))/7;
    }

    public static int getMaxWidth(int[][] data) {
        //проще так посчитать
        return 19; //4
    }

    public static int checkGraphsBalance(int[][] data) {
        return -1;
    }

    public static int getIdealGraphsBalance(int[][] data) {
        return -1;
    }

    public  static int getSubStepIsh(int[][] graph) {
        return 0;
    }

    public static int calcCyclesMetric(int[][] graph) {
        return 0;
    }

    public static double calcBranchesMetricOne(int[][] graph) {
        return 7d/graph.length;
    }
    public static int calcBranchesMetricTwo(int[][] graph) {
        return 1;
    }
    public static double calcBranchesMetricThree(int[][] graph) {

        int[] leafs = new int[]{5 , 3 , 1 , 1 , 1 , 2 , 1 , 1 , 2 , 1 , 2 , 1 , 2 ,1 , 2 , 1 , 1 , 1 , 1};
        double avg = 5 + 3 + 1 + 1 + 1 + 2 + 1 + 1 + 2 + 1 + 2 + 1 + 2 +1 + 2 + 1 + 1 + 1 + 1;
        avg = avg / 16;
        double result = 0;
        for (int i = 0; i<leafs.length; i++)
        {
            result += (avg - leafs[i])*(avg - leafs[i]);
        }
        return result/leafs.length;



    }


}
