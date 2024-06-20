package com.ohgiraffers.section01.xmlconfig;

import java.util.List;
public class PrintResult {

    public void printEmpList(List<EmployeeDTO> empList){
        for(EmployeeDTO emp: empList){
            System.out.println(emp);
        }
    }
    public void printEmployee(EmployeeDTO emp) {
        System.out.println(emp);
    }


    public void printSuccessMessage(String successCode) {

        String successMessage = "";

        switch ((successCode)){
            case "insert" : successMessage = "신규 직원 등록을 성공했습니다."; break;
            case "update" : successMessage = "직원 정보 수정을 성공했습니다."; break;
            case "delete" : successMessage = "직원 정보 삭제를 성공했습니다."; break;
        }
        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode){

        String errorMessage= "";
        switch (errorCode){
            case "selectList" : errorMessage = "직원 조회를 실패했습니다."; break;
            case "selectOne" : errorMessage = "직원 조회를 실패했습니다."; break;
            case "insert" : errorMessage = "직원 정보 등록을 실패했습니다."; break;
            case "update" : errorMessage = "직원 정보 수정을 실패했습니다."; break;
            case "delete" : errorMessage = "직원 정보 삭제를 실패했습니다."; break;
        }
        System.out.println(errorMessage);
    }

}
