package com.demo.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("USER")
public class User implements Serializable {

    /**
     * User unique ID
     */
    @TableId
    private Long id;

    /**
     * User name
     */
    @TableField
    private String name;

    /**
     * User age
     */
    @TableField
    private Integer age;

}
