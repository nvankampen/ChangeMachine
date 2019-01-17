public class ChangeMachine {
    private int changeToDistribute;
    private int quarterNum;
    private int dimeNum;
    private int nickelNum;
    private int pennyNum;

    public ChangeMachine() {
    }

    public void setAmount(int amount){
        this.changeToDistribute = amount;
    }

    public int getCost() {
        return changeToDistribute;
    }

    public int getQuarterNum() {
        return quarterNum;
    }

    public int getDimeNum() {
        return dimeNum;
    }

    public int getNickelNum() {
        return nickelNum;
    }

    public int getPennyNum() {
        return pennyNum;
    }

    public void counterQuarter() {
        quarterNum = changeToDistribute / 25;
        changeToDistribute = changeToDistribute - (quarterNum * 25);
    }

    public void dimeCounter() {
        dimeNum = changeToDistribute / 10;
        changeToDistribute = changeToDistribute - (dimeNum * 10);
    }

    public void nickelCounter() {
        nickelNum = changeToDistribute / 5;
        changeToDistribute = changeToDistribute - (nickelNum * 5);
    }

    public void pennyCounter() {
        pennyNum = changeToDistribute / 1;
        changeToDistribute = changeToDistribute - (pennyNum * 1);
    }

}
