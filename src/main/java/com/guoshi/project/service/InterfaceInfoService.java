package com.guoshi.project.service;

import com.guoshi.project.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author hanzhongtao
* @description 针对表【interface_info(接口信息表)】的数据库操作Service
* @createDate 2024-05-30 20:09:42
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    /**
     * 校验
     *
     * @param interfaceInfo
     * @param add 是否为创建校验
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo,boolean add);

}
