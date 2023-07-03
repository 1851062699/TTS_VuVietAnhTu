package module1javabasic;

public class BT2 {
    public void B2() {
        int[] A = {5, -1, 9, -10,16};

        boolean isIncreasing = true;
        for (int i = 1; i < A.length; i++) {
            if (A[i] <= A[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        System.out.println("Bài 2:");

        if (isIncreasing) {
            System.out.println("Mảng A có là dãy tăng dần.");
        } else {
            System.out.println("Mảng A không là dãy tăng dần.");
        }
    }
}
