package com.live.vivo.RestApp.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class EmployeeDto {
    private int sid;
    private String sname;
    private String add;
    private String email;

   private Long mobileno;
    private Date postpersist;

    public String getEmail() {
        return email;
    }

    public EmployeeDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public Date getPostpersist() {
        return postpersist;
    }

    public EmployeeDto setPostpersist(Date postpersist) {
        this.postpersist = postpersist;
        return this;
    }

    public Long getMobileno() {
        return mobileno;
    }

    public EmployeeDto setMobileno(Long mobileno) {
        this.mobileno = mobileno;
        return this;
    }


    public int getSid() {
        return sid;
    }

    public EmployeeDto setSid(int sid) {
        this.sid = sid;
        return this;
    }

    public String getSname() {
        return sname;
    }

    public EmployeeDto setSname(String sname) {
        this.sname = sname;
        return this;
    }

    public String getAdd() {
        return add;
    }

    public EmployeeDto setAdd(String add) {
        this.add = add;
        return this;
    }



    
}
