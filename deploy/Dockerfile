FROM tomcat
MAINTAINER Srikanth Nutigattu <srikanth.nutigattu@gmail.com>


# TODO: Replace the below with parameterised repository url or directly pass ci artifact uri


ADD https://dl.dropboxusercontent.com/s/kim7mbdegr1se17/petclinic-0.2.war?dl=0 /usr/local/tomcat/webapps/app.war
RUN chmod 666 /usr/local/tomcat/webapps/*.war

RUN  cd /usr/local/tomcat/bin

CMD ["catalina.sh","run"]