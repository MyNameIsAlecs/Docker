FROM      gradle:jdk11
COPY      ./app/ /app45
RUN       ls /app45
WORKDIR   /app45
RUN       gradle build
RUN       ls /app45/build/libs/
CMD       java -jar /app45/build/libs/app45.jar