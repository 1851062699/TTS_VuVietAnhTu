package module2javabasic;

public class mainJavaBasic02 {
    public static void main(String[] args){
        SelectSort SS = new SelectSort();
        BubbleSort BS = new BubbleSort();
        System.out.println("Bài toán về Selection Sort: ");
        SS.SelectionSort();
        System.out.println("Bài toán về Bubble Sort: ");
        BS.Bubble();
    }
}
