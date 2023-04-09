package spring.service.exercise.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/default")
public class ControllerName {


    @Value("${myCustomVarTree.devName}")
    String devName;



    @GetMapping("/name")
    public String getName(String devName){
        return devName;
    }


}
