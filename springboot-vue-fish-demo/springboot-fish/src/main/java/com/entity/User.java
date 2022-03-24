package com.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@TableName("fish4")
@Data//自动生成getter和setter
@NoArgsConstructor//无参构造
@AllArgsConstructor//有参构造
public class User {
    @TableId(type= IdType.AUTO)
    private Integer id;
    private String userName;
    private String passWord;
    private String nickName;
    private int age;
    private String sex;
    private String address;
}
