package com.zh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
//@MapperScan("com.zh.item.mapper")
public class LyItemService
{
    public static void main( String[] args )
    {
        SpringApplication.run(LyItemService.class, args);
        System.out.println( "Hello World!" );
    }
}
