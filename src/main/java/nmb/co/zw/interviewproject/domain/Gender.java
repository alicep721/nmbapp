package nmb.co.zw.interviewproject.domain;

public enum Gender {
    MALE("male"), FEMALE("female");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
