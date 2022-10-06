package com.pohilko.RateAnalizator.models;

import com.pohilko.RateAnalizator.services.HandlerRequest;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class AnswerForRateDollar {

    private double rateYYesterday, rateNow;

    private String gif;

    @Value("${path.rasing.gif}")
    private String rasing;

    @Value("${path.decrease.gif}")
    private String decrease;


    public double compare() {
        return HandlerRequest.round(rateNow - rateYYesterday);
    }


}
