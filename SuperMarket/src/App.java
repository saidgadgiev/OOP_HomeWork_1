import Classes.ActionClient;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {

        Market market = new Market();
        iActorBehaviour item1 = new OrdinaryClient("Boris");
        iActorBehaviour item2 = new SpecialClient("Fedor", 1101);
        iActorBehaviour item3 = new OrdinaryClient("Dasha");
        /**
         * Добавление акционного клиента
         */
        iActorBehaviour item4 = new ActionClient("Света", "NewYear", 1);
        iActorBehaviour item5 = new ActionClient("Наташа", "NewYear", 2);
        iActorBehaviour item6 = new ActionClient("Анастасия", "NewYear", 3);

//        market.acceptToMarket(item1);
//        market.acceptToMarket(item2);
//        market.acceptToMarket(item3);
        market.actionToMarket(item4);
        market.actionToMarket(item5);
        market.actionToMarket(item6);


        market.update();
    }
}
