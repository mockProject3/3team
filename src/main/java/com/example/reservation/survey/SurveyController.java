package com.example.reservation.survey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @RequestMapping("/survey")
    public String survey(Model model) {
        ArrayList<Survey> surveys = new ArrayList<>() {{
            add(new Survey(1, "저희 홈페이지 접근성에 대해 어떻게 생각하시나요?", 0));
            add(new Survey(2, "저희 홈페이지를 통한 여행상품 정보를 쉽게 얻을 수있었나요?", 0));
            add(new Survey(3, "저희 홈페이지의 디자인에 대해 어떻게 생각하시나요?", 0));
            add(new Survey(4, "저희 홈페이지의 응답속도에 대해 어떻게 생각하시나요?", 0));
            add(new Survey(5, "저희 홈페이지를 통한 항공권 예약은 충분히 간편했나요?", 0));
            add(new Survey(7, "홈페이지를 사용하면서 좋았던 점이 있으신가요?", 1));
            add(new Survey(8, "홈페이지를 사용하면서 아쉬웠던 점이 있으신가요?", 1));
        }};
        model.addAttribute("surveys", surveys);
        return "survey";
    }

    @RequestMapping("commit")
    public String survey(@RequestParam HashMap<String, String> query) {
        String[] answers = new String[query.size()];
        for(Map.Entry<String, String> entry: query.entrySet() ) {
            int index = Integer.parseInt(entry.getKey().replace("ans", ""));
            answers[index-1] = entry.getValue();
        }
        surveyService.addSurvey(answers[0],answers[1], answers[2],answers[3],answers[4],answers[5],answers[6]);
        return "redirect:/";
    }
}
