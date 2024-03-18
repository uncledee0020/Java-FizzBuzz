package com.ncba.FizzBuzz;

import com.ncba.FizzBuzz.Service.Buzz;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FizzBuzzApplication {

	public static void main(String[] args) {
		int num = 100;
		Buzz.fizzBuzz(num);
	}

}
