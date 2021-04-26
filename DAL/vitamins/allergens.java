public class allergens {
    private String allergenid;
    private String allergengroup;

    public String getAllergenid() {
        return allergenid;
    }

    public String getAllergengroup() {
        return allergengroup;
    }
    public allergens(String allergenid, String allergengroup) {
        this.allergenid = allergenid;
        this.allergengroup = allergengroup;
    }
}
