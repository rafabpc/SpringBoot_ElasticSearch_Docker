
# How to Run

## 1 - Build the APP

```mvn clean compile install```


## 2 - Dockerize ElasticSearch

```docker pull docker.elastic.co/elasticsearch/elasticsearch:7.9.3```


## 3 - Build the APP docker image

```docker build -f Dockerfile -t application-example:1.0 .```


## 4 - Run the docker-compose.yml

```docker-compose up```


## 5 - Executing the application

```In Progress ```


# Docker
The configuration for Docker can be seen in:

```Dockerfile```

```docker-compose.yml```


# ElasticSearch

To run ElasticSearch into the docker container, there is a need of container configuration:

```wsl -d docker-desktop```

```sysctl -w vm.max_map_count=262144```

The configuration for ElasticSearch can be seen in:

```src > main > resources > application.properties```

```docker-compose.yml```

# TODO
I am facing an issue to connect the app with the ElasticSearch inside the docker container.

The connection is refused.

I believe it might be something with some of these options:
* Port
* Host
* Deprecated versions (I am still studying new versions)

