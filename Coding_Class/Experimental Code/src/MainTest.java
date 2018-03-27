import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 4};


        if (Arrays.equals(nums1,nums2)) {
            System.out.println("worked");
        } else {
            System.out.println("nope");
        }


    }
}
