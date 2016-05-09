package com.typesafe.controller;

import com.typesafe.model.Context;
import com.typesafe.service.BeansViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by MZO on 09/05/2016.
 */

@Controller
public class MainController {

    @Autowired
    BeansViewService beansViewService;

    @RequestMapping("/")
    public String greeting() throws Exception {
        return "main";
    }

    @RequestMapping("/beansView")
    public ResponseEntity<List<Context>> getBeansView() throws Exception {
        return new ResponseEntity<List<Context>>(beansViewService.getData(), HttpStatus.OK);
    }
}
