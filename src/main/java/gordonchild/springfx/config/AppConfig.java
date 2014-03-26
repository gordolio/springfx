/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gordonchild.springfx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import gordonchild.springfx.Loader;
import gordonchild.springfx.impl.LoaderImpl;

/**
 *
 * @author child
 */
@Configuration
public class AppConfig {

	@Bean(name="loader")
	public Loader loader() {
		return new LoaderImpl();
	}
	
}
