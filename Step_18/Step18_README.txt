In this video, let's look at something called CDI, Context and Dependency Injection.

Spring framework introduced this concept called Dependency Injection. And also, it introduced something called IoC container, Inversion of Control container. So, CDI tries to standardize this
as part of the Java EE. So, CDI is like the interface. It defines the different annotations. So, it says: 
	@Inject(@Autowired), 
	@Named(@Component & @Qualifier), 
	@Singleton(Defines a scope of Singleton).
These are the different annotations, which needs to be used. And this CDI implementation frameworks would provide the functionality. A comparable thing would be JPA and Hibernate. So, JPA is a interface. Java Persistence API defines the API, and Hibernate understands the API, which is defined by JPA and provides the implementation for that. Similar to that, CDI is a interface defining how to do Dependency Injection. It says, if I want to auto-wire something in,
then you'd need to use @Inject. If you'd want to do @Named, that means you are defining a component. So, the comparable Spring annotation for CDI @Named, is @Component and the comparable for @Inject is @Autowired. So, CDI tried to define common annotations to use with Dependency Injection.