package com.live.vivo.RestApp.domain;
public class Employee {
    private int sid;
    private String sname;
    private String add;
    private Long mobileno;
    private String email;

    public String getEmail() {
        return email;
    }

    public Employee setEmail(String email) {
        this.email = email;
        return this;
    }

    public Long getMobileno() {
        return mobileno;
    }

    public Employee setMobileno(Long mobileno) {
        this.mobileno = mobileno;
        return this;
    }

    public int getSid() {
        return sid;
    }

    public Employee setSid(int sid) {
        this.sid = sid;
        return this;
    }

    public String getSname() {
        return sname;
    }

    public Employee setSname(String sname) {
        this.sname = sname;
        return this;
    }

    public String getAdd() {
        return add;
    }

    public Employee setAdd(String add) {
        this.add = add;
        return this;
    }




}
