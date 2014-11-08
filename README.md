
Hupple 后台Web框架
================

## 概述

## 依赖的开源框架和项目
 > *  Maven
 > *  Spring
 -  spring-core
 - spring-beans  
 - spring-jdbc  
 > *  Struts
 
## 配置Web.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns="http://java.sun.com/xml/ns/javaee"
	xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"
	version="2.5">
	
</web-app>
```
* 添加Strust2过滤器
```xml
	<filter>
		<filter-name>struts2</filter-name>
		<filter-class>org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter</filter-class>
	</filter>
	<filter-mapping>
		<filter-name>struts2</filter-name>
		<url-pattern>/*</url-pattern>
	</filter-mapping>
```
* 添加Spring监听器
```xml
	<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
```

Hupple_Framework Based on J2EE by TcXiaoyi 
