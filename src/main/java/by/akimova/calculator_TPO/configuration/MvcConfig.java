package by.akimova.calculator_TPO.configuration;

import com.epam.tat.module4.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configuration class for application.
 *
 * @author anastasiyaakimava
 * @version 1.0
 */

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    /**
     * Method for connecting static resources.
     *
     * @param registry with static resources.
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        if (!registry.hasMappingForPattern("/static/**")) {
            registry.addResourceHandler("/static/**")
                    .addResourceLocations("classpath:/static/");
        }
    }

    /**
     * Creation calculator bean.
     *
     * @return created calculator bean.
     */
    @Bean(name = "calc")
    public Calculator calculator() {
        return new Calculator();
    }
}
