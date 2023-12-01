import java.util.ArrayList;
import java.util.List;

public class PoS {
    private List<salesAmount> salesAmounts;
    private List<PrepaidCards> prepaidCards;

    public PoS(){
        this.salesAmounts = new ArrayList<>();
        this.prepaidCards = new ArrayList<>();
    }

    public void addSaleAmount(salesAmount amount){
        this.salesAmounts.add(amount);
    }

    public void addPrepaidCard(PrepaidCards card){
        this.prepaidCards.add(card);
    }

}

