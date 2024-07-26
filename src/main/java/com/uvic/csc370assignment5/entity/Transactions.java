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
 * @TableName transactions
 */
@TableName(value ="transactions")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Transactions implements Serializable {
    /**
     *
     */
    @TableId(type = IdType.AUTO)
    private Integer transactionId;

    /**
     *
     */
    private Integer rentalId;

    /**
     *
     */
    private BigDecimal amount;

    /**
     *
     */
    private Date transactionDate;

    /**
     *
     */
    private Object paymentMethod;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
