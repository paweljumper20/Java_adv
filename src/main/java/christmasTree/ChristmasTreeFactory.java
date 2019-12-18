package christmasTree;


import java.util.ArrayList;
import java.util.List;

// Zarządzanie produkcją choinek
public interface ChristmasTreeFactory {
    // kolekcja zawierająca choinki
    List<String> christmasTrees = new ArrayList<>();
    // produkcja n choinek o rozmiarach z przedziału <5-10>
    void produceNrandomSizechristmasTrees(int n);
    // sprzedaż losowej choinki z list
    void consumeRandomChristmasTree();
    // prezentacja wszystkich choinek
    void getAllChristmasTrees();
}