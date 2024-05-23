package com.appsdeveloperblog.app.ws.ui.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users") //http://localhost:8080/users // mapped with this
public class UserController {

    @GetMapping
    public String getUsers(@RequestParam(value = "page" ,defaultValue = "0")  int page ,
                           @RequestParam(value ="limit" , defaultValue = "0") int limit ,
                           @RequestParam(value ="sort" ,  defaultValue = "Hello" ,required = false)  String sort )
    {
        return "get user was called with page = " + page + "and limit =" + limit + "and sort =" + sort;
    }


    @GetMapping(path = "/{userId}" )
    public String getUser(@PathVariable String userId)
    {
        return "get user was called with user Id " + userId;
    }

    @PostMapping
    public String createUser()
    {
        return "create user was called";
    }

    @PutMapping
    public String updateUser(){

        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser()
    {
        return "delete user was called";
    }
}
