import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Jumping {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

        int count = 0;
        for (int i = 0; i < c.length - 1; i++) {

            if (c[i] == 0) i++;
            System.out.println("number: " + i);
            count++;

        }

        return count;

    }

    void arrayMaipulate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            while (arr[i] / 2 == 0) {
                //skip until we find next odd num
                i++;
            }

        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] c = new int[]{0, 0, 0, 0, 1, 0};


        int result = jumpingOnClouds(c);
        System.out.println(result);


    }
}
