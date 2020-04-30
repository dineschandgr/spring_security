Requirements

1. Download the pom.xml to download all the required dependencies and also the ldap server
2. Provide the following properties in the application.properties

spring.ldap.embedded.port=8389
spring.ldap.embedded.ldif=classpath:ldap-data.ldif
spring.ldap.embedded.base-dn=dc=springframework,dc=org

3. The ldap server runs on port 8389 
4. Create the file ldap-data.ldif and populate with user ldap data

5. Spring Security uses the methods in SecurityConfiguration class

1. configure(AuthenticationManagerBuilder auth) for authentication
2. configure(HttpSecurity http) for authorization


1. When User accesses the application with the credentials, the spring boot uses filters to intercept the request and calls the AuthenticationManager
2. The AuthenticationManager calls the AuthenticationProvider class for ldap authentication
3. The user credentials is compared against the credentials stored in the ldap-data.ldif file
4. Once credentials are authenticated, user is allowed to login into the authorised url
