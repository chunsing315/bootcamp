# Workflow

1.  Delete .mvn folder
2.  change folder application.yml. port 8080
3.
4.  Controller Layer
    -define restfulApi: 1. Get 6. Post 7. Put 8. Patch 9. Delete

- three types of input Param:
    1.  @PathVariable -> "{endpoint}/pathA/pathB"

    1.  @RequestParam -> "?param1=xxx&param2=yyy "
    1.  @RequestBody -> Input JSON. We need to create an Object in Java by Class

        ```
        User createNewUser(@RequestBody UserRequest userForm);
        ```

    Step to input JSON in postman : Body -> raw -> JSON

        ```
        {
            "name": "Testing 2",
            "email": "Test@email.com",
            "phone": "TestPhone"
        }
        ```

# Make sure without ERROR

search "caused by" if err

## Key mistakes

- Don't forget the @RestController, @Service annotation in these layer
- Autowired, make sure it is @Bean -> @Controller/ @Service / @Repository / @Component in class level
- to make an object -> bean, @Bean: e.g. RestTemplate
