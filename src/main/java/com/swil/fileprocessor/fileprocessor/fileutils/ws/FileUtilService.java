package com.swil.fileprocessor.fileprocessor.fileutils.ws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;

@RestController
public class FileUtilService {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
