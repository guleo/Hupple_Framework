
Hupple 后台Web框架
================

## 概述

待补充

## 配置Maven依赖  
 * spring  
 ```xml
    <dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-core</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-beans</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-jdbc</artifactId>
	</dependency>
 ```
* struts
 ```xml
    <dependency>
		<groupId>org.apache.struts</groupId>
		<artifactId>struts2-core</artifactId>
	</dependency>
	<dependency>
		<groupId>org.apache.struts</groupId>
		<artifactId>struts2-spring-plugin</artifactId>
	</dependency>
	<dependency>
		<groupId>org.apache.struts</groupId>
		<artifactId>struts2-json-plugin</artifactId>
	</dependency>
	<dependency>
		<groupId>org.apache.struts</groupId>
		<artifactId>struts2-convention-plugin</artifactId>
	</dependency>
 ```
* junit
 ```xml
    <dependency>
    		<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<scope>test</scope>
	</dependency>
 ```
* log4j和slf4j
```xml
    <dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-log4j12</artifactId>
		</dependency>
		<dependency>
			<groupId>log4j</groupId>
			<artifactId>log4j</artifactId>
	</dependency>
```
* Spring annotation
```xml
    <dependency>
    		<groupId> org.aspectj</groupId>
			<artifactId>aspectjweaver</artifactId>
	</dependency>
```
* 数据库驱动和数据源
```xml
    <dependency>
		<groupId>com.oracle</groupId>
		<artifactId>ojdbc14</artifactId>
	</dependency>

	<dependency>
		<groupId>commons-dbcp</groupId>
		<artifactId>commons-dbcp</artifactId>
	</dependency>
 ```
 * jetty嵌入式web容器插件
 ```xml
    <build>
    	<plugins>
			<plugin>
				<groupId>org.mortbay.jetty</groupId>
				<artifactId>maven-jetty-plugin</artifactId>
				<configuration>
					<scanIntervalSeconds>10</scanIntervalSeconds>
					<connectors>
						<connector implementation="org.mortbay.jetty.nio.SelectChannelConnector">
							<port>8099</port>
							<maxIdleTime>60000</maxIdleTime>
						</connector>
					</connectors>
				</configuration>
			</plugin>
		</plugins>
	</build>
 ```

 
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
