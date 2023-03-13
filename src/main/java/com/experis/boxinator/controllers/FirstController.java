package com.experis.boxinator.controllers;


import com.fasterxml.jackson.databind.util.JSONPObject;
import io.swagger.v3.core.util.Json;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;

@CrossOrigin( origins= {"http://localhost:4200"})
@RestController
@RequestMapping("api/v1/resources")
public class FirstController {


    @GetMapping(path="public")
    public ResponseEntity getPublic() {
        HashMap<String,String> hm = new HashMap<>();
        hm.put("access", "public");
        return ResponseEntity.ok(hm);
    }

    @GetMapping("authenticated")
    public ResponseEntity getAuthenticated() {
        HashMap<String,String> hm = new HashMap<>();
        hm.put("access", "for authenticated users");
        return ResponseEntity.ok(hm);
    }

    @GetMapping("authorized")
    public ResponseEntity getAuthorized() {
        HashMap<String,String> hm = new HashMap<>();
        hm.put("access", "for authorized users");
        return ResponseEntity.ok(hm);
    }
}
