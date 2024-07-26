package com.uvic.csc370assignment5.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @TableName customers
 */
@TableName(value ="customers")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customers implements Serializable {
    /**
     *
     */
    @TableId(type = IdType.AUTO)
    private Integer customerId;

    /**
     *
     */
    private String firstName;

    /**
     *
     */
    private String lastName;

    /**
     *
     */
    private String email;

    /**
     *
     */
    private String phoneNumber;

    /**
     *
     */
    private String address;

    /**
     *
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdAt;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
