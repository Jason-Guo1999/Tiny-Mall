package com.jason.mall.mbg;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Generator
 */
public class Generator {
    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<String>();

        // overwrite if duplicate
        boolean overwrite = true;

        // get generatorConfig.xml
        InputStream is = Generator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(is);
        is.close();

        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        //create MBG
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        //generate
        myBatisGenerator.generate(null);
        //output warnings
        for (String warning : warnings) {
            System.out.println(warning);
        }
    }
}