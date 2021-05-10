package Entities;

public class Features {
    private String featureid;
    private int age;
    private boolean gender;

    public Features(String featureid, int age, boolean gender) {
        this.featureid = featureid;
        this.age = age;
        this.gender = gender;
    }

    public String getFeatureid() {
        return featureid;
    }

    public void setFeatureid(String featureid) {
        this.featureid = featureid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
