package jenkins.test.test.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("test")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping()
    public String readString(HttpServletRequest request){
        logger.info("readString 진행중입니다. "+request.getRemoteAddr());
        return "HELLO WORLD!!";
    }

    @GetMapping("/hi")
    public String readhiString(HttpServletRequest request){
        logger.info("read hi 진행중입니다. " + request.getRemoteAddr());

        return "hi";
    }

    @PostMapping("")
    public Map<Object, Object> post(
            @RequestBody Map<Object, Object> json
            ){
        logger.info("post 중입니다. :" + json);
        return json;
    }

}
