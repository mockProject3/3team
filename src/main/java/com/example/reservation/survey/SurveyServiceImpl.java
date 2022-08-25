package com.example.reservation.survey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveyServiceImpl implements SurveyService{

    @Autowired
    SurveyMapper surveyMapper;

    @Override
    public void addSurvey(String a1, String a2,String a3,String a4,String a5,String a6, String a7) {
        surveyMapper.addSurvey(a1,a2,a3,a4,a5,a6,a7);

    }
}
