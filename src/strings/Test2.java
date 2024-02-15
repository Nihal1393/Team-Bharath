package strings;

public class Test2 {
    public static void main(String[] args) {
        String s=new String("Durga");
        s.concat("Software");
        StringBuffer s2=new StringBuffer("Durga");
        s2.append("software");
        System.out.println(s);
        System.out.println(s2);
        String s3=s.concat("Software");
        System.out.println(s3);
    }
}
//in this example as we concat string but there will be no change in the String object because it is final and immutable.so the object from this string cannot be changed.that is as we concat s string a new object will be created  with the changes but the object s will not be changed.
//in the string buffer as we are using the append function it will change the string object and will add the string we wanted to add.
//so the third line got excuted because a string object is created