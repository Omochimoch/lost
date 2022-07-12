package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.example.demo.chapter03.used.Greet;

/* SpringBoot起動クラス*/

@EnableAspectJAutoProxy
@SpringBootApplication
@ComponentScan("com.example.demo")
public class DependencylnjectionSampleApplication {


	public static void main(String[] args) {
		SpringApplication.run(DependencylnjectionSampleApplication.class, args)
		.getBean(DependencylnjectionSampleApplication.class).execute();
		}
/* 注入箇所（インターフェイス）　*/
@Autowired
Greet greet;

/* 実行メソッド*/
private void execute() {
	greet.greeting();
}

}
