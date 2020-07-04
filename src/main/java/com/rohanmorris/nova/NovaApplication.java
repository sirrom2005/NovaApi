package com.rohanmorris.nova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NovaApplication {

	/*@RequestMapping("/user")
	@CrossOrigin(origins = "*")
	public Principal user(Principal user) {
		return user;
	}

	@RequestMapping("/resource")
	@CrossOrigin(origins = "*")
	public Map<String, Object> home() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("id", UUID.randomUUID().toString());
		model.put("content", "Hello World");

		System.out.println("HERE>>>" + model.get("id"));
		return model;
	}

	@GetMapping(path = "/basicauth")
	@CrossOrigin(origins = "*")
    public AuthenticationBean basicauth() {
        return new AuthenticationBean("You are authenticated");
    }

	@Configuration
	@EnableWebSecurity
	protected static class SecurityConfiguration extends WebSecurityConfigurerAdapter {

		/*@Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			auth
			.inMemoryAuthentication()
			.withUser("user").password(passwordEncoder().encode("password")).roles("USER").and()
			.withUser("admin").password(passwordEncoder().encode("password")).roles("ADMIN");
		}****

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			****http
				.httpBasic().disable()
				.authorizeRequests()
				.antMatchers("/resource").hasRole("USER");*****

				http
					.httpBasic().and()
					.authorizeRequests()
					.antMatchers(HttpMethod.OPTIONS, "/**")
					.permitAll()
					.anyRequest()
					.authenticated();
		}

		/*@Bean
		PasswordEncoder passwordEncoder(){
			return new BCryptPasswordEncoder();
		}
	}*/

	public static void main(String[] args) {
		SpringApplication.run(NovaApplication.class, args);
	}

	/*public class AuthenticationBean {
		private String message;
	
		public AuthenticationBean(String message) {
			this.message = message;
		}
	
		public String getMessage() {
			return message;
		}
	
		public void setMessage(String message) {
			this.message = message;
		}
	
		@Override
		public String toString() {
			return String.format("HelloWorldBean [message=%s]", message);
		}
	}*/
}
