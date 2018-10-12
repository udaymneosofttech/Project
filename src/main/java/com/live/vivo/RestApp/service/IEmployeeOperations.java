package com.live.vivo.RestApp.service;

import com.live.vivo.RestApp.domain.Employee;
import com.live.vivo.RestApp.domain.EmployeeDto;

public interface IEmployeeOperations {

    public EmployeeDto insertEmployeeDetails(Employee emp);
}
