package strivers.a2z;

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class SearchAutoComplete {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        Integer nextInt() { return Integer.parseInt(next()); }
    }

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String sentences[] = new String[n];
            int times[] = new int[n];
            for (int i = 0; i < n; i++) {
                sentences[i] = sc.nextLine();
                times[i] = sc.nextInt();
            }
            AutoCompleteSystem obj = new AutoCompleteSystem(sentences, times);
            int q = sc.nextInt();
            for (int i = 0; i < q; i++) {
                String query = sc.nextLine();
                StringBuilder qq = new StringBuilder();
                for (int j = 0; j < query.length(); j++) {
                    char x = query.charAt(j);
                    qq.append(String.valueOf(x));
                    ArrayList<String> suggestions = obj.input(x);
                    if (x == '#') continue;
                    out.print("Typed : \"" + qq.toString() + "\" , Suggestions: \n");
                    for (String y : suggestions) out.print(y + "\n");
                }
            }
        }
        out.flush();
    }
}
// } Driver Code Ends


// User function Template for Java

class AutoCompleteSystem {
    public AutoCompleteSystem(String sentences[], int times[]) {}

    ArrayList<String> input(char c) {
        return null;
    }
}
