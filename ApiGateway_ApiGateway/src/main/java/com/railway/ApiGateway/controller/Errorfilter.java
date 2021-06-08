package com.railway.ApiGateway.controller;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Errorfilter extends ZuulFilter {
    private static Logger log = LoggerFactory.getLogger(Errorfilter.class);
    @Override
    public String filterType() {
        return "error";
    }
    @Override
    public int filterOrder() {
        return 1;
    }
    @Override
    public boolean shouldFilter() {
        return true;
    }
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();

        String response = ctx.getResponseBody();
        log.info("Error occurred, Response  = {}, ", response);
        return null;
    }
}

