package com.aqinghz.smartreserve.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 表示用户实体类，对应数据库中的 "user" 表。
 * 该类使用 MyBatis-Plus 注解进行 ORM 映射，并使用 Lombok 简化代码。
 */
@Data
@TableName("user") // 将该实体类映射到数据库中的 "user" 表
public class User {

    /**
     * 用户的唯一标识符。
     * 该字段映射为 "user" 表的主键。
     */
    @TableId
    private Long id;

    /**
     * 用户名。
     */
    private String username;

    /**
     * 用户密码。
     * 注意：请确保对密码的存储和处理采取适当的安全措施。
     */
    private String password;

    /**
     * 用户角色（例如：管理员、普通用户等）。
     */
    private String role;

    /**
     * 用户创建时间。
     */
    private java.sql.Timestamp createTime;
}