# Spring Boot Dubbo Frank #

**嗯，Spring Boot 集成Dubbo的例子!!**
**很久没有使用Dubbo了，配置一个简单的demo，readme后续补充**

## 前言 ##
- 首先要安装ZooKeeper
- 创建一个项目，三个模块
  + 项目：spring-boot-dubbo-frank
  + 模块1【服务提供者】：dubbo-provider
  + 模块2【服务调用者】：dubbo-consumer
  + 模块3【实体类】：dubbo-entity
- 启动流程
  + 1.先启动ZooKeeper
  + 2.启动dubbo-provider 将服务注册到注册中心
  + 3.启动dubbo-consumer 订阅服务
- 访问流程
  + 打开页面访问地址： [http://localhost:8084/hello](http://localhost:8084/hello)
  + 查看消费者控制台，就能看到下面信息：
  ```
    User{nickName='service层的调用者', email='email@qq.com'}
    User{nickName='I am a consumer from controller', email='email@qq.com'}
  ```


## ZooKeeper ##
[【CSDN 】ZooKeeper —— 认识ZooKeeper（编写中）](#)

## Dubbo ##
[【CSDN 】Dubbo —— 认识Dubbo（编写中）](#)

