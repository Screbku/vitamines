public class dosage {
    private String featureid;
    private String vitid;
    private float dosage;

    public String getFeatureid() {
        return featureid;
    }

    public String getVitid() {
        return vitid;
    }

    public float getDosage() {
        return dosage;
    }
    public dosage(String featureid, String vitid, float dosage) {
        this.featureid = featureid;
        this.vitid = vitid;
        this.dosage = dosage;
    }
}
