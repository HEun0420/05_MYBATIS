package com.ohgiraffers.section03.remix;

import java.util.List;

public interface EmployeeMapper {

    List<EmployeeDTO> selectAllEmployee();

    EmployeeDTO selectMenuByCode(int code);

    EmployeeDTO selectEmployeeByName(String name);

    int registEmployee(EmployeeDTO emp);
}
