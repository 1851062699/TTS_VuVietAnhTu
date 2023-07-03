package module1javabasic;

public class BT1 {
    public void B1() {
        int[] A = {5, 7, 9, 10, 16};
    //Kiểm tra giả thiết mảng A có phải số tăng dần không ?
        boolean isIncreasing = true;
        for (int i = 1; i < A.length; i++) {
            if (A[i] <= A[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        System.out.println("Bài 1:");

        if (isIncreasing) {
            System.out.println("Mảng A có là dãy tăng dần.");
        } else {
            System.out.println("Mảng A không là dãy tăng dần.");
        }
    }
}
