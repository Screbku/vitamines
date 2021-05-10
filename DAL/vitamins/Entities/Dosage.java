package Entities;

public class Dosage {
    private String featureid;
    private String vitid;
    private float dosage;

    public Dosage(String featureid, String vitid, float dosage) {
        this.featureid = featureid;
        this.vitid = vitid;
        this.dosage = dosage;
    }

    public String getFeatureid() {
        return featureid;
    }

    public void setFeatureid(String featureid) {
        this.featureid = featureid;
    }

    public String getVitid() {
        return vitid;
    }

    public void setVitid(String vitid) {
        this.vitid = vitid;
    }

    public float getDosage() {
        return dosage;
    }

    public void setDosage(float dosage) {
        this.dosage = dosage;
    }
}
