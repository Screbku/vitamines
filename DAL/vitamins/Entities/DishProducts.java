package Entities;

public class DishProducts extends Entity{
    private String dishid;
    private String prodid;
    private double weight;

    public DishProducts(String dishid, String prodid, double weight) {
        this.dishid = dishid;
        this.prodid = prodid;
        this.weight = weight;
    }

    public String getDishid() {
        return dishid;
    }
    public String getProdid() {
        return prodid;
    }
    public double getWeight() { return weight; }
    void setDishid(String dishid) {this.dishid = dishid;}
    void setProdid(String prodid) {this.prodid = prodid;}
    void setWeight(double weight) {this.weight = weight;}
}
