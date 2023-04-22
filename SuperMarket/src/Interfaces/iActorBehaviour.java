package Interfaces;

import Classes.Actor;
import Classes.ActionClient;

public interface iActorBehaviour {
    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean pickUpOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
    Actor getActor();
    ActionClient getNameAction();
    ActionClient getIdAction();
}