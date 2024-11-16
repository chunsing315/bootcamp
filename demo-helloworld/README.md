## Maven

### Lombok
1.  Project -> maven (pom.xml) -> add a new dependency  -> lombok
2. ` 
    mvn compile 
    `
    -> download classes (Getter,Setter,ToString, etc...)

2.  inject all those classes into your maven project
4. Annotate "@Getter" in your class -> import those classes into your class
- Java Compile-time vs Lombok
- Java doesn't understand the meaning of @Getter
- Lombok Library "teach" Java compiler how to convert to Java code before compile


