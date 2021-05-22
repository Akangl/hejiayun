package com.study.family_service_platform.service.impl.base;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.family_service_platform.bean.TblDbSetting;
import com.study.family_service_platform.mapper.basic.TblDbSettingMapper;
import com.study.family_service_platform.service.base.TblDbSettingService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 数据库设置 服务实现类
 * </p>
 *
 * @author Wenkang.Zhou
 * @since 2021-05-14
 */
@Service
public class TblDbSettingServiceImpl extends ServiceImpl<TblDbSettingMapper, TblDbSetting> implements TblDbSettingService {

}
