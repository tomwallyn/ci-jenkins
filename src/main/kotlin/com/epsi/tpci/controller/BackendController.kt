package com.epsi.tpci.controller

import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = ["hello"], produces = [MediaType.APPLICATION_JSON_VALUE])
class BackendController {
    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    fun test() : String = "Hello word"
}
