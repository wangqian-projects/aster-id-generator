package com.aster.cloud.idgenerator.controller;

import com.baidu.fsg.uid.UidGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 王骞
 * @date 2021-01-31
 */
@RestController
@RequestMapping("/id")
public class IdController {

    @Resource
    private UidGenerator uidGenerator;

    @GetMapping("/next")
    public long next() {
        return uidGenerator.getUID();
    }

    @GetMapping("/parse")
    public String parse(long id) {
        return uidGenerator.parseUID(id);
    }


}
