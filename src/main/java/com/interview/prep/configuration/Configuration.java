package com.interview.prep.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public InMemoryUserDetailsManager getUserDetailsManager(PasswordEncoder encoder) {
        final var developer = User.withUsername("john").password(encoder.encode("john123")).roles("DEVELOPER").build();
        final var manager = User.withUsername("paul").password(encoder.encode("paul123")).roles("MANAGER", "DEVELOPER").build();
        final var admin = User.withUsername("pradeep").password(encoder.encode("pradeep123")).roles("ADMIN").build();
        return new InMemoryUserDetailsManager(developer, manager, admin);
    }

    /*@Bean
    public PasswordEncoder passwordEncoder() {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        return encoder;
    }*/
}
