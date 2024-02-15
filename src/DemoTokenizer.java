
import java.util.*;
    public class DemoTokenizer {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the String:");
            String str = s.nextLine();
            StringTokenizer st = new StringTokenizer(str," ");
            int count = st.countTokens();
            System.out.println("Count of Tokens:"+count);
            System.out.println("====Display Tokens===");
            while(st.hasMoreTokens())
            {
                String tk = st.nextToken();
                System.out.println(tk.toString());
                System.out.println("Count of Tokens:"+st.countTokens());
            }//end of loop
            //s.close();
        }
    }

