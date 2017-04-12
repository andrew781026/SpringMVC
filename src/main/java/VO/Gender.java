package VO;


public enum Gender {
    M("男"), F("女");

    private String gender ;

    Gender(String gender){
        this.gender = gender ;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}