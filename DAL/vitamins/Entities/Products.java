package Entities;

public class Products extends Entity{
    private String prodid;
    private String name;
    private String allergenid;

    public Products(String prodid, String name, String allergenid) {
        this.prodid = prodid;
        this.name = name;
        this.allergenid = allergenid;
    }



    public String getAllergenid() {
        return allergenid;
    }

    public void setAllergenid(String allergenid) {
        this.allergenid = allergenid;
    }

    public String getProdid() {
        return prodid;
    }
    public String getName() {
        return name;
    }
    void setProdid(String prodid) {this.prodid = prodid;}
    void setName(String name) {this.name = name;}
    @Override
    public String toString() {
        return "Products{" +
                "prodid='" + prodid + '\'' +
                ", name='" + name + '\'' +
                ", allergenid='" + allergenid + '\'' +
                '}';
    }
}
