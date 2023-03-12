package kz.dar.academy.backend.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("post-core-api")
public interface OfficeFeign {
    @GetMapping("/post/check")
    String checkPost();
}

