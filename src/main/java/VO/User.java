package VO;

import javax.persistence.*;

/**
 * Created by andrew on 2017/3/24.
 */
public class User {

    @Id
    @Column( name = "USER_ID" )
    private Integer id ;

    @Basic
    @Column( name = "USER_NAME" )
    private String name ;

    @Basic
    @Enumerated(EnumType.STRING)
    @Column( name = "USER_SEX" )
    private Gender gender;

    @Basic
    @Column( name = "USER_PHONE" )
    private String phoneNumber ;

    @Basic
    @Column( name = "USER_ADDRESS" )
    private String  address ;

    public User() {
    }

    public User(Integer id, String name, Gender gender, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public User(Integer id, String name, String gender, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.setGender(gender);
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender.getGender();
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setGender(String gender) {
        if("女".equalsIgnoreCase(gender)) this.gender = Gender.F ;
        if("F".equalsIgnoreCase(gender)) this.gender = Gender.F ;
        if("男".equalsIgnoreCase(gender)) this.gender = Gender.M ;
        if("M".equalsIgnoreCase(gender)) this.gender = Gender.M ;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id != null ? id.equals(user.id) : user.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }

}
