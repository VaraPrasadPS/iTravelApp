package com.ibsplc.itravel.controller;

import com.ibsplc.itravel.group.AddGroupService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/group-app")
    public String groupAppVersion() {
        final String version = new AddGroupService().version();
        return String.format("Deploy Group library with version - [%s]", version);
    }

}
