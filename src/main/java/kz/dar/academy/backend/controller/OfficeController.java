package kz.dar.academy.backend.controller;

import kz.dar.academy.backend.feign.OfficeFeign;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Data
@RestController
@RequestMapping("/office")
public class OfficeController {
    @Autowired
    OfficeFeign OfficeFeign;

    @GetMapping("/check")
    public String check() {
        return "post-office-api is working";
    }

    @GetMapping("/office/check")
    public String checkPost() {
        return OfficeFeign.checkPost();
      }
}

