package com.hh.demo;

import com.hh.demo.entity.Disk;
import com.hh.demo.service.DiskService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Resource
	DiskService service;

	@Test
	void test() {
		service.add();
	}
}
