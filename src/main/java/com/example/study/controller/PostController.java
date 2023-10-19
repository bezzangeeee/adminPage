package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {

    // html<form> , ajax 검색 --> 검색 파라미터가 많다는 뜻

    //@RequestMapping(method = RequestMethod.POST, path="/postMethod")
    @PostMapping(value = "/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam){
        return searchParam;
    }

    @PutMapping
    public void put(){

    }

    @PatchMapping
    public void patch(){

    }
}
