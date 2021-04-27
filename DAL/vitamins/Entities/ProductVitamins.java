package Entities;

public class ProductVitamins extends Entity{
    private String prodid;
    private String vitid;
    private double weight;

    public ProductVitamins(String prodid, String vitid, double weight) {
        this.prodid = prodid;
        this.vitid = vitid;
        this.weight = weight;
    }

    public String getProdid() {
        return prodid;
    }
    public String getVitid() {
        return vitid;
    }
    public double getWeight() {
        return weight;
    }
    void setProdid(String prodid) {this.prodid = prodid;}
    void setVitid(String vitid) {this.vitid = vitid;}
    void setWeight(double weight) {this.weight = weight;}
}
