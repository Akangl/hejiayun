package com.study.family_service_platform.service.impl.base;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.family_service_platform.bean.FcEstate;
import com.study.family_service_platform.mapper.basic.FcEstateMapper;
import com.study.family_service_platform.service.base.FcEstateService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 楼盘信息 服务实现类
 * </p>
 *
 * @author Wenkang.Zhou
 * @since 2021-05-14
 */
@Service
public class FcEstateServiceImpl extends ServiceImpl<FcEstateMapper, FcEstate> implements FcEstateService {

}
