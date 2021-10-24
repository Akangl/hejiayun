package com.study.family_service_platform.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 角色档案
 * </p>
 *
 * @author Wenkang.Zhou
 * @since 2021-05-14
 */
@Data
public class TblRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色类型
     */
    private String roleType;

    /**
     * 操作权限
     */
    private String rolePrivileges;

    /**
     * 角色备注
     */
    private String roleRemark;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;


    @Override
    public String toString() {
        return "TblRole{" +
                "id=" + id +
                ", roleName=" + roleName +
                ", roleType=" + roleType +
                ", rolePrivileges=" + rolePrivileges +
                ", roleRemark=" + roleRemark +
                ", createPerson=" + createPerson +
                ", createDate=" + createDate +
                "}";
    }
}
