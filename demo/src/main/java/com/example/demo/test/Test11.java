package com.example.demo.test;

import com.example.demo.componet.AppConfig;
import com.example.demo.service.IndexService;
import com.example.demo.service.MyTestBean;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import javax.jws.soap.SOAPBinding;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test11 {
    public static void main(String[] args) {
        File file = new File("C:\\files\\idea-workspace\\unit2\\demo\\src\\main\\java\\com\\example\\demo\\test\\a.txt");
        File file1 = new File("C:\\files\\idea-workspace\\unit2\\demo\\src\\main\\java\\com\\example\\demo\\test\\b.txt");
        System.out.println(file.exists());
        try {
            FileReader fileInputStream = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileInputStream);
            FileWriter fileWriter = new FileWriter(file1);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            while (true){
                String line = bufferedReader.readLine();
                if(line == null){
                    break;
                }
                System.out.println(line);
                printWriter.println(line);
                printWriter.flush();
            }
            fileInputStream.close();
            bufferedReader.close();
            fileWriter.close();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void testArrayList(){
        List<Integer> list = new ArrayList<Integer>();
        list.toArray();
        list.clear();

    }
}
