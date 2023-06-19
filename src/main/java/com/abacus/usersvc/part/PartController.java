package com.abacus.usersvc.part;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"Part"})
@RestController
@RequestMapping("/part")
@RequiredArgsConstructor
public class PartController {

    private final PartService partService;


}
