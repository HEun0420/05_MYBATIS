package com.ohgiraffers.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section01.xmlconfig.Template.getSqlSession;


public class MenuService {

    /*
     * Service 란?
     *
     * 비즈니스 로직을 수행하는 클래스라고도 함.
     * 주로 DAO가 DB에서 받아온 데이터를 전달받아 가공해 Controller로 return 해준다.
     *
     * Mybatis 에서 Service의 역할
     * 1. SqlSession 생성 및 닫기
     * 2. DAO(데이터베이스 접근 객체)의 메소드 호출
     * 3. 트랜젝션(commit, rollback) 제어
     * */

    private  final MenuDAO menuDAO;

    // 생성자 주입
    public MenuService() {
        menuDAO = new MenuDAO();
    }

    public List<MenuDTO> selectAllMenu() {
        // 세션 열어주기
        SqlSession sqlSeesion = getSqlSession();

        // menuDAO를 이용해 데이터베이스에서 menulist 사용하기
        List<MenuDTO> menuList = menuDAO.selectAllMenu(sqlSeesion);

        // 세션 닫기
        sqlSeesion.close();

        return menuList;
    }

    public MenuDTO selectMenuByCode(int code) {
    // 세션 열어주기
        SqlSession sqlSession = getSqlSession();
        // 사용
        MenuDTO menu = menuDAO.selectMenuByCode(sqlSession, code);

        // 세션 닫기
        sqlSession.close();

        return menu;
    }

    public boolean registMenu(MenuDTO menu) {
        // 세션 열어주기
        SqlSession sqlSession = getSqlSession();

        int result = menuDAO.insertMenu(sqlSession, menu);

        System.out.println(result);
        // result 결과값에 따라서 insert, update, delte 트레젝션 처리를 해줘야함.

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        // 세션 닫기
        sqlSession.close();

        return result > 0 ? true : false;

    }

    public boolean modifyMenu(MenuDTO menu) {
        // 세션 열어주기
        SqlSession sqlSession = getSqlSession();

        int result = menuDAO.updateMenu(sqlSession, menu);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        // 세션 닫기
        sqlSession.close();

        return result >0 ? true : false;
    }

    public boolean deleteMenu(int code) {

        // 세션 열어주기
        SqlSession sqlSession = getSqlSession();

        int result = menuDAO.deleteMenu(sqlSession,code);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        // 세션 닫기
        sqlSession.close();

        return result >0 ? true : false;
    }
}
