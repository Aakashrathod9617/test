package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.PMBMDaoInt;
import com.rays.dto.PMBMDTO;


@Service
@Transactional
public class PMBMServiceImpl extends BaseServiceImpl<PMBMDTO, PMBMDaoInt> implements PMBMServiceInt{

}
