package Entities;

public class Dishes extends Entity{
    private String dishid;
    private String name;
    private String link;

    public Dishes(String dishid, String name, String link) {
        this.dishid = dishid;
        this.name = name;
        this.link = link;
    }
    public String getDishid() {
        return dishid;
    }
    public String getName() {
        return name;
    }
    public String getLink() {
        return link;
    }
    void setDishid(String dishid) {
        this.dishid = dishid;
    }
    void setName(String name) {
        this.name = name;
    }
    void setLink(String link) {
        this.link = link;
    }
    @Override
    public String toString() {
        return "Dishes{" +
                "dishid='" + dishid + '\'' +
                ", name='" + name + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
