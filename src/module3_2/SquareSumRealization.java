package module3_2;

public class SquareSumRealization implements SquareSum {
    @Override
    public long getSquareSum(int[] values, int numberOfThreads) {







        return 0;
    }











    public long getSquareSumFirst(int[] value){
        int halfLength = value.length/2;
        int squareSum1 = 0;

        for (int i = 0; i < halfLength; i++) {
            int temp = value[i]*value[i];
            squareSum1 +=temp;
        }
        return squareSum1;
    }

    public long getSquareSumSecond(int[] value){
        int halfLength = value.length/2;
        int squareSum1 = 0;

        for (int i = halfLength; i < value.length; i++) {
            int temp = value[i]*value[i];
            squareSum1 +=temp;
        }
        return squareSum1;
    }
}
