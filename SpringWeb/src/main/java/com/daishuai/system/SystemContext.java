package com.daishuai.system;

import org.apache.log4j.Logger;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.*;
import java.util.*;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/4/11 15:07
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class SystemContext {

    private Logger logger = Logger.getLogger(SystemContext.class);

    private String[] fileNames;
    private Map<String, String> sqlMap = new HashMap<String, String>();

    public void init(){
        Properties properties = this.getProperties();
        String sqlPath = (String) properties.get("sql");
        this.fileNames = sqlPath.split(",");
        for(String fileName : fileNames){
            File file = new File(this.getClass().getResource("/").getPath() + fileName);
            SAXReader reader = new SAXReader();
            try {
                Document document = reader.read(file);
                Element rootElement = document.getRootElement();
                Iterator iterator = rootElement.elementIterator();
                while (iterator.hasNext()){
                    Element sqlElement = (Element) iterator.next();
                    Attribute attr = sqlElement.attribute("key");
                    String key = attr.getValue();
                    Iterator iter = sqlElement.elementIterator();
                    String sql = sqlElement.element("Sql").getText().trim();
                    String description = sqlElement.element("Description").getText();
                    sqlMap.put(key, sql);
                    logger.info("初始化sql配置【key = " + key + "，sql = " + sql + ",description = " + description + "】");
                }
            } catch (DocumentException e) {
                e.printStackTrace();
            }
        }

        logger.info(Arrays.toString(fileNames));
    }

    public Properties getProperties(){
        Properties properties = new Properties();
        InputStream in = null;
        try {
            File file = new File(this.getClass().getResource("/").getPath()+"datasource.properties");
            in = new FileInputStream(file);
            properties.load(in);
            return properties;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            logger.info("datasource.properties 文件不存在！！");
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            logger.info("文件写入出错！！");
            return null;
        }
    }

    public String getSqlByKey(String key){
        return sqlMap.get(key);
    }
}
