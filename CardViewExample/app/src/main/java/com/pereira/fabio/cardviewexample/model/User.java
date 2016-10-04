package com.pereira.fabio.cardviewexample.model;

import com.pereira.fabio.cardviewexample.utils.Utils;

/**
 * Created by fabiopereira on 04/10/16.
 */

public class User {

    ////////////////////////////////////////////////////////////
    // Member variables
    ////////////////////////////////////////////////////////////

    private String email;
    private String password;
    private String username;
    private long signUpTimestamp;
    private String name;
    private Utils.Gender gender;
    private long birthDate;
    private String bio;
    private String location;

    ////////////////////////////////////////////////////////////
    // Constructors
    ////////////////////////////////////////////////////////////

    public User(){
        this.email = "";
        this.password = "";
        this.username = "";
        this.signUpTimestamp = 0L;
        this.name = "";
        this.gender = Utils.Gender.female;
        this.birthDate = 0L;
        this.bio = "";
        this.location = "";
    }

    public User(String email, String password, String username, long signUpTimestamp,
            String name, Utils.Gender gender, long birthDate, String bio, String location){

        if(email != null && email.length() > 0) {
            this.email = email;
        }
        else {
            this.email = "";
        }

        if(password != null && password.length() > 0) {
            this.password = password;
        }
        else {
            this.password = password;
        }

        if(username != null && username.length() > 0){
            this.username = username;
        }
        else {
            this.username = "";
        }

        this.signUpTimestamp = signUpTimestamp;

        if(name != null && name.length() > 0){
            this.name = name;
        }
        else {
            this.name = "";
        }

        this.gender = gender;

        this.birthDate = birthDate;

        if(bio != null && bio.length() > 0){
            this.bio = bio;
        }
        else {
            this.bio = "";
        }

        if(location != null && location.length() > 0){
            this.location = location;
        }
        else {
            this.location = "";
        }

    }

    ///////////////////////////////////////////////////////////////////////////
    // Setters
    ///////////////////////////////////////////////////////////////////////////

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSignUpTimestamp(long signUpTimestamp) {
        this.signUpTimestamp = signUpTimestamp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Utils.Gender gender) {
        this.gender = gender;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    ///////////////////////////////////////////////////////////////////////////
    // Getters
    ///////////////////////////////////////////////////////////////////////////

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public long getSignUpTimestamp() {
        return signUpTimestamp;
    }

    public String getName() {
        return name;
    }

    public Utils.Gender getGender() {
        return gender;
    }

    public long getBirthDate() {
        return birthDate;
    }

    public String getBio() {
        return bio;
    }

    public String getLocation() {
        return location;
    }


}
