job('example1') {
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
            
            mavenOpts('-Xms256m')
            mavenOpts('-Xmx512m')

        }
    }       
}
