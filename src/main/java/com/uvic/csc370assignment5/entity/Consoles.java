package com.uvic.csc370assignment5.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @TableName consoles
 */
@TableName(value ="consoles")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Consoles implements Serializable {
    /**
     *
     */
    @TableId(type = IdType.AUTO)
    private Integer consoleId;

    /**
     *
     */
    private String model;

    /**
     *
     */
    private String type;

    /**
     *
     */
    private String storageCapacity;

    /**
     *
     */
    private Date purchaseDate;

    /**
     *
     */
    private BigDecimal cost;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
