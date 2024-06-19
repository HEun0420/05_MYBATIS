package com.ohgiraffers.section01.xmlconfig;

import java.util.List;

public class PrintResult {



    public void printMenuList(List<menuDTO> menuList){
        for(menuDTO menu: menuList){
            System.out.println(menu);
        }
    }


    public void printErrorMessage(String errorCode){

        String errorMessage= "";
        switch (errorCode){
            case "selectList" : errorMessage = "메뉴 목록 조회를 실패했습니다."; break;
            case "selectOne" : errorMessage = "메뉴 조회를 실패했습니다."; break;
        }
    }


    public void printMenu(menuDTO menu) {
        System.out.println(menu);
    }
}
