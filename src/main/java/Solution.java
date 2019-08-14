import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static Object[] copy(Object[] arr) {
        Object[] objects_copy = arr.clone();
        return objects_copy;
    }

    public static void print(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr at " + i + " = " + arr[i]);
        }
//        System.out.println("arr = " + arr.toString());
    }

    public static void main(String[] args) {
        List<MyString> strs = new ArrayList<>();
        strs.add(new MyString("value1"));
        strs.add(new MyString("value2"));
        Object[] strs_arr = strs.toArray();

//        List<Object> objects = new ArrayList<>();
//        for (int i = 0; i < strs_arr.length; i++) {
//            objects.add(strs_arr[i]);
//        }
        Object[] arr = copy(strs_arr);
        System.out.println("after copying");
        print(arr);

        strs.set(0, new MyString("value3"));
        System.out.println("after changing value");
        print(arr);
        print(strs_arr);
        for (MyString s : strs) {
            System.out.println(s);
        }
    }
}
