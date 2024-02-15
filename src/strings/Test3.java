package strings;

public class Test3 {
    public static void main(String[] args) {
        String s=new String("Durga");
        String s2=new String ("Durga");
        StringBuffer s3=new StringBuffer("Durga");
        StringBuffer s4=new StringBuffer("Durga");
        System.out.println(s==s2);
        System.out.println(s.equals(s2));
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }
}
// for the '==' operator this will be used to just compare the references.  for both string and stringbuffer class
// so here these a concept ok.that is in objects equal() function can only compare the refernces only as we go to for the String class it can be used to compare the content
// for the Stringbuffer class equal to function again used to compare references only.