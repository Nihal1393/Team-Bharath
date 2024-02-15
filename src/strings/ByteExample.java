package strings;

public class ByteExample
{
    public static void main(String[] args) {
        byte []b={97,98,99,100};
        String w=new String(b);
        for(int i=0;i<4;i++){
            System.out.println(b[i]);
        }
        System.out.println(b);
        System.out.println(w);

    }


}
