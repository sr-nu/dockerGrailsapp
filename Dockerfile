FROM tomcat
MAINTAINER Srikanth Nutigattu <srikanth.nutigattu@gmail.com>

# RUN apt-get update
# RUN apt-get install -y git
# RUN apt-get install -y openjdk-7-jdk
# RUN apt-get install -y dos2unix

# ENV JAVA_HOME /usr/lib/jvm/java-7-openjdk-amd64

#should mount app-folder as volume
# RUN cd /grails-petclinic && dos2unix grailsw && ./grailsw war
# RUN cp /grails-petclinic/target/*.war /usr/local/tomcat/webapps/
# RUN cd /usr/local/tomcat/bin

ADD https://dl.dropboxusercontent.com/s/kim7mbdegr1se17/petclinic-0.2.war?dl=0 /usr/local/tomcat/webapps/app.war
RUN chmod 666 /usr/local/tomcat/webapps/*.war

RUN  cd /usr/local/tomcat/bin

CMD ["catalina.sh","run"]