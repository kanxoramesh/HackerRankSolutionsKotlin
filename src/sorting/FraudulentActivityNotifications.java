package sorting;

import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FraudulentActivityNotifications {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {


        int notificationCount = 0;

        int[] data = new int[201];
        for (int i = 0; i < d; i++) {
            data[expenditure[i]]++;
        }

        for (int i = d; i < expenditure.length; i++) {

            double median = getMedian(d, data);
            System.out.println("median: " + median);

            if (expenditure[i] >= 2 * median) {
                notificationCount++;

            }

            data[expenditure[i]]++;
            data[expenditure[i - d]]--;

        }

        return notificationCount;
    }

    private static double getMedian(int d, int[] data) {
        double median = 0;
        if (d % 2 == 0) {
            Integer m1 = null;
            Integer m2 = null;
            int count = 0;
            for (int ddd : data
            ) {

                System.out.println("data: " + ddd);
            }

            for (int j = 0; j < data.length; j++) {
                System.out.println("count: " + count);
                count += data[j];
                if (m1 == null && count >= d / 2) {
                    m1 = j;
                }
                if (m2 == null && count >= d / 2 + 1) {
                    m2 = j;
                    break;
                }
            }
            median = (m1 + m2) / 2.0;
        } else {
            int count = 0;
            for (int j = 0; j < data.length; j++) {
                System.out.println("count: " + count);
                count += data[j];
                if (count > d / 2) {
                    median = j;
                    break;
                }
            }
        }
        return median;
    }


    public static void main(String[] args) throws IOException {


        int result = FraudulentActivityNotifications.activityNotifications(new int[]{1, 2, 3, 4, 4}, 4);
        System.out.println(result);
    }
}
