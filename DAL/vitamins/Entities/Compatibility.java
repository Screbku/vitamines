package Entities;

public class Compatibility {
    private String vitid1;
    private String vitid2;
    private boolean type;



    public Compatibility(String vitid1, String vitid2, boolean type) {
        this.vitid1 = vitid1;
        this.vitid2 = vitid2;
        this.type = type;
    }

    public String getVitid1() {
        return vitid1;
    }

    public void setVitid1(String vitid1) {
        this.vitid1 = vitid1;
    }

    public String getVitid2() {
        return vitid2;
    }

    public void setVitid2(String vitid2) {
        this.vitid2 = vitid2;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Compatibility{" +
                "vitid1='" + vitid1 + '\'' +
                ", vitid2='" + vitid2 + '\'' +
                ", type=" + type +
                '}';
    }
}
