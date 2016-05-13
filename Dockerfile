FROM tomcat
MAINTAINER Srikanth Nutigattu <srikanth.nutigattu@gmail.com>

RUN apt-get update
# RUN apt-get install -y git
RUN apt-get install -y aptitude && aptitude install -y openjdk-7-jdk
# RUN apt-get install -y openjdk-7-jdk --fix-missing
RUN apt-get install -y dos2unix

ENV JAVA_HOME /usr/lib/jvm/java-7-openjdk-amd64

#TODO add environmental variables for connecting to db. which are used in connection string in grails db config


#should mount app-folder as volume
# RUN cd /grails-petclinic && dos2unix grailsw && ./grailsw war


# doesn't work with volumes. as they can be only attached runtime.
# RUN cp /grails-petclinic/target/*.war /usr/local/tomcat/webapps/ && cd /usr/local/tomcat/bin

# CMD [“catalina.sh”, “run”]