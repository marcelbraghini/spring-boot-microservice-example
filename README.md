# spring-boot-microservice-example

### Up server

```bash
./mvnw clean compile spring-boot:run
```

```bash
curl --location --request GET 'localhost:8080/v1/user/all'
```

### Up mongodb

```bash
docker run --name mongodb -p 27017:27017 -e MONGO_INITDB_ROOT_USERNAME=user -e MONGO_INITDB_ROOT_PASSWORD=pass mongo
```

### MongoDB Collection

```bash
{
    "age" : 33,
    "name" : "Marcel Braghini",
    "userName" : "marcel.braghini",
    "languages" : [ 
        "Java", 
        "nodeJs", 
        "Python"
    ]
}
```