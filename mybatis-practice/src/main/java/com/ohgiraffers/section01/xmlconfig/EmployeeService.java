package com.ohgiraffers.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section01.xmlconfig.Template.getSqlSession;

public class EmployeeService {
    private  final EmployeeDAO employeeDAO;

    // 생성자 주입
    public EmployeeService() {
        employeeDAO = new EmployeeDAO();
    }

    public List<EmployeeDTO> selectAllEmployee() {
        // 세션 열어주기
        SqlSession sqlSession = getSqlSession();

        // DAO를 이용해 데이터베이스에서 list 사용하기
        List<EmployeeDTO> empList = employeeDAO.selectAllEmployee(sqlSession);

        // 세션 닫기
        sqlSession.close();

        return empList;
    }


    public EmployeeDTO selectEmployeeByCode(int code) {
        SqlSession sqlSession = getSqlSession();
        // 사용
        EmployeeDTO emp = employeeDAO.selectEmployeeByCode(sqlSession, code);

        // 세션 닫기
        sqlSession.close();

        return emp;

    }

    public EmployeeDTO selectEmployeeByName(String name) {
        SqlSession sqlSession = getSqlSession();
        EmployeeDTO emp = employeeDAO.selectEmployeeByName(sqlSession, name);
        sqlSession.close();

        return emp;
    }

    public boolean registEmployee(EmployeeDTO emp) {
        SqlSession sqlSession = getSqlSession();
        int result= employeeDAO.insertEmployee(sqlSession,emp);

        if(result>0) {
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result >0 ? true : false;

    }
}
