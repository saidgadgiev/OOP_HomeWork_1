package Interfaces;
import Classes.Actor;

/**
 * Возврат заказа товара
 */
public interface iReturnOrder {
    /** Заявка на возврат */
    void setReturnOrder(boolean returnOrder);
    /** Забрал деньги */
    void setTakeMoney(boolean takeMoney);
    /** есть ли заявка на возврат */
    boolean isReturnOrder();
    /** Забрал ли деньги */
    boolean isTakeMoney();

    Actor getActor();
}