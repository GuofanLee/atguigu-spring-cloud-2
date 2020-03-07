package springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2020-03-06 15:01
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced       //调用实现负载均衡，默认为轮询机制
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
