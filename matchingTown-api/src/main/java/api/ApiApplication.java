package api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

// BaseScan을 core 모듈 하기
@SpringBootApplication(scanBasePackages = "core")
// EntityScan 으로 Core 모듈 스캔
@EntityScan(basePackages = "core.domain.entity")
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
