<h1 align="center" style="">StayRated</h1>
<h3 align="center" style="">Contributors: <a href="https://github.com/RaviPrakash1264">@RaviPrakash1264</a></h3>
<h4 align="center">This project is a comprehensive microservices-based solution designed to manage the hotels and their ratings
by different users. It consists of five key microservices: UserService, HotelService, RatingService, ConfigServer,
and ApiGateway, each addressing specific functionalities. The system enables dynamic service discovery and registration 
through Eureka Server, ensuring scalability and fault tolerance. Inter-service communication is implemented using Feign Client,
while the Spring Cloud Gateway acts as a centralized entry point for routing and rate-limiting requests. The application 
integrates Resilience4j for circuit breaker patterns and rate limiting to enhance fault tolerance. Security is fortified with
Okta for OAuth 2.0 authentication and Spring Security for role-based access control. Centralized configuration is managed using
Spring Cloud Config Server, allowing dynamic updates without restarting services.   
</h4>
<p align="center">
<img src="https://i.ibb.co/BfMRqS2/DALL-E-2024-12-29-20-12-40-A-fun-and-cartoonish-logo-for-a-hotel-and-rating-management-system-The-de.webp" alt="Logo" height="200" width="200">
</p>
<h2 align="center">MICROSERVICES</h2>
<p><strong>• UserService: </strong>Handles user-related operations, which includes
creation of user with name,email and description about the user.
In addition to this it manages the list of ratings given by a particular user with hotelId,name,location
and summary about the hotel.It also helps in giving
the list of users along with their details</p>
<p><strong>• HotelService: </strong>Handles hotel-related operations, which includes
creation of hotel with name,location and summary about the hotel.
It also manages the list of hotels and give details
about a particular hotel as well.</p>
<p><strong>• RatingService: </strong>Handles rating-related operations, which includes
creation of ratings with userId,hotelId,rating out of 10 and 
feedback about the particular hotel.It also lists down the
the ratings based on userId and hotelId.</p>
<p><strong>• ConfigServer: </strong>Provides centralized configuration
management for all microservices.</p>
<p><strong>• ApiGateway: </strong>Serves as the entry point for all
client requests and handles routing.</p>




<h2 align="center">TECH STACK USED</h2>
<p><strong>• Programming Language: </strong>Java</p>
<p><strong>• Frameworks: </strong>Spring boot,Spring cloud</p>
<p><strong>• Tools: </strong>Eureka, Feign Client, Spring Cloud Gateway, Spring Cloud Config,
Resilience4j, Okta</p>
<p><strong>• Build Tool: </strong>Maven</p>

<h2 align="center">KEY FEATURES</h2>
<p><strong>• Service Discovery: </strong>Implemented using <b>Eureka Server</b> for dynamic registration and
discovery of microservices.</p>
<p><strong>• API Gateway: </strong>Centralized entry point with <b>Spring Cloud Gateway</b>,
enabling routing, security, and rate limiting.</p>
<p><strong>• Inter-Service Communication: </strong>Leveraged <b>Feign Client</b> for
declarative REST client communication..</p>
<p><strong>• Centralized Configuration: </strong>Managed using <b>Spring Cloud Config Server</b>,
enabling externalized and dynamic configuration.</p>
<p><strong>• Fault Tolerance: </strong>Integrated <b>Resilience4j</b> for
circuit breaker patterns to handle service failures gracefully.Applied rate limiting to ensure system
stability under high traffic.</p>
<p><strong>• Security: </strong>Secured using <b>Okta</b> for <b>OAuth 2.0</b> and
<b>Spring Security</b> for role-based access control.</p>


<h2 align="center">ARCHITECTURE OF THE PROJECT</h2>
<p align="center">
<img src="https://i.ibb.co/PgqXkjh/Screenshot-2024-12-30-212057.jpg" alt="Untitled" border="0">
</p>
<h2 align="center">REFERENCES</h2>

<ul>
<li>
SPRING BOOT DOCUMENTATION - 
https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/
</li>
<li>
SPRING CLOUD NETFLIX -
https://cloud.spring.io/spring-cloud-netflix/reference/html/
</li>
 <li>
HIBERNATE DOCUMENTATION -
https://hibernate.org/orm/documentation/6.2/
</li>
<li>
STACKOVERFLOW FOR FIXING BUGS -
https://stackoverflow.com/
</li>
<li>
JWT DOCUMENTATION -
https://jwt.io/introduction
</li>
<li>
RESILIENCE4j -
https://resilience4j.readme.io/docs/getting-started
</li>
<li>
SPRING CLOUD CONFIG -
https://docs.spring.io/spring-cloud-config/docs/current/reference/html/
</li>
<li>
SPRING CLOUD GATEWAY -
https://spring.io/projects/spring-cloud-gateway
</li>
<li>
OKTA DEVELOPER -
https://developer.okta.com/docs/guides/protect-your-api/springboot/main/
</li>
</ul>