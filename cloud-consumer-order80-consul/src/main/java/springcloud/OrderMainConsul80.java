package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 使用 Consul 作为注册中心
 *
 * @author GuofanLee
 * @date 2020-03-07 20:12
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderMainConsul80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMainConsul80.class, args);
    }

}
