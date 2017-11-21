package com.example.vineeth.medizyl12;

/**
 * Created by VINEETH on 21-11-2017.
 */

public class Database {
    int id;
    String fever;
    String headache;
    String stomache;
    String bodypains;
    String cold,diahorrea;

    public Database(int id, String fever, String headache, String stomache, String bodypains, String cold, String diahorrea) {
        this.id = id;
        this.fever = fever;
        this.headache = headache;
        this.stomache = stomache;
        this.bodypains = bodypains;
        this.cold = cold;
        this.diahorrea = diahorrea;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFever() {
        return fever;
    }

    public void setFever(String fever) {
        this.fever = fever;
    }

    public String getHeadache() {
        return headache;
    }

    public void setHeadache(String headache) {
        this.headache = headache;
    }

    public String getStomache() {
        return stomache;
    }

    public void setStomache(String stomache) {
        this.stomache = stomache;
    }

    public String getBodypains() {
        return bodypains;
    }

    public void setBodypains(String bodypains) {
        this.bodypains = bodypains;
    }

    public String getCold() {
        return cold;
    }

    public void setCold(String cold) {
        this.cold = cold;
    }

    public String getDiahorrea() {
        return diahorrea;
    }

    public void setDiahorrea(String diahorrea) {
        this.diahorrea = diahorrea;
    }
}
