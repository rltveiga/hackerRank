package com.challanges;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> resultList = new ArrayList<>();

        int pointGirl = 0;
        int pointBoy = 0;


        }


        return resultList;

    }

    public static void main(String[] args) {
        List<Integer> girlPoint = new ArrayList();
        List<Integer> boyPoint = new ArrayList();

        int a, b, c;
        a = 1;
        b = 3;
        c = 4;

        girlPoint.add(a);
        girlPoint.add(b);
        girlPoint.add(c);

        int d, e, f;
        d = 2;
        e = 1;
        f = 4;

        boyPoint.add(d);
        boyPoint.add(e);
        boyPoint.add(f);

        compareTriplets(girlPoint,boyPoint);
        System.out.println(compareTriplets(girlPoint,boyPoint));

    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a_triplet = new int[3];
        int[] b_triplet = new int[3];
        for (int i = 0; i < 3; i++) {
            a_triplet[i] = in.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            b_triplet[i] = in.nextInt();
        }
        int alice_points = 0;
        int bob_points = 0;
        for (int i = 0; i < 3; i++) {
            if (a_triplet[i] > b_triplet[i]) {
                alice_points += 1;
            } else if (a_triplet[i] < b_triplet[i]) {
                bob_points += 1;
            }
        }
        System.out.printf("%d %d", alice_points, bob_points);
    }
}