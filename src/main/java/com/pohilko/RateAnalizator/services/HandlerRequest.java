package com.pohilko.RateAnalizator.services;

import com.pohilko.RateAnalizator.models.AnswerForRateDollar;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
@Getter
@Setter
public class HandlerRequest {

    private AnswerForRateDollar answerFinal;
    @Value("${currency}")
    private String currency;


    @Autowired
    public HandlerRequest(AnswerForRateDollar answerFinal) {
        this.answerFinal = answerFinal;
    }

    public AnswerForRateDollar getAnswerForRateDollar(String answerRateNow, String answerRateYesterday) {
        answerFinal.setRateNow(round(getRateDollar(answerRateNow)));
        answerFinal.setRateYYesterday(round(getRateDollar(answerRateYesterday)));
        return answerFinal;
    }

    public static double round(double rateDollar) {
        return Math.round(rateDollar * 100) / 100.0;
    }

    private double getRateDollar(String allCurrency) {
        String regex = "\"" + currency + "\":\\s\\d+\\.\\d*,";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(allCurrency);
        matcher.find();
        return Double.parseDouble(matcher.group().replaceAll("[\"" + currency + "\":]", "").replaceAll(",", ""));
    }


}
