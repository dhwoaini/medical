package com.medical.service;

import com.medical.entity.TimInoculation;
import com.baomidou.mybatisplus.extension.service.IService;

import java.io.Serializable;

/**
 * <p>
 * 预约疫苗 服务类
 * </p>
 *
 * @author JiaJieTang
 * @since 2022-08-11
 */
public interface TimInoculationService extends IService<TimInoculation> {
    TimInoculation getTimInoculationById(Serializable id);

}
