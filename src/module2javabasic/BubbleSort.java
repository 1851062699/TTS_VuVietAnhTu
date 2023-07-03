package module2javabasic;

public class BubbleSort {
    void Bubble(){
        int a[] = {7, 1, 8, 6, 5, 3};
        boolean swapped;

        for(int i = 0; i < 6; i++){
            System.out.print(a[i] + " ");
        }
        for(int i = 0; i < 5; i++){
            swapped = false;
            for(int j = 0; j < 5 - i; j++){
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println("");
        for(int i = 0; i < 6; i++){
            System.out.print(a[i] + " ");
        }
    }
}
