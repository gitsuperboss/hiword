package cn.service.impl;

import cn.mapper.testMpper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class testServiceImpl {
    @Autowired
    private testMpper testMpper;
    public Integer aa(Integer a){
        int c=testMpper.data();
        return  testMpper.sum((c+a));
    }
}
