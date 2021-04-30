package com.example.mypic.controller;

import com.example.mypic.service.UserService;
import com.example.mypic.util.ResponseBo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
@Slf4j
@RequestMapping("/login")
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/login.do")
    public ResponseBo login(HttpServletRequest request){

        ResponseBo responseBo = new ResponseBo();
        responseBo.setResponseCode("0000");
        responseBo.setResponseMsg("操作成功");
        responseBo.setResponseData(userService.getList());
        return responseBo;
    }

}
