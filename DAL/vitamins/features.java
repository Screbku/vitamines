public class features {
    private long featureid;
    public long getFeatureid() {
        return featureid;
    }
    private int age;
    public int getAge() {
        return age;
    }
    private boolean gender;
    public boolean isGender() {
        return gender;
    }
    public features(long featureid, int age, boolean gender) {
        this.featureid = featureid;
        this.age = age;
        this.gender = gender;
    }
}
