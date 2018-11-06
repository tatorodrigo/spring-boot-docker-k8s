package br.com.tattobr.springbootdockerk8s.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/hello")
@Log4j2
public class HelloController {
    @GetMapping
    public String sayHello() throws UnknownHostException {
        log.info(
                "m=sayHello Now it is {}. Up time: {} ms.",
                LocalDateTime.now(),
                ManagementFactory.getRuntimeMXBean().getUptime()
        );
        return String.format(
                "Hello from %s. ",
                InetAddress.getLocalHost().getHostName()
        );
    }

    @GetMapping("/date")
    public String sayHelloDate() throws UnknownHostException {
        log.info(
                "m=sayHelloDate Now it is {}. Up time: {} ms.",
                LocalDateTime.now(),
                ManagementFactory.getRuntimeMXBean().getUptime()
        );
        return String.format(
                "Hello from %s. Now it is %s (host local time).",
                InetAddress.getLocalHost().getHostName(),
                LocalDateTime.now()
        );
    }

    @GetMapping("/delay")
    public String sayHelloWithDelay() throws UnknownHostException, InterruptedException {
        log.info(
                "m=sayHelloWithDelay Now it is {}. Up time: {} ms. Waiting...",
                LocalDateTime.now(),
                ManagementFactory.getRuntimeMXBean().getUptime()
        );
        Thread.sleep(5000);
        log.info(
                "m=sayHelloWithDelay Now it is {}. Up time: {} ms. Done.",
                LocalDateTime.now(),
                ManagementFactory.getRuntimeMXBean().getUptime()
        );
        return String.format(
                "Hello from %s. ",
                InetAddress.getLocalHost().getHostName()
        );
    }
}
