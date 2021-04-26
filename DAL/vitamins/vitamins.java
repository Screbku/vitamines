class vitamins extends Entity{
    private String vitid;
    private String name;
    public String getVitid() { return vitid; }
    public String getName() {
        return name;
    }
    public vitamins(String vitid, String name) {
        this.vitid = vitid;
        this.name = name;
    }
    /*
    void setVitid(long vitid) {this.vitid = vitid;}
    void setName(String name) {this.name = name;}
     */
}
