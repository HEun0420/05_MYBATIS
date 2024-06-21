package com.ohgiraffers.section03.remix;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section03.remix.Template.getSqlSession;

public class EmployeeService {

    private EmployeeMapper employeeMapper;

    public List<EmployeeDTO> selectAllEmployee() {

        SqlSession sqlSession = getSqlSession();

        employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        List<EmployeeDTO> empList = employeeMapper.selectAllEmployee();

        sqlSession.close();
        return empList;

    }

    public EmployeeDTO selectMenuByCode(int code) {
        SqlSession sqlSession = getSqlSession();

        employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        EmployeeDTO emp = employeeMapper.selectMenuByCode(code);

        sqlSession.close();

        return emp;
    }

    public EmployeeDTO selectEmployeeByName(String name) {
        SqlSession sqlSession = getSqlSession();

        employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        EmployeeDTO emp = employeeMapper.selectEmployeeByName(name);

        sqlSession.close();

        return emp;
    }

    public boolean registEmployee(EmployeeDTO emp) {
        SqlSession sqlSession = getSqlSession();

        employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        int result = employeeMapper.registEmployee(emp);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }
}
