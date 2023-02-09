package com.ifada.securitydemolearn.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping("hello")
    public String hello() {
        return "hello security";
    }
//
//    @GetMapping("index")
//    public String index() {
//        return "hello index";
//    }
//
//    @GetMapping("update")
//    //@Secured({"ROLE_sale","ROLE_manager"})
//    //@PreAuthorize("hasAnyAuthority('admins')")
//    @PostAuthorize("hasAnyAuthority('admins')")
//    public String update() {
//        System.out.println("update......");
//        return "hello update";
//    }
//
//    @GetMapping("getAll")
//    @PostAuthorize("hasAnyAuthority('admins')")
//    @PostFilter("filterObject.username == 'admin1'")
//    public List<Users> getAllUser(){
//        ArrayList<Users> list = new ArrayList<>();
//        list.add(new Users(11,"admin1","6666"));
//        list.add(new Users(21,"admin2","888"));
//        System.out.println(list);
//        return list;
//    }


}
