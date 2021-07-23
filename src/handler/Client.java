package handler;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        //动态
        int[] array = new int[2];
        //静态
        int[] c = {2, 2, 3};
        System.out.println(4 >>> 1);
//        Arrays.sort(c);
//        System.out.println(Arrays.toString(c));
//        System.out.println(Arrays.binarySearch(c, 2));
//        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.stream(c).max().orElse(1));
        System.out.println(Arrays.hashCode(c));
        Handler ch1 = new ConcreteHandler1();
        Handler ch2 = new ConcreteHandler2();
        Handler ch3 = new ConcreteHandler3();

        ch1.setNextHandler(ch2);
        ch2.setNextHandler(ch3);

        Response res1 = ch1.handlerRequest(new Request(new Level(2)));
        if (res1 != null) {
            System.out.println(res1.getMessage());
        }
        Response res2 = ch1.handlerRequest(new Request(new Level(4)));
        if (res2 != null) {
            System.out.println(res2.getMessage());
        }
    }

    public int binarySearch(int[] a, int low, int high, int key) {

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];
            if (midVal > key) {
                high = mid - 1;
            } else if (midVal < key) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return 0;

    }
}