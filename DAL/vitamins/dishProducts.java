class dishProducts extends Entity{
    private String dishid;
    private String prodid;
    private double weight;
    public String getDishid() {
        return dishid;
    }
    public String getProdid() {
        return prodid;
    }
    public double getWeight() { return weight; }
    public dishProducts(String dishid, String prodid, double weight) {
        this.dishid = dishid;
        this.prodid = prodid;
        this.weight = weight;
    }
    /*
    void setDishid(long dishid) {this.dishid = dishid;}
    void setProdid(long prodid) {this.prodid = prodid;}
    void setWeight(double weight) {this.weight = weight;}
     */
}
