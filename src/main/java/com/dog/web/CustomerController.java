package com.dog.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;


/**
 * 客户资料管理
 */
@Controller
@RequestMapping("/customer")
public class CustomerController{

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private static Integer count = 0;

    /**
     * 客户名单
     * @param
     * @param
     * @return
     * @throws Exception
     */
    @RequestMapping(value = {"/name"})
    public @ResponseBody
    String getName() throws Exception {
        Thread.sleep(5000);
//        synchronized (count){
            logger.info("处理进来了--"+count++);
            return "cff";
//        }


    }

    /**
     * 客户名单
     * @param
     * @param
     * @return
     * @throws Exception
     */
    @RequestMapping(value = {"/name_hystrix"})
    public @ResponseBody
    String getNameHystrix() throws Exception {
        new DogWorldCommand("HystrixThreadPoolKey").execute();
        return "";

    }

    /**
     * 测试hello
     * @return
     */
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("name", "Dear");
        return "hello";
    }

}
