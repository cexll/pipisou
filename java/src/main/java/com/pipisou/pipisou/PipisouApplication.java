package com.pipisou.pipisou;


import com.github.pagehelper.PageInfo;
import com.pipisou.pipisou.mapper.LinkInfoMapper;
import com.pipisou.pipisou.model.LinkInfo;
import com.pipisou.pipisou.model.LinkInfoExample;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.ArrayList;

import java.util.List;

@SpringBootApplication
@Slf4j
@MapperScan("com.pipisou.pipisou.mapper")
public class PipisouApplication {

    public static void main(String[] args) {
        SpringApplication.run(PipisouApplication.class, args);
    }

//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        generateArtifacts();
//    }

    private void generateArtifacts() throws Exception {
        List<String> warnings = new ArrayList<>();
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(
                this.getClass().getResourceAsStream("/generatorConfig.xml"));
        DefaultShellCallback callback = new DefaultShellCallback(true);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

}


