package tmp.Controller;

import cn.hutool.core.util.RandomUtil;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
public class IndexController {

    @GetMapping("/index")
    public ModelAndView index(){
        System.out.println("kk");
        ModelAndView mav=new ModelAndView("socket");
        mav.addObject("uid", RandomUtil.randomNumbers(6));
        return mav;
    }

}