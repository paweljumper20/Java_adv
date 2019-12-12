package classExtends;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutoController {
    // lista przechowująca obiekty klasy nadrzędnej
    List<Auto> autos = new ArrayList<>(Arrays.asList(
            new Auto("BMW","X3","3.0","Diesel",180000),
            new AdditionSets("BMW","X5","3.5","Diesel",380000)
    ));
    // pobierz wszystkie auta z listy aut
    public void getAutos(){
        //ctrl + space -> generate predicate
//        autos.forEach(auto -> System.out.println(auto));
        autos.forEach(System.out::println);
    }


    // dodaj obiekt klasy auto
    public void addAuto(String brand, String model, String engineType,String fuelType,double price_net){
        Auto a = new AdditionSets(brand,model,engineType,fuelType,price_net);
        autos.add(a);
    }
    // dodaj wyposażenie do wybranego auta po indeksie listy
    public void addEquipment(int index,String eqName,double eqPrice){
        Auto auto = autos.get(index);
        AdditionSets as = (AdditionSets)auto;
        as.assignEquipmentToAuto(eqName,eqPrice);
    }
    // daj rabat na wszystkie auta
    public static void main(String[] args) {
        AutoController ac = new AutoController();
        ac.addAuto("VW","Passat","1.9","Diesel",100_000);

       ac.addEquipment(1,"x",2000);
//       ac.addEquipment(0,"y",2000);
        ac.getAutos();
}
}
