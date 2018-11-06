travis ![Travis-CI Build](https://travis-ci.org/tatorodrigo/spring-boot-docker-k8s.svg?branch=master)

# spring-boot-docker-k8s

Sample project to show Continuous Integration (CI)/ Continuous Delivery (CD) using Spring Boot, Docker, Travis, Heroku and Kubernetes.

## /app folder

Contains the Spring Boot application to serve simple endpoints that returns "Hello" strings.

Also contains a gradle docker plugin to build an image and push it to Docker Hub. To do so, environment variables `DOCKER_USERNAME`, `DOCKER_PASSWORD` and `DOCKER_EMAIL` must be set.
