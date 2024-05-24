package com.appsdeveloperblog.app.ws.ui.controller;


import com.appsdeveloperblog.app.ws.ui.model.response.UserRest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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


    @GetMapping(path = "/{userId}" ,
    produces = {
            MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE,
    })
    public ResponseEntity<UserRest> getUser(@PathVariable String userId)
    {
        UserRest returnValue = new UserRest();
        returnValue.setEmail("abc@gm.com");
        returnValue.setFirstName("Sam");
        returnValue.setLastName("Singh");
        returnValue.setUserId("dhw");

        return new ResponseEntity<UserRest>(HttpStatus.BAD_REQUEST);
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
