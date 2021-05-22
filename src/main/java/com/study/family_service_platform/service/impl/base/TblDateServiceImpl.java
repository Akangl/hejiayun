package com.study.family_service_platform.service.impl.base;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.family_service_platform.bean.TblDate;
import com.study.family_service_platform.mapper.basic.TblDateMapper;
import com.study.family_service_platform.service.base.TblDateService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 工作日期 服务实现类
 * </p>
 *
 * @author Wenkang.Zhou
 * @since 2021-05-14
 */
@Service
public class TblDateServiceImpl extends ServiceImpl<TblDateMapper, TblDate> implements TblDateService {

}
