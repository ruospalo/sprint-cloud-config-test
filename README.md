
# sprint-cloud-config-test 

The following listing shows a recipe for creating the git repository in the preceding example:

## Create git repository

```shell
$ cd $HOME
$ mkdir config-repo
$ cd config-repo
$ git init .
$ echo info.foo: bar > application.properties
$ git add -A .
$ git commit -m "Add application.properties"
```

## Run server 
From the root of the project:

```shell
$ cd server
$ mvn spring-boot:run
```

## Run client

Open a new terminal and from the root of the project:

```shell
$ cd client
$ mvn spring-boot:run
```


## Call to refresh actuator on client

Open a new terminal and:

```shell
$ curl -X POST http://localhost:8080/actuator/refresh
```
