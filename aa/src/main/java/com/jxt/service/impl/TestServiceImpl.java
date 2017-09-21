package com.jxt.service.impl;

import com.github.pagehelper.PageHelper;
import com.jxt.domain.PolistUser;
import com.jxt.domain.PolistUserDto;
import com.jxt.domain.PolistUserExample;
import com.jxt.mapper.PolistUserMapper;
import com.jxt.mapper.TestMapper;
import com.jxt.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/14 0014.
 */
@Service
public class TestServiceImpl implements TestService {
//    @Autowired
//    private TestMapper testMapper;
    @Autowired
    private PolistUserMapper polistUserMapper;
    public String test() {
//        System.out.println("dfdsafdsafas");
//        String i = testMapper.testA();
        return null;
    }


    public List<PolistUser> testDto(){
        PageHelper.startPage(1,10);
        Example example = new Example(PolistUser.class);
        example.createCriteria().andLike("region","1301");
        List<PolistUser> polistUserList = polistUserMapper.selectByExample(example);
//        List<Map<String,Object>> polistUserDtoList =  testMapper.testDto("1301");

//        Example example = new Example(PolistUser.class);
//        example.createCriteria().andEqualTo("region","1301");
//        List list = polistUserMapper.selectByExample(example);
//        if (polistUserDtoList.size()==0){
//            return null;
//        }else {
//            throw new RuntimeException("测试一下全局异常捕获能不能捕获到异常");
//        }
        return null;
    }

    public  TestServiceImpl(){
        System.out.println("加载了"+this.getClass());
    }
}
