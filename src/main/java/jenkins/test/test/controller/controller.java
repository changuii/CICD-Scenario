package jenkins.test.test.controller;


import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
    private static final Logger logger = LoggerFactory.getLogger(controller.class);

    @GetMapping("/")
    public String homePage(HttpServletRequest request){
        logger.info("Request Ip : "+request.getRemoteAddr());
        return "home";
    }
}
