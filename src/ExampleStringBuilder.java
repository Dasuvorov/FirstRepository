public class ExampleStringBuilder {

    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder();
        String str1 = "Mother washin pattern";
        System.out.println(sb.append(str1));
        String str2 = " My friend painter and poet";
        System.out.println(sb.append(str2));
        System.out.println(sb.indexOf(str2));
        System.out.println(str2.length());
        System.out.println(str1.length());
        System.out.println(sb.toString());
        
    }
}
