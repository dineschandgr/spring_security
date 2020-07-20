Requirements

Download the pom.xml to download all the required dependencies and also the ldap server


Steps to execute

1. When User accesses the application with the credentials, the spring boot uses filters to intercept the request and calls the AuthenticationManager
2. The AuthenticationManager calls the AuthenticationProvider class for inMemoryAuthentication authentication
3. The user credentials is compared against the credentials provided in the SecurityConfiguration class
4. Once credentials are authenticated, configure(HttpSecurity http) is called to authorize the user
