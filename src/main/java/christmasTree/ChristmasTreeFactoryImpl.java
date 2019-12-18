package christmasTree;

import java.util.Random;

public class ChristmasTreeFactoryImpl implements ChristmasTreeFactory {

    @Override
    public void produceNrandomSizechristmasTrees(int n) {
        // produkujemy N choinek o rozmiarach losowych z zakresu 5 - 10
        for (int i = 0; i < n; i++) {
            ChristmasTreeImpl ct = new ChristmasTreeImpl();
            String tree = ct.produceChristmasTree(new Random().nextInt(6) + 5);     // metoda zwraca choinke
//            nextInt(6)        -> 0 - 5
//            nextInt(6) + 5    -> 5 - 10
            ChristmasTreeFactory.christmasTrees.add(tree);
        }
    }
    @Override
    public void consumeRandomChristmasTree() {
        if(ChristmasTreeFactory.christmasTrees.size() > 0) {
            System.out.println("Sprzedano choinkę ");
            int index = new Random().nextInt(ChristmasTreeFactory.christmasTrees.size());
            System.out.println(ChristmasTreeFactory.christmasTrees.remove(index));
        }else {
            System.out.println("Nie ma choinek!");
        }
    }
    @Override
    public void getAllChristmasTrees() {    // wszystkie elementy z listy z interfejsu
        for (String tree : ChristmasTreeFactory.christmasTrees){
            System.out.println("Choinka nr: " + ChristmasTreeFactory.christmasTrees.indexOf(tree));
            System.out.println(tree);
        }
    }
    public static void main(String[] args) {
        ChristmasTreeFactoryImpl ctfi = new ChristmasTreeFactoryImpl();
        ctfi.produceNrandomSizechristmasTrees(5);
        ctfi.getAllChristmasTrees();
        ctfi.consumeRandomChristmasTree();
        ctfi.consumeRandomChristmasTree();
        ctfi.consumeRandomChristmasTree();
        ctfi.consumeRandomChristmasTree();
        ctfi.consumeRandomChristmasTree();
        ctfi.consumeRandomChristmasTree();
    }
}