import java.util.ArrayList;
import java.util.List;
public class initializerPos {
    public static List<PoS> setupPoSInstances() {
        List<PoS> posList = new ArrayList<>();

        //PoS #0
        PoS pos0 = new PoS();
        salesAmount salesAmount0 = new salesAmount(2,1,0,4,1);
        pos0.addSaleAmount(salesAmount0);
        pos0.addPrepaidCard(new PrepaidCards("Vegetarian", "40825164", "25/12"));
        pos0.addPrepaidCard(new PrepaidCards("Carnivore", "21703195", "03/12"));
        posList.add(pos0);

        //PoS #1
        PoS pos1 = new PoS();
        salesAmount salesAmount1 = new salesAmount(2,1,0,4,1);
        pos1.addSaleAmount(salesAmount1);
        pos1.addPrepaidCard(new PrepaidCards("Vigan", "40825164", "07/12"));
        pos1.addPrepaidCard(new PrepaidCards("Vegetarian", "21596387", "24/08"));
        posList.add(pos1);

        //PoS #2
        PoS pos2 = new PoS();
        salesAmount salesAmount2 = new salesAmount(0,1,5,2,0);
        pos2.addSaleAmount(salesAmount2);
        pos2.addPrepaidCard(new PrepaidCards("Pescatarian", "95432806", "01/06"));
        pos2.addPrepaidCard(new PrepaidCards("Halal", "95432806", "18/12"));
        pos2.addPrepaidCard(new PrepaidCards("Kosher", "40735421", "05/04"));
        posList.add(pos2);

        //PoS #3
        PoS pos3 = new PoS();
        salesAmount salesAmount3 = new salesAmount(3,2,4,1,2);
        pos3.addSaleAmount(salesAmount3);
        posList.add(pos3);

        //PoS #4
        PoS pos4 = new PoS();
        salesAmount salesAmount4 = new salesAmount(3,2,4,1,2);
        pos4.addSaleAmount(salesAmount4);
        posList.add(pos4);

        return posList;
    }

}
