package com.pohilko.RateAnalizator.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "rate", url = "${path.site.producer.rate.now}")
public interface RateClient {

    @RequestMapping(method = RequestMethod.GET, value = "/latest.json?" + "${app.id}")
    String getRateNow();

    @GetMapping(value = "/historical/{date}.json?${app.id}")
    String getRateYesterday(@PathVariable String date);

}
