package com.ohgiraffers.section01.xmlconfig;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    /* 기능
1. 모든 직원 조회
2. 직원 번호로 조회
3. 직원 이름으로 조회
4. 직원 추가
5. 직원 수정
6. 직원 삭제
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeController employeeController = new EmployeeController();

        do {
            System.out.println("============기능========");
            System.out.println("1. 모든 직원 조회");
            System.out.println("2. 직원 번호로 조회");
            System.out.println("3. 직원 이름으로 조회");
            System.out.println("4. 직원 추가");
            System.out.println("5. 직원 수정");
            System.out.println("6. 직원 삭제");
            System.out.println("기능 번호를 입력해주세요: ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    employeeController.selectAllEmployee();
                    break;
                case 2:
                    employeeController.selectEmployeeByCode(inputEmployeeCode());
                    break;
                case 3:
                    employeeController.selectEmployeeByName(inputEmployeeName());
                    break;
                case 4:
                    employeeController.registEmployee(inputEmployee());
                    break;
                case 5:
//                    employeeController.modifyEmployee(inputModifyEmployee());
                    break;
                case 6:
//                    employeeController.deleteEmployee(inputEmployeeCode());
                    break;
                default:
                    System.out.println(" 잘못된 메뉴를 입력하셨습니다. ");
                    break;
            }

        }  while (true) ;

    }

    private static Map<String, String> inputEmployee() {
        Scanner sc = new Scanner(System.in);

        System.out.println("직원의 id를 입력해주세요.");
        String emp_id = sc.nextLine();
        System.out.println("직원의 이름을 입력해주세요.");
        String emp_name = sc.nextLine();
        System.out.println("직원의 번호를 입력해주세요.");
        String emp_no = sc.nextLine();
        System.out.println("직원의 이메일을 입력해주세요.");
        String email = sc.nextLine();
        System.out.println("직원의 핸드폰 번호를 입력해주세요.");
        String phone = sc.nextLine();
        System.out.println("직원의 부서 코드를 입력해주세요.");
        String dept_code = sc.nextLine();
        System.out.println("직원의 직장 코드를 입력해주세요.");
        String job_code = sc.nextLine();
        System.out.println("직원의 월급 레벨을 입력해주세요.");
        String sal_level = sc.nextLine();
        System.out.println("직원의 월급을 입력해주세요.");
        Double salary = sc.nextDouble();
        System.out.println("직원의 보너스를 입력해주세요.");
        Double bonus = sc.nextDouble();
        sc.nextLine();
        System.out.println("직원의 매니저 ID를 입력해주세요.");
        String managerId = sc.nextLine();
        System.out.println("직원의 고용일을 입력해주세요");
        String hire_date = sc.nextLine();
        System.out.println("직원의 입사일을 입력해주세요");
        String ent_date = sc.nextLine();
        System.out.println("직원의 입사년도를 입력해주세요");
        String ent_yn = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("emp_id",emp_id);
        parameter.put("emp_name",emp_name);
        parameter.put("emp_no",emp_no);
        parameter.put("email",email);
        parameter.put("phone",phone);
        parameter.put("dept_code",dept_code);
        parameter.put("job_code",job_code);
        parameter.put("sal_level",sal_level);
        parameter.put("salary", String.valueOf(salary));
        parameter.put("bonus", String.valueOf(bonus));
        parameter.put("managerId",managerId);
        parameter.put("hire_date", String.valueOf(hire_date));
        parameter.put("ent_date",ent_date);
        parameter.put("ent_yn",ent_yn);

        return parameter;

    }

    private static Map<String, String> inputEmployeeCode() {
        Scanner sc = new Scanner(System.in);

        System.out.println("조회할 직원 번호을 입력하세요.");
        String code = sc.nextLine();
        Map<String, String> parameter = new HashMap<>();
        parameter.put("code",code);
        return parameter;
    }

    private static Map<String, String> inputEmployeeName() {

        Scanner sc = new Scanner(System.in);

        System.out.println("조회할 직원 이름을 입력하세요.");
        String name = sc.nextLine();
        Map<String, String> parameter = new HashMap<>();
        parameter.put("name",name);
        return parameter;
    }


}
