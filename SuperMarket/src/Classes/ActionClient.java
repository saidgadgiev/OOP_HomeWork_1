package Classes;
/**
 * Класс аукционный клиент
 * @name - имя клиента
 * @nameAction - Название акции
 * @idAction - Номер акции
 */
public class ActionClient extends Actor{
    private String nameAction; 
    private int idAction; 
    public ActionClient(String name, String nameAction, int idAction){
        super(name);
        this.nameAction = nameAction;
        this.idAction = idAction;
    }
    /** Получение имени клиента */
    @Override
    public String getName() {        
        return super.name;
    }
    /** Получение название акции */
    public String nameAction() {
        return nameAction;
    }
    /** Получение номера акции */
    public int idAction(){
        return idAction;
    }
    /** Клиент сделал ли заказ */

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    /** Клиент забрал ли заказ */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    /** сделал заказ */
    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
    }
    /** Забрал заказ */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.isTakeOrder = pickUpOrder;
    }
    /** заявка на возврат товар */
    @Override
    public void setReturnOrder(boolean returnOrder) {
        super.isReturnOrder = returnOrder;

    }
    /** забрать деньги */
    @Override
    public void setTakeMoney(boolean takeMoney) {
        super.isTakeMoney = takeMoney;

    }
    /** Сделал ли заявку */
    @Override
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }
    /** Забрал ли деньги */
    @Override
    public boolean isTakeMoney() {
        return super.isTakeMoney;
    }

    /** получение Клиента */
    @Override
    public Actor getActor() {
        return this;
    }
    /** Предопределение названия акции */
    @Override
    public ActionClient getNameAction() {
        return this;
    }
    /** Предопредеение номера акции */
    @Override
    public ActionClient getIdAction() {
        return this;
    }


}