package Entities;

public class Vitamins extends Entity{
    private String vitid;
    private String name;

    public Vitamins(String vitid, String name) {
        this.vitid = vitid;
        this.name = name;
    }

    public String getVitid() { return vitid; }
    public String getName() {
        return name;
    }
    void setVitid(String vitid) {this.vitid = vitid;}
    void setName(String name) {this.name = name;}
    
    public String toString() {
        return "Vitamins{" +
                "vitid='" + vitid + "'" +
                ", name='" + name + "'" +
                '}'+"\r\n";
    }
}
