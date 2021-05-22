package com.study.family_service_platform.service.impl.base;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.family_service_platform.bean.TblCommonMessage;
import com.study.family_service_platform.mapper.basic.TblCommonMessageMapper;
import com.study.family_service_platform.service.base.TblCommonMessageService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 常用短信 服务实现类
 * </p>
 *
 * @author Wenkang.Zhou
 * @since 2021-05-14
 */
@Service
public class TblCommonMessageServiceImpl extends ServiceImpl<TblCommonMessageMapper, TblCommonMessage> implements TblCommonMessageService {

}
