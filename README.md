# patch-mysql
补丁程序 - jdk1.6 + mysql 版本

## 反向生成工具

1、添加 maven 运行时

![](https://i.imgur.com/mxrm9MA.png)

2、反向生产使用 jdk1.7 运行

![](https://i.imgur.com/naB8Tq0.png)

## 编译

1、maven 打包时使用 jdk1.7

2、命令行：mvn clean install -Dmaven.test.skip=true

3、测试地址：http://localhost:9000/ping