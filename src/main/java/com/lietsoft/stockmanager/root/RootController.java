package com.lietsoft.stockmanager.root;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RootController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Welcome to StockManager!" + "Access to your product <a href=\"/product\">catalog</a>";
    }

}
