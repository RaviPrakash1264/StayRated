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


<h2 align="center">LAYERED ARCHITECTURE USED IN THE PROJECT</h2>
<p align="center">
<img src="https://i.ibb.co/fNLwL2y/Layered-Architecture.jpg" alt="Untitled" border="0">
</p>
<h2 align="center">ER Diagram</h2>
<p align="center">
<img src="https://i.ibb.co/4TNyTWj/ER-Diagram.jpg" alt="Untitled" border="0">
</p>
<h2 align="center">LIST OF BACKEND FEATURES/MODULES</h2>
<p align="center">
<img src="https://i.ibb.co/zb5FNVP/Backend-modules.jpg" alt="Untitled" border="0">
</p>
<h2 align="center">SCREENSHOTS</h2>
<h3>1. REGISTER NEW USER WITH INPUT VALIDATION</h3>

<p align="center">
• INPUT VALIDATION
</p>
<p align="center">
<img src="https://i.ibb.co/rG37cjP/Register.jpg" alt="Picture2" border="0">
</p>
<p align="center">
• SUCCESSFUL REGISTRATION 
</p>
<p align="center">
<img src="https://i.ibb.co/820Vq7D/Register2.jpg" alt="Picture2" border="0">
</p>
<h3>2. LOGIN WITH EXCEPTION HANDLING AND GENERATING JWT TOKEN</h3>

<p align="center">
• EXCEPTION HANDLING
</p>
<p align="center">
<img src="https://i.ibb.co/DQPMYCW/login1.jpg" alt="Picture2" border="0">
</p>
<p align="center">
• SUCCESSFUL LOGIN
</p>
<p align="center">
<img src="https://i.ibb.co/Jdgq0tt/login2.jpg" alt="Picture6" border="0">
</p>
<h3>3. ADD,UPDATE,FETCH AND DELETE CATEGORIES WITH INPUT VALIDATION AND EXCEPTION HANDLING</h3>

<p align="center">
• INPUT VALIDATION
</p>
<p align="center">
<img src="https://i.ibb.co/5MHBQCD/Category1.jpg" alt="Picture8" border="0">
</p>
<p align="center">
• ADDING CATEGORIES
</p>
<p align="center">
<img src="https://i.ibb.co/BPtmVTb/Category2.jpg" alt="Picture8" border="0">
</p>
<p align="center">
• UPDATING CATEGORIES BY ID
</p>
<p align="center">
<img src="https://i.ibb.co/MhqxZKw/Category3.jpg" alt="Picture5" border="0">
</p>
<p align="center">
• GETTING CATEGORIES BY ID
</p>
<p align="center">
<img src="https://i.ibb.co/W2gnbRr/Category4.jpg" alt="Picture5" border="0">
</p>
<p align="center">
• GETTING LIST OF CATEGORIES
</p>
<p align="center">
<img src="https://i.ibb.co/mRBkHzT/Category5.jpg" alt="Category5" alt="Picture5" border="0">
</p>
<p align="center">
• DELETING CATEGORIES BY ID
</p>
<p align="center">
<img src="https://i.ibb.co/4gcd7vT/Category6.jpg" alt="Picture5" border="0">
</p>
<h3>4. ADD,UPDATE,FETCH AND DELETE POSTS WITH CATEGORY AND USER ID</h3>

