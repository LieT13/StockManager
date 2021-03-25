[![codecov](https://codecov.io/gh/LieT13/StockManager/branch/develop/graph/badge.svg)](https://codecov.io/gh/LieT13/StockManager)

# Stock Manager

## Running the application

```java
java -Dspring.profiles.active=<profile> -jar target/stockmanager-<version>.jar
```

### Profiles
#### local
- Static implementation of the products list

#### prod
- Mongo implementation of the products list (TODO)
