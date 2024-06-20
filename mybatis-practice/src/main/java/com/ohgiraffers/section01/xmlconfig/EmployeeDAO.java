package com.ohgiraffers.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmployeeDAO {

    public List<EmployeeDTO> selectAllEmployee(SqlSession sqlSession) {

        return sqlSession.selectList("EmployeeMapper.selectAllEmployee");

    }

    public EmployeeDTO selectEmployeeByCode(SqlSession sqlSession, int code) {
        return sqlSession.selectOne("EmployeeMapper.selectEmployeeByCode", code);
    }

    public EmployeeDTO selectEmployeeByName(SqlSession sqlSession, String name) {
        return sqlSession.selectOne("EmployeeMapper.selectEmployeeByName", name);
    }

    public int insertEmployee(SqlSession sqlSession, EmployeeDTO emp) {
        return sqlSession.insert("EmployeeMapper.insertEmployee",emp);
    }
}
