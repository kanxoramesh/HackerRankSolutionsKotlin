import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SpecialString {

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        int ans = s.length();

        for (int i = 0; i < s.length(); i++) {
            int repeat = 0;
            while (i<s.length()-1 && (s.charAt(i) == s.charAt(i + 1))) {
                repeat++;
                i++;

            }
            ans += (repeat * (repeat + 1)) / 2;

            int counter = 1;
            while( (i - counter) >= 0 && i + counter < s.length() && s.charAt(i - 1) == s.charAt(i + counter) && s.charAt(i - 1) == s.charAt(i - counter))
            {
                counter++;
                ans++;
            }

        }
        return ans;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}