package com.okpets;

public class Dog {

    // class fields
    // name
    public static final String NO_NAME = "Unknown name";

    // breed
    public static final String NO_BREED = "Unknown breed";

    // sex
    public static final int SEX_NONE = -1;
    public static final int SEX_MALE = 0;
    public static final int SEX_FEMALE = 1;
    public static final int SEX_BOTH = 2;

    // instance fields
    private String name;
    private String breed;
    private int sex; // possible values: SEX_NONE, SEX_MALE, SEX_FEMALE
    private int interestedIn; // possible values: SEX_NONE, SEX_MALE, SEX_FEMALE, SEX_BOTH

    // create an uninitialized Dog instance
    public Dog() {
        breed = "Unknown breed";
        name = "Unknown name";
        interestedIn = SEX_NONE;
        sex = SEX_NONE;
    }

    // create a Dog instance with given name, breed, sex, and intereste In values
    public Dog(String name, String breed, int sex, int interestedIn) {
        this.interestedIn = interestedIn;
        this.sex = sex;
        this.breed = breed;
        this.name = name;
    }

    public int getInterestedIn() {
        return interestedIn;
    }

    public void setInterestedIn(int interestedIn) {
        // update interestedIn only if value is MALE, FEMALE, or BOTH
        if ((sex == SEX_MALE) || (sex == SEX_FEMALE) || (sex == SEX_BOTH)) {
            this.interestedIn = interestedIn;
        }
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        // update sex only if sex is MALE or FEMALE
        if ((sex == SEX_MALE) || (sex == SEX_FEMALE)) {
            this.sex = sex;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // update name only if different from NO_NAME
        if (!name.equals(NO_NAME)) {
            this.name = name;
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        // update breed only if different from NO_BREED
        if (!breed.equals(NO_BREED)){
            this.breed = breed;
        }
    }

    public boolean isInterestedIn(Dog dog) {
        if (interestedIn == SEX_NONE) {
            return false;
        }
        if (sex == SEX_NONE) {
            return false;
        }
        if(interestedIn == dog.sex || interestedIn == SEX_BOTH) {
            return true;
        }
        else {
            return false;
        }
    }

    public String toString() {
        String pref = "no preference";
        String ans = "none";
        String gender = "neither";

        if (getInterestedIn() == 0)
            pref = "interested in males";

        else if (getInterestedIn() == 1)
            pref = "interested in females";

        else if (getInterestedIn() == 2)
            pref = "interested in both males and females";

        else if (getInterestedIn() == -1)
            pref = "(unknown interest)";

        if (getSex() == 0)
            gender = "male";

        else if (getSex() == 1)
            gender = "female";

        else if (getSex() == -1)
            gender = "(sex unknown)";

        ans = (name + ", " + breed + ", " + gender + ", " + pref);


        return ans;




}