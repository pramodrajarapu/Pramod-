package Pramod;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/service")

public class PramodApp {

    @RequestMapping(value = "/getServiceName", method = RequestMethod.GET)
    public @ResponseBody String getServiceName() {
        return "Pramod Application";
    }


}
