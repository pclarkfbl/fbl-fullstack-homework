/**
 * HelloController
 * Copyright (c) 2017, FastBridge Learning LLC
 * Created on 11/15/17
 */
package org.fastbridge.takehome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author vivek
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "welcome";
    }
}
