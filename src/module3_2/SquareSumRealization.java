package module3_2;

public class SquareSumRealization implements SquareSum {
    @Override
    public long getSquareSum(int[] values, int numberOfThreads) {
        return 0;
    }

    public void ArrayValues(int[] values,int numberOfThreads){
        int parts = values.length/numberOfThreads;

        int[] first = new int[parts];
        for (int i=0; i<values.length;i++){
            if (i>0&&i<=parts) {
                first[i] = values[i];
            }else if (i>parts&&i<parts+parts){

            }

        }
    }
}
