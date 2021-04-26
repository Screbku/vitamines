public class compatibility {
    private String vitid1;
    private String vitid2;
    private boolean type;

    public String getVitid1() {
        return vitid1;
    }

    public String getVitid2() {
        return vitid2;
    }

    public boolean isType() {
        return type;
    }
    public compatibility(String vitid1, String vitid2, boolean type) {
        this.vitid1 = vitid1;
        this.vitid2 = vitid2;
        this.type = type;
    }
}
