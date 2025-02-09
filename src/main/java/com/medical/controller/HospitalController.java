package com.medical.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.medical.config.Result;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.medical.entity.Hospital;
import com.medical.entity.Vaccine;
import com.medical.mapper.HospitalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 医院 前端控制器
 * </p>
 *
 * @author GongHaiBo
 * @since 2022-08-11
 */
@RestController
@RequestMapping("/medical/hospital")
public class HospitalController {
    @Autowired
    HospitalMapper hospitalMapper;


    @GetMapping("/getHospitalCount")
    public Object getHospitalCount(){
        QueryWrapper queryWrapper = new QueryWrapper();
        Integer count = Math.toIntExact(hospitalMapper.selectCount(queryWrapper));
        return Result.success(count);
        
        
    @GetMapping("/allHospital")
    public Object allVaccine(@RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "5") int size) {
        Page<Hospital> hospitalPage = (Page<Hospital>) hospitalMapper.selectPage(new Page<>(start, size), null);
        return hospitalPage;
    }
}
