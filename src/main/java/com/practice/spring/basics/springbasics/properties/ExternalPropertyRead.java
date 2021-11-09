package com.practice.spring.basics.springbasics.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  // defined in xml playing around hence commented
public class ExternalPropertyRead {

    @Value("${external.service.url}")
    private String url;

    public String returnURlReadFromProp(){
        return url;
    }
}
