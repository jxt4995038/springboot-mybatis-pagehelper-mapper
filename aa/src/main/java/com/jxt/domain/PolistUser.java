package com.jxt.domain;

public class PolistUser {
    private Long id;

    private String userName;

    private String password;

    private String sole;

    private String state;

    private String type;

    private String v2;

    private String v3;

    private String region;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSole() {
        return sole;
    }

    public void setSole(String sole) {
        this.sole = sole == null ? null : sole.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getV2() {
        return v2;
    }

    public void setV2(String v2) {
        this.v2 = v2 == null ? null : v2.trim();
    }

    public String getV3() {
        return v3;
    }

    public void setV3(String v3) {
        this.v3 = v3 == null ? null : v3.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }
}