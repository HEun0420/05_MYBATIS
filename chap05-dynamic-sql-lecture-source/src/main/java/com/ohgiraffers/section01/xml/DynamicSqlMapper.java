package com.ohgiraffers.section01.xml;

import com.ohgiraffers.common.MenuDTO;
import com.ohgiraffers.common.SearchCriteria;

import java.util.List;
import java.util.Map;

public interface DynamicSqlMapper {
    List<MenuDTO> selectMenuByPrice(Map<String, Integer> map);


    List<MenuDTO> searchMenu(SearchCriteria searchCriteria);


    List<MenuDTO> searchMenuBySubCategory(SearchCriteria searchCriteria);

    List<MenuDTO> searchMenuByRandomMenuCode(List<Integer> randomMenuCodeList);

    List<MenuDTO> searchMenuByCodeOrSearchAll(SearchCriteria searchCriteria);
}
