package com.micro.service.mapper;

import com.micro.service.pojo.DrContractInfo;

public interface DrContractInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DrContractInfo record);

    int insertSelective(DrContractInfo record);

    DrContractInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DrContractInfo record);

    int updateByPrimaryKey(DrContractInfo record);
}