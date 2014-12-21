package org.wic.site.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by izeye on 14. 12. 6..
 */
//@Controller
@RequestMapping("/")
public class HomeController {

  @RequestMapping(method = RequestMethod.GET)
  public String index() {
    return "index";
  }

}
