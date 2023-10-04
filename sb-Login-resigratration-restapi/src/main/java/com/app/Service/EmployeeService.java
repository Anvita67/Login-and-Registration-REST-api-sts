package com.app.Service;

import com.app.dto.EmployeeDTO;
import com.app.dto.LoginDTO;
import com.app.payload.response.LoginMesage.LoginMesage;
public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);
    LoginMesage loginEmployee(LoginDTO loginDTO);
}