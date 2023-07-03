package module1javabasic;

public class BT3 {
    public static void B3() {
        int[] A = {5, 1, 9, 10, 16};
        //Kiểm tra giả thiết mảng A có phải số nguyên tố không ?
        boolean allPrime = true;
        for (int i = 0; i < A.length; i++) {
            if (!isPrime(A[i])) {
                allPrime = false;
                break;
            }
        }

        System.out.println("Bài 3:");

            if (allPrime) {
                System.out.println("Mảng A là số nguyên tố");
            } else {
                System.out.println("Mảng A không là số nguyên tố");
            }

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
