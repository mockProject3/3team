package com.example.reservation.survey;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SurveyMapper {

    @Insert("INSERT INTO SURVEYS" +
            "(Q1,Q2,Q3,Q4,Q5,Q6,Q7)" +
            "VALUES(#{a1},#{a2},#{a3},#{a4},#{a5},#{a6},#{a7})")
    void addSurvey(@Param("a1") String a1, @Param("a2") String a2, @Param("a3") String a3, @Param("a4") String a4, @Param("a5") String a5, @Param("a6") String a6, @Param("a7") String a7);
}
