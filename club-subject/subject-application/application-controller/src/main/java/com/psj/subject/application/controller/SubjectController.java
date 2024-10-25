package com.psj.subject.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 刷题contriller
 * @author pengshj
 * @version 1.0
 * @date 2024/10/25-14:51
 * @description TODO
 */
@RestController
public class SubjectController {

    @GetMapping("/test1")
    public  String test(){
        return  "helloWorld";
    }
}
