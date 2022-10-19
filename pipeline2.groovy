## Created for checking build pipeline view ##


job('pipe1') {
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
