package com.ohgiraffers.section02.javaconfig;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    /*
    * 시스템 요구사항
    * 1. 메뉴 전체조회
    * 2. 메뉴 코드로 메뉴 조회
    * 3. 신규 메뉴 추가
    * 4. 메뉴 수정
    * 5. 메뉴 삭제
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuController menuController = new MenuController();

        do {
            System.out.println("============오지라퍼 메뉴 관리 시스템========");
            System.out.println("1. 메뉴 전체 조회하기");
            System.out.println("2. 메뉴 코드로 메뉴 조회");
            System.out.println("3. 신규 메뉴 추가");
            System.out.println("4. 메뉴 수정");
            System.out.println("5. 메뉴 삭제하기");
            System.out.println("메뉴 관리 번호를 입력해주세요: ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    menuController.selectAllMenu();
                    break;
//                case 2:
//                    menuController.selectMenuByCode(inputMenuCode());
//                    break;
//                case 3:
//                    menuController.registMenu(inputMenu());
//                    break;
//                case 4:
//                    menuController.modifyMenu(inputModifyMenu());
//                    break;
//                case 5:
//                    menuController.deleteMenu(inputMenuCode());
//                    break;
                default:
                    System.out.println(" 잘못된 메뉴를 입력하셨습니다. ");
                    break;
            }

        }  while (true) ;

    }

    // 메뉴코드를 입력받는 메서드 => controller 메소드를 불러오게함(보조 수단이자 도와주는 서비스 어플의 도움을 받앙 스트림을 열어옴)
    // 열어진 스트림에서 정보를 받는데...Dao 객체를 이용해서 뽑아옴.
    // 즉, Run을 위한 메소드 정리(Controller) <- 보조 서비스(stream) <- DB에 접근하기 위한 (DAO)ㄱ
    // <<< DB에 로그인하고 연결하는 mybatis<== 가져온 db를 mapper해서 이쁘게 정보를 get set 하게 정렬>>
    private static Map<String, String> inputMenuCode(){

        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴 코드를 입력하세요 : ");
        String code = sc.nextLine();
        Map<String,String> parameter = new HashMap<>();
        parameter.put("code",code);
        return parameter;
    }


    private static Map<String, String> inputMenu (){
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴 이름을 입력하세요.");
        String name = sc.nextLine();
        System.out.println("메뉴 가격을 입력하세요.");
        String price = sc.nextLine();
        System.out.println("카테고리 코드를 입력하세요.");
        String categoryCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("name",name);
        parameter.put("price",price);
        parameter.put("categoryCode",categoryCode);

        return parameter;
    }

    private static Map<String, String> inputModifyMenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("수정할 메뉴 코드을 입력하세요.");
        String code = sc.nextLine();
        System.out.println("수정할 메뉴 이름을 입력하세요.");
        String name = sc.nextLine();
        System.out.println("수정할 메뉴 가격을 입력하세요.");
        String price = sc.nextLine();
        System.out.println("수정할 카테고리 코드를 입력하세요.");
        String categoryCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code",code);
        parameter.put("name",name);
        parameter.put("price",price);
        parameter.put("categoryCode",categoryCode);
        return parameter;
    }

}
