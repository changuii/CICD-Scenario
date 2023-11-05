package jenkins.test.test.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("test")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping()
    public String readString(){
        logger.info("readString 진행중입니다.");
        return "HELLO WORLD!!";
    }

    @GetMapping("/hi")
    public String readhiString(){
        logger.info("read hi 진행중입니다.");

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
