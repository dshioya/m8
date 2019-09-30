package com.example.m8.controller

import com.example.m8.domain.repository.ApiSettingRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api-setting")
class ApiSettingController {

    @Autowired
    lateinit var apiSettingRepository: ApiSettingRepository

    @GetMapping
    fun index(): String {
        return "api setting count = %d".format(apiSettingRepository.count());
    }

}