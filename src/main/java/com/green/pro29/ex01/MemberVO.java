package com.green.pro29.ex01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO {

    private String id;
    private String pwd;
    private String name;
    private String email;



}
