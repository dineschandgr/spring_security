Requirements

1. Download the pom.xml to download all the required dependencies and also the ldap server
2. create 2 sql files with names data.sql and schema.sql and paste the queries in those files
3. Spring Security uses these queries to create tables and populate data in H2 in-memory database

Steps to execute

1. When User accesses the application with the credentials, the spring boot uses filters to intercept the request and calls the AuthenticationManager
2. The AuthenticationManager calls the AuthenticationProvider class for jdbcAuthentication authentication
3. The user credentials is compared against the credentials stored in the H2 database
4. Once credentials are authenticated,configure(HttpSecurity http) method in SecurityConfiguration class is called to authorize the user for the entered url
