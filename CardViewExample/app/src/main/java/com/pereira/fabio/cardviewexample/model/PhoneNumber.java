package com.pereira.fabio.cardviewexample.model;

/**
 * Created by fabiopereira on 04/10/16.
 */

public class PhoneNumber {

    ////////////////////////////////////////////////////////////
    // Member variables
    ////////////////////////////////////////////////////////////

    private int countryCode;
    private int provinceCode;
    private int phoneNumber;

    ////////////////////////////////////////////////////////////
    // Constructors
    ////////////////////////////////////////////////////////////

    public PhoneNumber(){
        this.countryCode = 0;
        this.provinceCode = 0;
        this.phoneNumber = 0;
    }

    public PhoneNumber(int countryCode, int provinceCode, int phoneNumber){
        this.countryCode = countryCode;
        this.provinceCode = provinceCode;
        this.phoneNumber = phoneNumber;
    }

    ///////////////////////////////////////////////////////////////////////////
    // Setters
    ///////////////////////////////////////////////////////////////////////////

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    ///////////////////////////////////////////////////////////////////////////
    // Getters
    ///////////////////////////////////////////////////////////////////////////

    public int getCountryCode() {
        return countryCode;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

}

