package com.pohilko.RateAnalizator.services;

import com.pohilko.RateAnalizator.feign.RateClient;
import com.pohilko.RateAnalizator.models.AnswerForRateDollar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Service
public class Request {
    private HandlerRequest handlerRequest;
    private RateClient rateClient;
    private static final String dateYesterday;

    static {
        LocalDateTime localDateTime = LocalDateTime.now().minusDays(1);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        dateYesterday = dateTimeFormatter.format(localDateTime);
    }


    @Autowired
    public Request(HandlerRequest handlerRequest, RateClient rateClient) {
        this.handlerRequest = handlerRequest;
        this.rateClient = rateClient;
    }

    public AnswerForRateDollar getRequest() {
        return handlerRequest.getAnswerForRateDollar(rateClient.getRateNow(), rateClient.getRateYesterday(dateYesterday));
    }

}
