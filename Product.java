class Product{
    private String Itemname;
    private int unitPrice;

    public Product() {
        this.Itemname="no product";
        this.unitPrice=0;
    }

    void setDetails(String itemname, int unitprice) {
        Itemname = itemname;
        unitPrice = unitprice;
    }

    public int getPrice() {
        return unitPrice;
    }

    public String toString() {
        return Itemname+" " + "@ " + unitPrice+" ";
    }
}

class WeightedProduct extends Product{
    private int weightInKg;

    public WeightedProduct(){

    }

    WeightedProduct(String itemname,int unitprice,int w){
        setDetails(itemname,unitprice);
        this.weightInKg=w;
    }
    public int getPrice() {
        return super.getPrice()*weightInKg;
    }

    public String toString(){
        return super.toString()+weightInKg + " KG "+this.getPrice();
    }

}

class CountedProduct extends Product{
    private int quantity;
    public CountedProduct(String itemname,int unitPrice,int q){
        setDetails(itemname,unitPrice);
        this.quantity=q;
    }
    public int getPrice() {
        return super.getPrice()*quantity;
    }

    public String toString(){
        return super.toString()+quantity+" quantity "+this.getPrice();
    }

}

public class test {
    public static void main(String args[]){
        CountedProduct c = new CountedProduct("a",25,5);
        WeightedProduct w = new WeightedProduct("b",25,5);
        System.out.println(c.toString());
        System.out.println(w.toString());
    }
}

