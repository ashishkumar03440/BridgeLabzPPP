package JavaBasics.ArrayFunctions.Level3;

import java.util.*;

class StudentScoreCard {
    public static void main(String[] args){
        int n=5; // number of students
        Random rand = new Random();
        int[][] scores = new int[n][3]; // PCM
        double[][] results = new double[n][3]; // total, avg, percentage

        for(int i=0;i<n;i++){
            scores[i][0] = rand.nextInt(41)+60; // physics
            scores[i][1] = rand.nextInt(41)+60; // chemistry
            scores[i][2] = rand.nextInt(41)+60; // math
            int total = scores[i][0]+scores[i][1]+scores[i][2];
            double avg = total/3.0;
            double perc = (total/300.0)*100;
            results[i][0]=total; results[i][1]=avg; results[i][2]=perc;
        }

        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPerc");
        for(int i=0;i<n;i++){
            System.out.println(scores[i][0]+"\t"+scores[i][1]+"\t"+scores[i][2]+"\t"+
                               (int)results[i][0]+"\t"+results[i][1]+"\t"+results[i][2]);
        }
    }
}
