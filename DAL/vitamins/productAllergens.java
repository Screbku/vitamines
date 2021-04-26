public class productAllergens {
    private String prodid;
    private String allergenid;

    public String getProdid() {
        return prodid;
    }

    public String getAllergenid() {
        return allergenid;
    }
    public productAllergens(String prodid, String allergenid) {
        this.prodid = prodid;
        this.allergenid = allergenid;
    }
}
