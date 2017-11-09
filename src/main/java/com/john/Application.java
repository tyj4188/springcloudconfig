/* 
 * 项目名：	com.john
 * 文件名：	Application
 * 模块说明：	
 * 修改历史：
 * 2017/11/9 - ihui - 创建。
 */

package com.john;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ihui
 * @date 2017/11/9
 */
@SpringBootApplication
@EnableConfigServer // 配置服务
@EnableEurekaClient // 注册
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
