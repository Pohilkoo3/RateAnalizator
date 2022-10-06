package com.pohilko.RateAnalizator.feign.imp;

import com.pohilko.RateAnalizator.feign.RateClient;
import org.springframework.stereotype.Component;

@Component
public class RateAnswer implements RateClient {

    @Override
    public String getRateNow() {
        return null;
    }

    @Override
    public String getRateYesterday(String app) {
        return null;
    }

}
