package rap.gangsta.restsecurity.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.logout.LogoutFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import javax.servlet.Filter;
import java.util.Collections;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Value("${application.swagger.enabled}")
    private String swaggerEnabled;
    private final Filter corsOptionFilter;

    @Autowired
    public WebSecurityConfiguration(@Qualifier("corsFilter") Filter corsOptionFilter) {
        this.corsOptionFilter = corsOptionFilter;
    }

    @Bean
    protected CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Collections.singletonList("*"));
        configuration.setAllowedHeaders(Collections.singletonList("*"));
        configuration.setAllowCredentials(true);
        configuration.setAllowedMethods(Collections.singletonList("*"));
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/api/**", configuration);
        return source;
    }

    /**
     * TODO: при создании необходима перенастройка ендпоинтов
     * @param authorizeRequests
     * @return
     */
    public ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry authorizeRequests(
            ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry authorizeRequests)
    {
        authorizeRequests
                // status
                .antMatchers(HttpMethod.GET, "/api/v1/status").permitAll()
                .antMatchers(HttpMethod.GET, "/api/v1/SERVICE_NAME/public/**").permitAll()
                // preloaders
                .antMatchers(HttpMethod.OPTIONS, "/**").permitAll();

        if (Boolean.parseBoolean(swaggerEnabled)) {
            authorizeRequests
                    .antMatchers(
                            "/swagger-ui/**",
                            "/swagger-resources/**",
                            "/v2/api-docs",
                            "/csrf",
                            "/webjars/**").permitAll();
        }


        return authorizeRequests;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .formLogin().disable()
                .cors().configurationSource(corsConfigurationSource())
            .and()
                .addFilterAfter(corsOptionFilter, LogoutFilter.class)
                .exceptionHandling()
            .and()
                .sessionManagement()
                    .sessionCreationPolicy(SessionCreationPolicy.STATELESS);


        authorizeRequests(
                http.authorizeRequests()
        )
                .anyRequest()
                .fullyAuthenticated();
    }
}
