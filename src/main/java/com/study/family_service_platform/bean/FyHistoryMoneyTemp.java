package com.study.family_service_platform.bean;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 历史费用临时表
 * </p>
 *
 * @author Wenkang.Zhou
 * @since 2021-05-14
 */
@Data
public class FyHistoryMoneyTemp implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 房间id
     */
    private Integer cellId;

    /**
     * 房产名称
     */
    private String cellName;

    /**
     * 建筑面积
     */
    private Double buildArea;

    /**
     * 单价
     */
    private Double priceUnit;

    /**
     * 金额
     */
    private Double money;

    /**
     * 费用起期
     */
    private LocalDateTime moneyStartDate;

    /**
     * 费用止期
     */
    private LocalDateTime moneyStopDate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 操作人编码
     */
    private String operatePerson;

}
