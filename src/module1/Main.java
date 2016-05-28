package module1;

import module1.HashSets;

public class Main {
    public static void main(String[] args) {
        ArrayListRunner arrayListRunner = new ArrayListRunner();
        arrayListRunner.runner();
        LinkedListRunner linkedListRunner = new LinkedListRunner();
        linkedListRunner.runner();
        HashSetRunner hashSetRunner = new HashSetRunner();
        hashSetRunner.runner();
        TreeSetRunner treeSetRunner = new TreeSetRunner();
        treeSetRunner.runner();
    }
}
