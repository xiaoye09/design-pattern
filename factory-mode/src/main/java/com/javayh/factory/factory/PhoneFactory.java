package com.javayh.factory.factory;

import com.javayh.factory.service.PhoneService;
import com.javayh.vo.PhoneVO;

/**
 * @author Dylan Yang
 * @Description:  手机适配工厂
 * @ProjectName design-pattern
 * @date 2020-02-03 12:07
 */
public interface PhoneFactory {

    /**
     * @Description 创建手机工厂
     * @UserModule: design-pattern     
     * @author Dylan
     * @date 2020/2/3 0003
     * @param [phoneVO]
     * @return PhoneService
     */
    PhoneService craetePhone(PhoneVO phoneVO);
}
