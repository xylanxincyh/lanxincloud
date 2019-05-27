package com.lanxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author cyh
 * @date 2019/5/23
 */
@EnableDiscoveryClient
@SpringBootApplication
//开启Turbine支持,用来进行集群监控
@EnableTurbine
//开启Hystrix仪表盘
@EnableHystrixDashboard
public class HystrixApp {

    public static void main(String[] args) {
        SpringApplication.run(HystrixApp.class,args);
    }
}
