package com.example.consumer8200.utils;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Random;

/**
 * 自定义eureka负载均衡
 */
public class MyRule implements IRule {

    @Autowired
    private ILoadBalancer lb;

    @Override
    public Server choose(Object o) {
        Random r = new Random();
        int randomNum = r.nextInt(10);
        List<Server> servers = lb.getAllServers();
        if(randomNum > 9) {
            Server s = getServerByPort(servers, 8002);
            return s;
        }
        return getServerByPort(servers, 8003);
    }

    private Server getServerByPort(List<Server> servers, int port) {
        for(Server s : servers) {
            if(s.getPort() == port) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void setLoadBalancer(ILoadBalancer iLoadBalancer) {
        this.lb = lb;
    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        return lb;
    }
}
