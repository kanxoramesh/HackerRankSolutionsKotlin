package hashmap;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class FindMergePoint {

  // Complete the freqQuery function below.
  static List<Integer> freqQuery(List<List<Integer>> queries) {
    HashMap<Integer, Integer> frequencies = new HashMap<>();
    int[] quantities = new int[queries.size() + 1];
    List<Integer> result = new ArrayList<>();
    int frequency, value;

    for (List<Integer> query : queries) {
      value = query.get(1).intValue();
      switch (query.get(0).intValue()) {
        case 1:
          // process fq
          frequency = frequencies.getOrDefault(value, 0);
          frequencies.put(value, frequency + 1);
          // process qt
          quantities[frequency]--;
          quantities[frequency + 1]++;
          break;
        case 2:
          // process fq
          frequency = frequencies.getOrDefault(value, 0);
          if (frequency == 0) break;
          if (frequency == 1) frequencies.remove(value);
          else frequencies.put(value, frequency - 1);
          // process qt
          quantities[frequency]--;
          quantities[frequency - 1]++;
          break;
        case 3:
          if (value >= quantities.length) result.add(0);
          else result.add(quantities[value] > 0 ? 1 : 0);
          break;
      }
    }

    return result;

  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int q = Integer.parseInt(bufferedReader.readLine().trim());

    List<List<Integer>> queries = new ArrayList<>();

    IntStream.range(0, q).forEach(i -> {
      try {
        queries.add(
                Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
        );
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    List<Integer> ans = freqQuery(queries);

    bufferedWriter.write(
            ans.stream()
                    .map(Object::toString)
                    .collect(joining("\n"))
                    + "\n"
    );

    bufferedReader.close();
    bufferedWriter.close();
  }
}
