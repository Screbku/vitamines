class products extends Entity{
    private long prodid;
    private String name;
    public long getProdid() {
        return prodid;
    }
    public String getName() {
        return name;
    }
    void setProdid(long prodid) {this.prodid = prodid;}
    void setName(String name) {this.name = name;}
}
