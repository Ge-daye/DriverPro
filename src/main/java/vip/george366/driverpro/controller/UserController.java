package vip.george366.driverpro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 葛浩东
 */
@RestController
public class UserController {

    @GetMapping("/getUserByName")
    public String show(){
        return "Tom 你好";
    }

}
