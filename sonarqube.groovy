job('sonar'){
    
    logRotator(numToKeep = 10)
    scm {
        github('neiljbrown/java11-examples', 'master')
    }
    steps {	   
        shell('''#!/bin/bash
mvn clean package sonar:sonar -Dsonar.host.url=http://18.117.224.233:9000  -Dsonar.login=b5507cd231d76993946d25c67dcab91adfd02e98 -Dsonar.projectKey=Sonarqube -Dsonar.projectName=DSLsonar''')
}
}
