package com.live.vivo.RestApp.service.impl;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.live.vivo.RestApp.InternalApp;
import com.live.vivo.RestApp.domain.Employee;
import com.live.vivo.RestApp.domain.EmployeeDto;
import com.live.vivo.RestApp.responsedto.ResponseDto;
import com.live.vivo.RestApp.service.IEmployeeOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;

@Service
public class EmployeeOperationsImpl implements IEmployeeOperations {

  @Autowired
  private  RestTemplateBuilder template;



    public EmployeeDto insertEmployeeDetails(Employee emp){


         String url="http://localhost:2013/data-api/insert";
        InternalApp app=new InternalApp(template);
        Object obj= app.postResponse(url,emp);
        ObjectMapper mapper=new ObjectMapper();
        EmployeeDto d=mapper.convertValue(obj,EmployeeDto.class);



System.out.println(d);
        return d ;
    }




}
