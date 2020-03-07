package springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2020-03-06 14:53
 */
@RestController
public class OrderController {

    //通过服务名调用
    public static final String PAYMENT_URL = "http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("consumer/payment/consul")
    public String create() {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/consul", String.class);
    }

}
