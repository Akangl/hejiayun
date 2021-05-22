package com.study.family_service_platform.service.impl.base;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.family_service_platform.bean.ZhCustomer;
import com.study.family_service_platform.mapper.basic.ZhCustomerMapper;
import com.study.family_service_platform.service.base.ZhCustomerService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 业主信息表 服务实现类
 * </p>
 *
 * @author Wenkang.Zhou
 * @since 2021-05-14
 */
@Service
public class ZhCustomerServiceImpl extends ServiceImpl<ZhCustomerMapper, ZhCustomer> implements ZhCustomerService {

}
