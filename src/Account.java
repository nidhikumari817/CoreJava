public class Account {
    private int acc_no;
    private String name;
    private float amount;

    public void setAcc_no(int acc_no){
        this.acc_no = acc_no;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public int getAcc_no(){
        return acc_no;
    }
    public String getName(){
        return name;
    }
    public float getAmount(){
        return amount;
    }
}
