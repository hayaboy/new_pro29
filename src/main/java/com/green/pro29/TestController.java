package com.green.pro29;

import com.green.pro29.ex01.MemberVO;
import com.green.pro29.ex01.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/test/*")
public class TestController {

    @RequestMapping("/hi")
    String hello(){
        return "hi";
    }

    @RequestMapping("/member1")
MemberVO member1(){

        MemberVO vo =new MemberVO();
        vo.setId("hong");
        vo.setPwd("1111");
        vo.setName("홍일동");
        vo.setEmail("hong1@naver.com");


        return vo;
    }

    @RequestMapping("/student")
    List<Student> student(){

        List<Student> stuList2=        Arrays.asList(new Student("홍일동", 90),
                new Student("홍이동", 80),
                new Student("홍삼동", 70));
        return stuList2;
    }

    @RequestMapping("/avg")
    Double avg(){

        List<Student> stuList2=        Arrays.asList(new Student("홍일동", 80),
                new Student("홍이동", 70),
                new Student("홍삼동", 60));

        double average=stuList2.stream().mapToDouble((obj)->{return obj.getScore();}).average().getAsDouble();

        return average;
    }


    @RequestMapping("/mapTest")
   String mapTest(){

        Map<String, String>  map= new HashMap<>();

        map.put("a", "apple");
        map.put("b", "banana");

        return map.get("a");
    }



    @RequestMapping("/mapTest2")
    Student mapTest2(){

        Map<String, Student>  map= new HashMap<>();
        map.put("a", new Student("하하1", 100));
        map.put("b", new Student("하하2", 200));
        return map.get("b");
    }


    @RequestMapping("/mapTest3")
    List<Student> mapTest3(){

        List<Student> stuList5=        Arrays.asList(new Student("홍일동", 80),
                new Student("홍이동", 70),
                new Student("홍삼동", 60));

        Map<String, List<Student>>  map= new HashMap<>();

        map.put("stu", stuList5);

        //이것은 추가된 주석

        return map.get("stu");

    }


}
