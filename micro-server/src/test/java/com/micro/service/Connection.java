package com.micro.service;


import com.alibaba.fastjson.JSONObject;
import com.micro.service.biz.QueryBiz;
import com.micro.service.mapper.DrContractInfoMapper;
import com.micro.service.mapper.DrCustInfoMapper;
import com.micro.service.pojo.DrCustInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
@Slf4j
public class Connection {



    @Autowired
    QueryBiz queryBiz;

    @Test
    public void testConnection(){


        long id = 657719;

        DrCustInfo drCustInfo = queryBiz.queryCustInfo(id);

        log.info("返回数据：" + JSONObject.toJSONString(drCustInfo));

    }
}
