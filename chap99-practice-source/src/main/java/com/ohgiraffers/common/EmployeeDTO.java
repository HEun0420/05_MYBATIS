package com.ohgiraffers.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class EmployeeDTO {

    private String id;
    private String name;
    private String no;
    private String email;
    private String phone;
    private String code;
    private String job_code;
    private String sal_level;
    private double salay;
    private double bonus;
    private String manager_id;
    private String hire_date;
    private String ent_date;
    private String ent_yn;


}