<p align="center">
• ADDING POST BY CATEGORY AND USER ID
</p>
<p align="center">
<img src="https://i.ibb.co/g9H2f0k/post1.jpg" border="0">
</p>
<p align="center">
• GETTING POSTS BY USER ID
</p>
<p align="center">
<img src="https://i.ibb.co/19B43QF/post2.jpg" border="0">
</p>
<p align="center">
• GETTING POSTS BY CATEGORY ID
</p>
<p align="center">
<img src="https://i.ibb.co/Xx0qb8s/post3.jpg" border="0">
</p>
<p align="center">
• GETTING LIST OF POSTS
</p>
<p align="center">
<img src="https://i.ibb.co/yVhcQHy/post4.jpg" border="0">
</p>
<p align="center">
• GETTING POST BY ID
</p>
<p align="center">
<img src="https://i.ibb.co/stnjy0p/post5.jpg" border="0">
</p>
<p align="center">
• UPDATING POST BY ID
</p>
<p align="center">
<img src="https://i.ibb.co/VDrW4hV/post6.jpg" border="0">
</p>
<p align="center">
• DELETING POST BY ID
</p>
<p align="center">
<img src="https://i.ibb.co/LSBnbK1/post7.jpg" border="0">
</p>
<h3>5. PAGINATION</h3>

<p align="center">
• GETTING POST BY PAGE NUMBER AND PAGE SIZE
</p>
<p align="center">
<img src="https://i.ibb.co/gPbySLF/pagination1.jpg" border="0">
</p>

<p align="center">
<img src="https://i.ibb.co/1fB1WfL/pagination2.jpg" border="0">
</p>
<h3>6. SORTING</h3>

<p align="center">
• SORTING POST BY POST ID AND IN ASCENDING ORDER
</p>
<p align="center">
<img src="https://i.ibb.co/MctPftz/sorting1.jpg" border="0">
</p>
<p align="center">
• SORTING POST BY POST TITLE AND IN DESCENDING ORDER
</p>
<p align="center">
<img src="https://i.ibb.co/Qk6S8dR/sorting2.jpg" border="0">
</p>
<h3>7. SEARCHING</h3>

<p align="center">
<img src="https://i.ibb.co/Jq6Zy2G/search1.jpg" border="0">
</p>
<h3>8. ADDING AND FETCHING IMAGE</h3>

<p align="center">
• ADDING IMAGE BY POST ID
</p>
<p align="center">
<img src="https://i.ibb.co/ZWXXVdd/image1.jpg" border="0">
</p>
<p align="center">
• FETCHING IMAGE BY IMAGE NAME
</p>
<p align="center">
<img src="https://i.ibb.co/yQ30LgQ/image2.jpg" border="0">
</p>
<h3>9. ADD and DELETE COMMENTS</h3>

<p align="center">
• ADDING COMMENTS BY POST ID
</p>
<p align="center">
<img src="https://i.ibb.co/4KMnMDG/comment1.jpg" border="0">
</p>
<p align="center">
• DELETING COMMENTS BY COMMENT ID
</p>
<p align="center">
<img src="https://i.ibb.co/bPx2QC0/comment2.jpg" border="0">
</p>
<h3>10. ROLE BASED AUTHORIZATION</h3>

<p align="center">
• DELETING USING NORMAL USER
</p>
<p align="center">
<img src="https://i.ibb.co/8xn9WJT/role-based1.jpg" border="0">
</p>
<p align="center">
• DELETING USING ADMIN USER
</p>
<p align="center">
<img src="https://i.ibb.co/QfDXL7J/role-based2.jpg" border="0">
</p>
<h3>11. APIS DOCUMENTATION USING SWAGGER</h3>

<p align="center">
<img src="https://i.ibb.co/R9BPmC4/swagger1.jpg" border="0">
</p>
<p align="center">
<img src="https://i.ibb.co/bvPSQPd/swagger2.jpg" border="0">
</p>

<h2 align="center">REFERENCES</h2>

<ul>
<li>
SPRING BOOT DOCUMENTATION
https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/
</li>
<li>
SWAGGER DOCUMENTATION
https://swagger.io/docs/
</li>
 <li>
HIBERNATE DOCUMENTATION
https://hibernate.org/orm/documentation/6.2/
</li>
<li>
STACKOVERFLOW FOR FIXING BUGS
https://stackoverflow.com/
</li>
<li>
JWT DOCUMENTATION
https://jwt.io/introduction
</li>
</ul>