package com.study.family_service_platform.service.impl.base;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.family_service_platform.bean.TblSystemLog;
import com.study.family_service_platform.mapper.basic.TblSystemLogMapper;
import com.study.family_service_platform.service.base.TblSystemLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统日志 服务实现类
 * </p>
 *
 * @author Wenkang.Zhou
 * @since 2021-05-14
 */
@Service
public class TblSystemLogServiceImpl extends ServiceImpl<TblSystemLogMapper, TblSystemLog> implements TblSystemLogService {

}
