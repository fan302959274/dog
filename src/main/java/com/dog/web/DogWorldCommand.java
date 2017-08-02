package com.dog.web;/**
 * Created by sh00859 on 2017/8/1.
 */

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * hystrix限流熔断机制
 *
 * @author
 * @create 2017-08-01 15:57
 **/
public class DogWorldCommand extends HystrixCommand<String>{
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private static Integer count = 0;
    public DogWorldCommand(String name) {
        //最少配置:指定命令组名(CommandGroup)
        super(HystrixCommandGroupKey.Factory.asKey(name));
    }
    @Override
    protected String run() throws Exception {
        logger.info("处理进来了--"+count++);
        return "cff";
    }
}