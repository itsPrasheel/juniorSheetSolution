import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class nightAtTheMuseum {
    public static void main(String[] args) {
        FastReader s = new FastReader();
        String str = s.nextLine();
        int totalCount = 0;
        int prevCount = 'a';
        for(int i=0;i<str.length();i++)
        {
            int temp = str.charAt(i);
//            System.out.println(temp);
            int diff1 = (temp-prevCount+26)%26;
            int diff2 = (prevCount-temp+26)%26;
            totalCount+= Math.min(diff1,diff2);
            prevCount = temp;
        }
        System.out.println(totalCount);
    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
