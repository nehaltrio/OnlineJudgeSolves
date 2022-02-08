
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Input in = new Input(System.in);
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        Set<Integer> set = new HashSet<>();

        int[] size = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            set.add(arr[i]);
            size[i] = (set.size());
        }

        for (int i = 0; i < m; i++) {
            pw.println(size[in.nextInt() - 1]);
        }
        pw.close();

    }
}

class Input {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public Input(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }

    //InputReader in = new InputReader(new FileReader("File_Name"));
    public Input(FileReader file) {
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



