package Entities;

public class ProductAllergens {
    private String prodid;
    private String allergenid;

    public ProductAllergens(String prodid, String allergenid) {
        this.prodid = prodid;
        this.allergenid = allergenid;
    }

    public String getProdid() {
        return prodid;
    }

    public void setProdid(String prodid) {
        this.prodid = prodid;
    }

    public String getAllergenid() {
        return allergenid;
    }

    public void setAllergenid(String allergenid) {
        this.allergenid = allergenid;
    }
}