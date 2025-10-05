# spring-boot-docker

## Run
```bash
# Java 실행
java -jar build/lib/lg06.<VERSION>.jar 

sudo docker run -d -p 8080:8080 -name spring-boot-docker stayonasdev/spring-boot-docker0.3.0
```

## Build
``` bash
./gralew clean bootJar
```

## Remote Run
```bash
scp -i <KEY.pem> start.sh ubuntu@<SERVER_IP>:~/app/spring-rest-api

scp -i <KEY.pem> ubuntu@<SERVER_IP> "cd /home/ubuntu/app/spring-rest-api;pwd;./start.sh:"
```

Remote Stop
```bash
scp -i <KEY.pem> stop.sh ubuntu@<SERVER_IP>:~/app/spring-rest-api

scp -i <KEY.pem> ubuntu@<SERVER_IP> "cd /home/ubuntu/app/spring-rest-api;pwd;./stop.sh:"
```

## Dockerizing
- https://spring.io/guides/gs/spring-boot-docker
<<<<<<< HEAD
- openJDK 17
=======
--openJDK 17


>>>>>>> @{-1}
