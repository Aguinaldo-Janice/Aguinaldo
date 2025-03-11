public class BubbleSort {
    public static void main(String[] args) {
       
        int[] dataSet = {12, 7, 19, 3, 15};

                for (int outerIndex = 0; outerIndex < dataSet.length - 1; outerIndex++) {
            for (int innerIndex = 0; innerIndex < dataSet.length - 1 - outerIndex; innerIndex++) {
                if (dataSet[innerIndex] > dataSet[innerIndex + 1]) {
                                     int temp = dataSet[innerIndex];
                    dataSet[innerIndex] = dataSet[innerIndex + 1];
                    dataSet[innerIndex + 1] = temp;
                }
            }
        }

    
        System.out.print("Sorted Array: ");
        for (int value : dataSet) {
            System.out.print(value + " ");
        }
    }
}
