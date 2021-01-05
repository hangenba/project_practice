

# 主要工作

Hadoop搭建集群：IAAS…，在笔记本电恼上搭建这个集群。
 环境：虚拟机：VMware
 Linux: CentOS 7
 Hadoop:2.9.1
 jdk:1.8
 目的：海量数据的存取，基于MapReduce，搭建大数据数仓 。
 岗位：数仓、数据挖掘、大数据可视化。

## 环境配置

安装 jdk 1.8 版本
 win+R => cmd 打开命令窗
 java

## 第一天代码：

[github地址](https://github.com/lvjiuluan/project_practice)

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210104094017878.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzNTM5NjY0,size_16,color_FFFFFF,t_70)
 javc
 ![在这里插入图片描述](https://img-blog.csdnimg.cn/20210104094100239.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzNTM5NjY0,size_16,color_FFFFFF,t_70)
 java -version
 ![在这里插入图片描述](https://img-blog.csdnimg.cn/20210104094142805.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzNTM5NjY0,size_16,color_FFFFFF,t_70)

# 测试java

### 封装思想

放低姿态、认真学习
![1609812009709](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\1609812009709.png)
 包名：com.cqju.test
 第一个: 公司性质 、com、org、gov
 中间：公司名
 最后一个：包名

![1609812123975](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\1609812123975.png)
![1609812273136](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\1609812273136.png)
 快捷键使用
 main函数里面的东西能少就少

java八大数据类型
 ![在这里插入图片描述](https://img-blog.csdnimg.cn/20210104110531286.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzNTM5NjY0,size_16,color_FFFFFF,t_70)
![1609812479164](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\1609812479164.png)
 `小结：命令要规范、封装思想、mian方法当中代码越少越好、工具类、耦合度要低`

### MVC开发模式（降低耦合度）

逻辑问题
 V： view

V–C ： 超文本传输协议

C： controller 、、叫服务处、service

C—M : jdbc、jpa…

M： model 存放数据库 ，数据层或者 持久层

![1609812717134](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\1609812717134.png)

一张表 —对应 java 一个实体类 entity 或model
 一行 对应 一个对象
 ![在这里插入图片描述](https://img-blog.csdnimg.cn/20210104115755429.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzNTM5NjY0,size_16,color_FFFFFF,t_70)
 完成添加用户功能
 边做边修改
 逻辑很重要
 一处设计、多处使用
![1609812864535](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\1609812864535.png)
Alt+Insert 生成代码(如get,set方法,构造函数等)
![1609813182883](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\1609813182883.png)



#  腾讯会议学习截图![在这里插入图片描述](https://img-blog.csdnimg.cn/20210104150342847.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzNTM5NjY0,size_16,color_FFFFFF,t_70)

 长度用户说了算
 什么时候用户说了算
 什么时候程序员说了算

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210104152110260.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzNTM5NjY0,size_16,color_FFFFFF,t_70)
 ![在这里插入图片描述](https://img-blog.csdnimg.cn/20210104154340709.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzNTM5NjY0,size_16,color_FFFFFF,t_70)

打印输出
 ![在这里插入图片描述](https://img-blog.csdnimg.cn/20210104154445445.png)

## 删除修改

是敏感操作，需要再三确认

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210104155350471.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzNTM5NjY0,size_16,color_FFFFFF,t_70)
 把逻辑想好

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210104160153660.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzNTM5NjY0,size_16,color_FFFFFF,t_70)

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210104161127408.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzNTM5NjY0,size_16,color_FFFFFF,t_70)
 ![在这里插入图片描述](https://img-blog.csdnimg.cn/20210104161705435.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzNTM5NjY0,size_16,color_FFFFFF,t_70)
 删除的时候要覆盖

## 层级不能过深：3级是极限，超过3级提炼成方法

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210104163811509.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzNTM5NjY0,size_16,color_FFFFFF,t_70)
 ![在这里插入图片描述](https://img-blog.csdnimg.cn/20210104164608886.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzNTM5NjY0,size_16,color_FFFFFF,t_70)

### 本次目的：分布式文件存储系统

## Hdfs

## Hive

## Hbase