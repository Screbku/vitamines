package Entities;

public class Allergens {
    private String allergenid;
    private String allergengroup;

    public Allergens(String allergenid, String allergengroup) {
        this.allergenid = allergenid;
        this.allergengroup = allergengroup;
    }

    public String getAllergenid() {
        return allergenid;
    }

    public void setAllergenid(String allergenid) {
        this.allergenid = allergenid;
    }

    public String getAllergengroup() {
        return allergengroup;
    }

    public void setAllergengroup(String allergengroup) {
        this.allergengroup = allergengroup;
    }
}
