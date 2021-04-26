class productVitamins extends Entity{
    private String prodid;
    private String vitid;
    private double weight;
    public String getProdid() {
        return prodid;
    }
    public String getVitid() {
        return vitid;
    }
    public double getWeight() {
        return weight;
    }
    public productVitamins(String prodid, String vitid, double weight) {
        this.prodid = prodid;
        this.vitid = vitid;
        this.weight = weight;
    }
    /*
    void setProdid(long prodid) {this.prodid = prodid;}
    void setVitid(long vitid) {this.vitid = vitid;}
    void setWeight(double weight) {this.weight = weight;}
     */
}
