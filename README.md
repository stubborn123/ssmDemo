# ssmDemo
## 自己想按照博客搭建一个关于springMVC的demo

顺便自己也好好用一下github这个，熟悉一下markdown的语法，做点有样子的东西

博客来源：https://my.oschina.net/gaussik/blog/385697
markdown语法介绍：https://www.cnblogs.com/liugang-vip/p/6337580.html
根据：https://my.oschina.net/gaussik/blog/385697  博客进行搭建，主要任务是弄一个能用的，然后想一点点开始加功能，分页 Redis  MQ 卡夫卡 nginx

（1）环境：Tomcat   Maven  JDK

（2）创建WEB工程：IDEA开发，在new project ----》Maven -----》点对号 -----》引入org.apach...........webapp
(创建工程GroupId和ArtifactId还有Version是你项目的唯一标识)

（3）创建resource文件夹

（4）项目搭建pom文件找一个引入进来
（5）File->Project Structure  添加一个module 放代码就点击一下上边的Sources
 (6)在web.xml 上配置拦截器（拦截主要是针对请求交给spring mvc来处理）和过滤器（处理中文请求，防止乱码）

（7）配置controller ：MVC结构 controller来做控制器负责页面的跳转以及业务处理（Controller：通过注解的方式生命controller  ，requestMapping ---》设置请求，这个在自己工作的项目其实是暴露一个请求接口给别人访问，可以直接在浏览器地址栏上写这个东西看数据。）
（8）设置spring的servlert文件配置（这个项目叫spring-servlet-context.xml,自己看的那个是叫mvc-dispatch-servlet,名字不重要，大体配置是一样的）主要是设置controller访问的包位置，静态资源访问，以及注解开启



