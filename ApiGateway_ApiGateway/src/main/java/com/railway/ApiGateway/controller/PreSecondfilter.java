package com.railway.ApiGateway.controller;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;


@Configuration
public class PreSecondfilter extends ZuulFilter {
    private static Logger log = LoggerFactory.getLogger(PreSecondfilter.class);
    @Override
    public String filterType() {
        return "pre";
    }
    @Override
    public int filterOrder() {
        return 2;
    }
    @Override
    public boolean shouldFilter() {
        return true;
    }
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info("[PreSecondfilter]Request method = {}, url = {}", request.getMethod(), request.getRequestURL().toString());
        return null;
    }
}