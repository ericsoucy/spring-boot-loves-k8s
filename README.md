# Spring Boot Loves K8s

Based on
<https://www.youtube.com/watch?v=wBtUIkMgzU8>

http://localhost:8080/actuator/health
http://localhost:8080/

```
mvn package
buildah --tls-verify=false --layers=true -f Dockerfile bud -t spring-boot-loves-k8s-image
wget https://github.com/wagoodman/dive/releases/download/v0.9.2/dive_0.9.2_linux_amd64.deb
dive podman://spring-boot-loves-k8s-image

```