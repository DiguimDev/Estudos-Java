package academy.devdojo.maratonajava.javacore.Oexcessao.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        //checked e unchecked
        Object object = null;
        object.toString();

        int[] nums = {1,2};
        System.out.println(nums[2]);
    }
}
