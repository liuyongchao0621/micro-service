package com.micro.service.biz.impl;

import com.alibaba.fastjson.JSONObject;
import com.micro.service.biz.QueryBiz;
import com.micro.service.mapper.DrCustInfoMapper;
import com.micro.service.pojo.DrCustInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class QueryBizImpl implements QueryBiz {

    @Autowired
    DrCustInfoMapper drCustInfoMapper;

    @Override
    public DrCustInfo queryCustInfo(Long id) {

        log.info("输入参数：" + id);

        DrCustInfo drCustInfo = drCustInfoMapper.selectByPrimaryKey(id);

        log.info("输出参数：" + JSONObject.toJSONString(drCustInfo));

        return drCustInfo;
    }
}
