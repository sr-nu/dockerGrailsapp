FROM tomcat
MAINTAINER Srikanth Nutigattu <srikanth.nutigattu@gmail.com>

RUN apt-get update && apt-get install -y aptitude && aptitude install -y openjdk-7-jdk && apt-get install -y dos2unix

ENV JAVA_HOME /usr/lib/jvm/java-7-openjdk-amd64

# --------------------------end of srik/dev-image ----------------------------------

#should mount app-folder as volume
# RUN cd /grails-petclinic && dos2unix grailsw && ./grailsw war

# doesn't work with volumes. as they can be only attached runtime.
# RUN cp /grails-petclinic/target/*.war /usr/local/tomcat/webapps/ && cd /usr/local/tomcat/bin

# CMD [“catalina.sh”, “run”]