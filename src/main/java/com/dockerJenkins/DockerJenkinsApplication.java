package com.dockerJenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsApplication.class, args);
	}

        @RequestMapping(method=RequestMethod.GET, value="/docker")
        public String SeeDocker(){
            return "Here is Docker Sample";
        }
}
