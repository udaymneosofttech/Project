package com.live.vivo.RestApp;


import com.live.vivo.RestApp.domain.Employee;
import com.live.vivo.RestApp.domain.EmployeeDto;
import com.live.vivo.RestApp.responsedto.ResponseDto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

public class InternalApp

{
    RestTemplateBuilder builder;

    public InternalApp(RestTemplateBuilder builder) {
        this.builder=builder;
    }

    public Object postResponse(String url,Object Requestobject){

        RestTemplate template=builder.build();

        ResponseDto  e=template.postForObject(url,Requestobject,ResponseDto.class);
      Object e1=  e.getData();
        return e1;

    }
}
