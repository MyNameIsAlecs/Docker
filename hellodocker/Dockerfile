FROM eclipse-temurin:11 as rafa
COPY      src/ /hello/src
WORKDIR   /hello
RUN       javac -d ./build src/Main.java
WORKDIR   /hello/build
RUN       jar cfe hellodocker.jar Main Main.class




FROM eclipse-temurin:11
COPY      --from=rafa /hello/build/hellodocker.jar  /hd/hellodocker.jar
CMD       java -jar /hd/hellodocker.jar