job('example0') {
    logRotator(10)
        scm {
        github('neiljbrown/java11-examples', 'master')
    }
    triggers {
        githubPush()
    }
    steps {
            maven {
            goals('clean')
            goals('install')
            mavenInstallation('Maven_HOME')
            mavenOpts('-Xms256m')
            mavenOpts('-Xmx512m')

        }
    }       
}
job('example2') {
    logRotator(10)
     
    steps {
         
         shell('''
             mvn -v
              touch test''')
         }
}
