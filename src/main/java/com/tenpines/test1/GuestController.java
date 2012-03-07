package com.tenpines.test1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GuestController {

    @RequestMapping("/guest")
    public ModelAndView guestbook(HttpServletRequest request) {
        return new ModelAndView("guest");
    }
    
}
