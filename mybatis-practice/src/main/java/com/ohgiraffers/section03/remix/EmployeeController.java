package com.ohgiraffers.section03.remix;

import java.util.List;
import java.util.Map;

public class EmployeeController {

    private final PrintResult printResult;
    private final EmployeeService employeeService;

    public EmployeeController() {
        printResult = new PrintResult();
        employeeService = new EmployeeService();
    }


    public void selectAllEmployee() {

        List<EmployeeDTO> empList = employeeService.selectAllEmployee();

        if(empList != null){
            printResult.printEmpList(empList);
        } else {
            printResult.printErrorMessage("selectList");
        }

    }

    public void selectEmployeeByCode(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        EmployeeDTO emp = employeeService.selectMenuByCode(code);

        if(emp != null) {
            printResult.printEmployee(emp);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    public void selectEmployeeByName(Map<String, String> parameter) {

        String name = parameter.get("name");

        EmployeeDTO emp = employeeService.selectEmployeeByName(name);

        if(emp != null) {
            printResult.printEmployee(emp);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    public void registEmployee(Map<String, String> parameter) {

        String empid = parameter.get("emp_id");
        String emp_name = parameter.get("emp_name");
        String emp_no = parameter.get("emp_no");
        String email = parameter.get("email");
        String phone = parameter.get("phone");
        String dept_code = parameter.get("dept_code");
        String job_code = parameter.get("job_code");
        String sal_level = parameter.get("sal_level");
        double salary = Double.parseDouble(parameter.get("salary"));
        double bonus = Double.parseDouble(parameter.get("bonus"));
        String managerId = parameter.get("managerId");
        String hire_date = parameter.get("hire_date");
        String ent_date = parameter.get("ent_date");
        String ent_yn = parameter.get("ent_yn");

        com.ohgiraffers.section03.remix.EmployeeDTO emp = new com.ohgiraffers.section03.remix.EmployeeDTO();
        emp.setEmpID(empid);
        emp.setEmpName(emp_name);
        emp.setEmpNo(emp_no);
        emp.setEmail(email);
        emp.setPhone(phone);
        emp.setDeptCode(dept_code);
        emp.setJobCode(job_code);
        emp.setSalLevel(sal_level);
        emp.setSalary(salary);
        emp.setBonus(bonus);
        emp.setManagerId(managerId);
        emp.setManagerId(hire_date);
        emp.setManagerId(ent_date);
        emp.setManagerId(ent_yn);

        System.out.println(emp);

        boolean result = employeeService.registEmployee(emp);

        if (result) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }

    }

    public void modifyEmployee(Map<String, String> parameter) {

        String emp_id = parameter.get("emp_id");
        String emp_name = parameter.get("emp_name");
        String emp_no = parameter.get("emp_no");
        String email = parameter.get("email");
        String phone = parameter.get("phone");
        String dept_code = parameter.get("dept_code");
        String job_code = parameter.get("job_code");
        String sal_level = parameter.get("sal_level");
        double salary = Double.parseDouble(parameter.get("salary"));
        double bonus = Double.parseDouble(parameter.get("bonus"));
        String managerId = parameter.get("managerId");
        String hire_date = parameter.get("hire_date");
        String ent_date = parameter.get("ent_date");
        String ent_yn = parameter.get("ent_yn");

        com.ohgiraffers.section03.remix.EmployeeDTO emp = new com.ohgiraffers.section03.remix.EmployeeDTO();
        emp.setEmpID(emp_id);
        emp.setEmpName(emp_name);
        emp.setEmpNo(emp_no);
        emp.setEmail(email);
        emp.setPhone(phone);
        emp.setDeptCode(dept_code);
        emp.setJobCode(job_code);
        emp.setSalLevel(sal_level);
        emp.setSalary(salary);
        emp.setBonus(bonus);
        emp.setManagerId(managerId);
        emp.setManagerId(hire_date);
        emp.setManagerId(ent_date);
        emp.setManagerId(ent_yn);

        System.out.println(emp);

        boolean result = employeeService.registEmployee(emp);

        if (result) {
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }

    }
}
