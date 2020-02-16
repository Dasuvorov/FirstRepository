import java.lang.reflect.Array;
import java.util.Arrays;

public class TestChar {
    public static void main(String[] args) {

        String greating1 = " 1111111111";
        //char[] chardata = {'h','e','l','l','o', '.'};
        String greating2 = "hello world !";
        //String greating2 = new String(chardata);
        //String greating3 = new String(chardata2);
        System.out.println(greating2.concat(greating1));
       // System.out.println(greating2);
        int a = greating2.codePointAt(0);
        //System.out.println(greating2.codePointAt(0));
        System.out.println(a);
        System.out.println(greating1.contains(greating2));

        byte[] name = greating2.getBytes();
        Character name1 = (char)name[0];
        System.out.println(Arrays.toString(name));
        System.out.println(name1);
        String str1 = "Mom washed the fraMe";
        String str2 = str1.valueOf('M');
        System.out.println(str2);

        String xxs = "<script>alert()</script>";
        System.out.println(xxs.replaceAll("/?script>", ""));
        //System.out.println(xxs);
    }
}
