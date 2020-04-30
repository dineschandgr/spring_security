Requirements

1. Download the pom.xml to download all the required dependencies
2. Create 2 tables in mysql DB named Users and Authorities
3. 2 Entity classes are used for persistence
4. Users and Authorities tables have one to many mapping

Steps

1. User Authentication is handled by MyUserDetailsService which implements UserDetailsService of Spring Security
2. When User accesses the application with the credentials, the spring boot uses filters to intercept the request and calls the AuthenticationManager
3. The AuthenticationManager calls the AuthenticationProvider class which MyUserDetailsService class for the JPA
3. This class has loadUserByUsername method, which gets the username from request and retreievs the user and authorities info from the MYSQL database using JPA
4. MyUserDetails class extends UserDetails of Spring Security. This class is populated by loadUserByUsername method with the data from the Database and returned to Spring Security
5. Spring Security uses this data to authenticate and authorize the user
6. The Authorization for the users is defined in configure(HttpSecurity http) method of SecurityConfiguration class
7. Once the user is authenticated and authorized, the user is allowed to login to the app
