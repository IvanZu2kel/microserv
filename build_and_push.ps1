docker build . -t ivancz/microserv:1
docker push ivancz/microserv:1
docker run -ti --rm -e DATASOURCE_HOST=192.168.1.33 -p 8081:8080  ivancz/microserv:1
