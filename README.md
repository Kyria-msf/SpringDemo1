# Sprind Demo 1

### INTRODUCTION 
- ![#f03c15](https://via.placeholder.com/15/f03c15/000000?text=+) `Inversion Of Control (IOC)`
- ![#c5f015](https://via.placeholder.com/15/c5f015/000000?text=+) `Dependency Injection`
- ![#1589F0](https://via.placeholder.com/15/1589F0/000000?text=+) `Spring Annotation`

### DEVELOPMENT 
1. ![#f03c15](https://via.placeholder.com/15/f03c15/000000?text=+) `Inversion Of Control (IOC)`

Spring framework creates and manages objects for us. 
What we have to create are only classes and Spring will take care of our object's creation and managing 
All the objects that the spring creates and manages inside IOC container are called spring beans. 
That means a Spring Bean is actually an object. 
If you want to use the objects that spring has create for you use getBean(‘a’); 
Beans are objects that are inside the IOC Container 

###### There are two types of IOC Containers (also called interface): 
- BeanFactory 
- ApplicationContext 

2. ![#c5f015](https://via.placeholder.com/15/c5f015/000000?text=+) `Dependency`?

It is something I depend on, 
For me to be happy: 
If my family is happy, I am happy, so my family is a dependency. 
My job is my dependency, If I have a job I will have food, because it will provide me with money to buy food. 
To drive a car, I need a driving license  
If I want to go back to my country I will need a passport, so passport is my dependency. 

##### Type of Dependencies: 

- Dependencies in form of literals 

- Dependencies in the form of objective 

3. ![#1589F0](https://via.placeholder.com/15/1589F0/000000?text=+) `Annotation`

- - ![#f03c15](https://via.placeholder.com/15/f03c15/000000?text=+) `@Autowire`
- - ![#c5f015](https://via.placeholder.com/15/c5f015/000000?text=+) `@Value`
- - ![#1589F0](https://via.placeholder.com/15/1589F0/000000?text=+) `@Component`
- - ![#f03c15](https://via.placeholder.com/15/f03c15/000000?text=+) `@ComponentScan`
- - ![#c5f015](https://via.placeholder.com/15/c5f015/000000?text=+) `@Configuration`


- ![#f03c15](https://via.placeholder.com/15/f03c15/000000?text=+) `Auto wiring `

If the dependencies are not configured 

Will wire automatically you indecency and inject the value 

Autowire = “byName” any dependency that has the specific name and wired it. Gives it the id name of the dependency. 

Private Kyia name = new Kyria() 

Autowire = “ByType” : Means whenever they have the class name and the type match 

Autowire = “constructor”:  Use the dependency  

@Autowire // It is not possible for primitive but only for objects, how could spring know what data to enter 

@Autowire means Inject 
- ![#c5f015](https://via.placeholder.com/15/c5f015/000000?text=+) ` @Qualifier: When you have multiple implementation and spring does not know what to use, and the specify the object you want `

```
How @Autowired works? 

First it try to inject the dependency with “byType” 

If byTYPE fails then it goes with “byName 

Autowired in front of the field you do not need setters 
```

- ![#1589F0](https://via.placeholder.com/15/1589F0/000000?text=+) `@Value()`

Can only be used before the field, property, dependency 

@Value(“${student.name}”) 

Private String name; 

- ![#f03c15](https://via.placeholder.com/15/f03c15/000000?text=+) ` @Component: It creates an object for us and register that object it in the IC Containers or Application context `

 @Component(“collegeBean”) 

If you do not define the default id the id will be the name of the class in lowercase 

- ![#c5f015](https://via.placeholder.com/15/c5f015/000000?text=+) `@Configuration: Which tells spring that this is our configuration file.`

- ![#1589F0](https://via.placeholder.com/15/1589F0/000000?text=+) `@ComponentScan: helps to scan where the  component is so that it can create an object for it.` 

- ![#f03c15](https://via.placeholder.com/15/f03c15/000000?text=+) `@Bean  There is another way to create a bean using “@Bean” Annotation` 

The collegeBean()  will be actually the name of our Bean 

- ![#f03c15](https://via.placeholder.com/15/f03c15/000000?text=+) `@Configuration` 

```
@ComponentScan(basePackages = "AnnotationFinal") 

public class CollegeConfig { 

@Bean 

public College collegeBean() // the method name will be the id of the particular “bean” 

{ 

College college = new College(); 

return college; 
//return new College(); 

} 

} 

YOU CAN OVERRIDE THE BEAN BY GIVING THIS PARTICULAR NAME 

@Bean(name=”colBean”) 

You can provide multiple alias to a particular “bean” too 

@Bean(name = {“colBean”, “ ”}) 

You do not need @ComponentScan when using bean annotation 

```
