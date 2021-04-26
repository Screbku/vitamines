class dishes extends Entity{
    private String dishid;
    private String name;
    private String link;
    public String getDishid() {
        return dishid;
    }
    public String getName() {
        return name;
    }
    public String getLink() {
        return link;
    }
    public dishes (String dishid, String name, String link) {
        this.dishid = dishid;
        this.name = name;
        this.link = link;
    }
    /*
    void setDishid(long dishid) {
        this.dishid = dishid;
    }
    void setName(String name) {
        this.name = name;
    }
    void setLink(String link) {
        this.link = link;
    }
     */
}
