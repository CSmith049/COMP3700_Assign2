public class Finder {

    public Integer findMax(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        int maxVal = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > maxVal) {
                maxVal = intArray[i];
            }
        }
        return maxVal;
    }

    public Integer findMin(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        int minVal = intArray[0];
        for (int i = 1; i < intArray.length; i++)
            if (intArray[i] < minVal) {
                minVal = intArray[i];
            }
        return minVal;
    }

}
