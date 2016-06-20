package module3_2;


/*
Используя Phaser и Executors реализовать класс, который бы считал сумму квадратов элементов массива параллельно в заданном количестве потоков



interface SquareSum {

    long getSquareSum(int[] values, int numberOfThreads);

}



Идея в том, чтобы разбить массив на равные части и найти сумму квадратов в каждом кусочке в отдельном потоке параллельно.

        Используя Phaser, дождаться результатов всех вычислений и сложить их, получив конечный результат.*/


public interface SquareSum {

    long getSquareSum(int[] values, int numberOfThreads);

}
