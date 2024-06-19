package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.PMBMDTO;
import com.rays.form.PMBMForm;
import com.rays.service.PMBMServiceInt;


@RestController
@RequestMapping(value = "Pmbm")
public class PMBMCtl extends BaseCtl<PMBMForm, PMBMDTO, PMBMServiceInt>{

}
