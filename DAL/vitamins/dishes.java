class dishes extends Entity{
    private long dishid;
    private String name;
    private String link;
    public long getDishid() {
        return dishid;
    }
    public String getName() {
        return name;
    }
    public String getLink() {
        return link;
    }
    void setDishid(long dishid) {
        this.dishid = dishid;
    }
    void setName(String name) {
        this.name = name;
    }
    void setLink(String link) {
        this.link = link;
    }
}
