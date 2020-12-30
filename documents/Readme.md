[1] Maven proxy
    C:\apache-maven-3.6.3\conf\settings.xml
    &&
    C:\Users\v0cn140\.m2\settings.xml
        <proxies>
            <proxy>
                <id>optional</id>
                <active>true</active>
                <protocol>http</protocol>
                <username>VCN\*******</username>
                <password>*********</password>
                <host>httppxsait.srv.volvo.com</host>
                <port>8080</port>
                <nonProxyHosts>local.net|some.host.com</nonProxyHosts>
            </proxy>
        </proxies>
        <mirrors>
            <mirror>
                <id>alimaven</id>
                <mirrorOf>central</mirrorOf>
                <name>aliyun maven</name>
                <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
            </mirror>
        </mirrors>    

[2] IDEA
    File->Settings...->Editor->File and Code Templates->File Header:
        /**
         * Copy Right (C), 2020-${YEAR}, Entrebean.com
         * Filename: ${NAME}
         * Author: Lin, Song
         * Date: ${DATE} ${TIME}
         * Description: ${DESCRIPTION}
        */

[3] Maven->Package
    C:\repo\2021\BootCamp\target>java -jar demo-0.0.1.jar
        ==> http://localhost:8080/getVersion
        ==> http://localhost:8080/getAuthor

[4] 

