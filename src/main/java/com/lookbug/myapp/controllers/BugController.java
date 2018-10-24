package com.lookbug.myapp.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class BugController {
    private static final  Logger log = LoggerFactory.getLogger(BugController.class);

    @GetMapping("/looks")
    public String looks() {
        log.debug("REST request to get look bug : {}");
        return "Bug";
        //return new Object(){ String request = bug; int num = 10; };
    }

    @PostMapping("/looking")
    public String looking(@RequestParam("name") String name){
        log.debug("REST request to post look bug : {}", name);
        return  "you " + name;
    }



//    @PostMapping("/put")
//    public ResponseEntity<?> put(@RequestParam("name") String name){
//        log.debug("REST request to post look bug : {}", name);
//        return new ResponseEntity<>(new Object(){{String str = "i'm"; String you = name;};}, HttpStatus.OK);
//    }
//
//    @PostMapping("/putbug")
//    public Object putbug(@RequestParam("name") String name){
//        log.debug("REST request to post look bug : {}", name);
//        return new Object(){  String message = "you " + name;};
//    }
}
