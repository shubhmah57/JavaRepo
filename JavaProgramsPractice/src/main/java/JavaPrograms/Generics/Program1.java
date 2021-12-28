package JavaPrograms.Generics;

public class Program1 {
    public static void main(String[] args) {
        Program1 object = new Program1();
        Integer [] intArray = {4,5,6,7,8,9,10};
        String[] stringArray = {"abc", "dfr", "pop", "xyz", "ayt"};

        object.bubbleSort(intArray);
    }

    private <S> S[] bubbleSort(S[] a) {
        Integer[] arr = (Integer[]) a;
        for(int i = 0; i <a.length; i++){
            for(int j = i+1; j <a.length;j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        a = (S[]) arr;
        return a;
    }
}
