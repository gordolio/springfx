/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gordonchild.springfx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import gordonchild.springfx.config.AppConfig;

/**
 *
 * @author child
 */
public class Application {
    
    public static void main(String[] args) throws Throwable {
        //SpringApplication.run(Application.class, args);
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    }
    
}
