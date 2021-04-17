class productVitamins extends Entity{
    private long prodid;
    private long vitid;
    private double weight;
    public long getProdid() {
        return prodid;
    }
    public long getVitid() {
        return vitid;
    }
    public double getWeight() {
        return weight;
    }
    void setProdid(long prodid) {this.prodid = prodid;}
    void setVitid(long vitid) {this.vitid = vitid;}
    void setWeight(double weight) {this.weight = weight;}
}
