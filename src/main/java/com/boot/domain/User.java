package com.boot.domain;

import lombok.Data;

@Data
public class User {

    private Integer id;

    private String name;

    private Integer sex;

    private String department;

    private Integer isDelete;

    private Long create_time;

    private Long update_time;
}
