
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputE in = new InputE(System.in);
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = in.nextInt();
        int m = in.nextInt();

        Integer[] a = new Integer[n];


        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        Arrays.sort(a);

        for (int i = 0; i < m; i++) {
           pw.print(binarySearch(a, in.nextInt()) + " ");
        }
        pw.close();
    }

    public static int binarySearch(Integer[] sortedArray, int key) {
        int index = 0,low = 0,high = sortedArray.length - 1,mid = (low + high) / 2;
        while (low <= high) {
            if (sortedArray[mid] <= key) {
                index = mid + 1;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        return index;
    }
}

class InputE {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputE(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }

    //InputReader in = new InputReader(new FileReader("File_Name"));
    public InputE(FileReader file) {
        reader = new BufferedReader(file);
        tokenizer = null;
    }

    public String next() {

        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens())
                tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
            return null;
        }

        return tokenizer.nextToken();
    }

    public String nextLine() {
        String line = null;
        try {
            tokenizer = null;
            line = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return line;
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public boolean hasNext() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens())
                tokenizer = new StringTokenizer(reader.readLine());
        } catch (Exception e) {
            return false;
        }

        return true;

    }
}




