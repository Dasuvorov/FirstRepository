import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println(a == b ? flag1 : flag2 );
        for(int i =1; i<=10; i++){
            if(i%2 != 0){continue;
            }
            System.out.println(i);
        }
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = new int[arr1.length + 1];
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.arraycopy(arr1, 0, arr2, 0, arr1.length-1);
        arr2[arr1.length] = 10;
        arr1 = new int[arr2.length];
        System.arraycopy(arr2, 0, arr1, 0, arr2.length);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}
