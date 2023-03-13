package org.security.article.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


/**
 * @ClassName StudentController
 * @description:
 * @author: WormFlesh
 * @create: 2023-03-11 16:01
 **/
@RestController
@RequestMapping("/student")
public class StudentController {


    /**
     * 老师权限或学生权限
     */
    @GetMapping("/grade")
    @PreAuthorize("hasAnyAuthority('teacher','student')")
    public Object rs(HttpServletRequest request){
        Map<String,Object> map=new HashMap<>();
        map.put("张三",100);
        return map;
    }


}
