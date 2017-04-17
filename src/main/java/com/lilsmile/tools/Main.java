package com.lilsmile.tools;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Smile on 03.04.2017.
 */
public class Main {

    public static void main(String[] args) {
        String name = "C:\\Users\\Smile\\Desktop\\Knowledge\\input.txt";
        int [][] matrix = new int[82][82];
        try
        {
            Scanner sc = new Scanner(new File(name));
            for (int i = 0; i < 82; i++)
            {
                for (int j = 0; j < 82; j++)
                {
                    matrix[i][j] = sc.nextInt();
                }
            }

            /*for (int x = 0; x<83; x++) {
                for (int y = 0; y <83; y++) {
                    System.out.print(matrix[x][y]);
                    System.out.print(" ");
                }
                System.out.println();
            }*/

            System.out.println("abs depth = "+MindMapTool.getAbsoluteDepth(matrix));
            System.out.println("avg depth = "+MindMapTool.getAverageDepth(matrix));
            System.out.println("max depth = "+MindMapTool.getMaxDepth(matrix));
            System.out.println("diameter = "+MindMapTool.getGraphsDiameter(matrix));
            System.out.println("graphs height = "+MindMapTool.getGraphsHeight(matrix));
            System.out.println("concept height = "+MindMapTool.getConceptsHeight(matrix));
            System.out.println("abs width = "+MindMapTool.getAbsoluteWidth(matrix));
            System.out.println("avg width = "+MindMapTool.getAverageWidth(matrix));
            System.out.println("max width = "+MindMapTool.getMaxWidth(matrix));
            System.out.println("graph balance = "+MindMapTool.checkGraphsBalance(matrix));
            System.out.println("ideal balance = "+MindMapTool.getIdealGraphsBalance(matrix));
            System.out.println("sub step = "+MindMapTool.getSubStepIsh(matrix));
            System.out.println("cycles metric = "+MindMapTool.calcCyclesMetric(matrix));
            System.out.println("branches metric = "+MindMapTool.calcBranchesMetricOne(matrix));
            System.out.println("branches metric = "+MindMapTool.calcBranchesMetricTwo(matrix));
            System.out.println("branches metric = "+MindMapTool.calcBranchesMetricThree(matrix));


        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
