package Classes;

public class SpecialClient extends Actor{
    private int idVIP;

    public SpecialClient(String name, int idVIP){
        super(name);
        this.idVIP = idVIP;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public int getIdVIP() {
        return idVIP;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.isTakeOrder = pickUpOrder;
    }

    @Override
    public void setReturnOrder(boolean ReturnOrder) {

    }

    @Override
    public void setTakeMoney(boolean TakeMoney) {

    }

    @Override
    public boolean isReturnOrder() {
        return false;
    }

    @Override
    public boolean isTakeMoney() {
        return false;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public ActionClient getNameAction() {
        return null;
    }

    @Override
    public ActionClient getIdAction() {
        return null;
    }
}