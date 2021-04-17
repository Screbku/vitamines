class dishProducts extends Entity{
    private long dishid;
    private long prodid;
    private double weight;
    public long getDishid() {
        return dishid;
    }
    public long getProdid() {
        return prodid;
    }
    public double getWeight() { return weight; }
    void setDishid(long dishid) {this.dishid = dishid;}
    void setProdid(long prodid) {this.prodid = prodid;}
    void setWeight(double weight) {this.weight = weight;}
}
