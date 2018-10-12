package com.live.vivo.RestApp.controller;

import com.live.vivo.RestApp.domain.Employee;
import com.live.vivo.RestApp.domain.EmployeeDto;
import com.live.vivo.RestApp.responsedto.ResponseDto;
import com.live.vivo.RestApp.service.IEmployeeOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;

@RestController
public class RestConsumerController {


    @Autowired
    private IEmployeeOperations service;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseEntity insertEmployeeDetails(@RequestBody @Valid Employee emp) {

        ResponseDto rs=new ResponseDto();

        EmployeeDto e=service.insertEmployeeDetails(emp);




        return  ResponseEntity.status(200).body(e);
    }

}
