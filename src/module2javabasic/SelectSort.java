package module2javabasic;

public class SelectSort {
    void SelectionSort(){
        int a[] = {3, 5, 8, 1, 9, 2}, vtmin = 0;
        for(int i = 0; i < 6; i++){
            System.out.print(a[i] + " ");
        }
        for(int i = 0; i < 6; i++){
            for(int j = i + 1; j < 6; j++){
                if(a[j] < a[i]){
                    vtmin = a[i];
                    a[i] = a[j];
                    a[j] = vtmin;
                }
            }
        }
        System.out.println("");
        for(int i = 0; i < 6; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
